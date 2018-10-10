// Copyright 2015 Google Inc. All Rights Reserved.
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

package dfp.axis.v201611.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201611.StatementBuilder;
import com.google.api.ads.dfp.axis.v201611.AdUnit;
import com.google.api.ads.dfp.axis.v201611.AdUnitPage;
import com.google.api.ads.dfp.axis.v201611.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201611.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sets a placement's ad units without fetching the entire
 * placement. The ad units will override the current placement settings,
 * not append to them.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AssignAdUnitsToPlacement {

  // Set the ad unit ID to set on placement.
  private static final String AD_UNIT_ID = "INSERT_AD_UNIT_ID_HERE";

  // Set the placement ID to set the ad units for.
  private static final String PLACEMENT_ID = "INSERT_PLACEMENT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      String adUnitId, long placementId) throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select ad units.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", adUnitId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (AdUnit adUnit : page.getResults()) {
          System.out.printf(
              "%d) Ad unit with ID '%s' and name '%s' will be assigned to placement.%n", i++,
              adUnit.getId(), adUnit.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of ad units to be assigned to placement: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201611.AssignAdUnitsToPlacement action =
          new com.google.api.ads.dfp.axis.v201611.AssignAdUnitsToPlacement();
      action.setPlacementId(placementId);

      // Perform action.
      UpdateResult result =
          inventoryService.performAdUnitAction(action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf(
            "Number of ad units to be assigned to placement: %d%n", result.getNumChanges());
      } else {
        System.out.println("No ad units were assigned to placement.");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, AD_UNIT_ID, Long.parseLong(PLACEMENT_ID));
  }
}
