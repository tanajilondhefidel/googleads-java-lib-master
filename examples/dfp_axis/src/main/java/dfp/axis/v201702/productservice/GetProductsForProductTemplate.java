// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201702.productservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201702.StatementBuilder;
import com.google.api.ads.dfp.axis.v201702.Product;
import com.google.api.ads.dfp.axis.v201702.ProductPage;
import com.google.api.ads.dfp.axis.v201702.ProductServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all products created from a product template.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetProductsForProductTemplate {

  private static final String PRODUCT_TEMPLATE_ID = "INSERT_PRODUCT_TEMPLATE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long productTemplateId)
      throws Exception {
    ProductServiceInterface productService =
        dfpServices.get(session, ProductServiceInterface.class);

    // Create a statement to select products.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("productTemplateId = :productTemplateId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("productTemplateId", productTemplateId);

    // Retrieve a small amount of products at a time, paging through
    // until all products have been retrieved.
    int totalResultSetSize = 0;
    do {
      ProductPage page =
          productService.getProductsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each product.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Product product : page.getResults()) {
          System.out.printf(
              "%d) Product with ID %d and name '%s' was found.%n",
              i++,
              product.getId(),
              product.getName()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(PRODUCT_TEMPLATE_ID));
  }
}
