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

package adwords.axis.v201609.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.axis.v201609.mcm.CustomerServiceInterface;
import com.google.api.ads.adwords.axis.v201609.mcm.ServiceLink;
import com.google.api.ads.adwords.axis.v201609.mcm.ServiceLinkLinkStatus;
import com.google.api.ads.adwords.axis.v201609.mcm.ServiceLinkOperation;
import com.google.api.ads.adwords.axis.v201609.mcm.ServiceType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example accepts a pending invitation to link your AdWords account to a Google Merchant
 * Center account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AcceptServiceLink {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServices adWordsServices = new AdWordsServices();

    long serviceLinkId = Long.parseLong("INSERT_SERVICE_LINK_ID_HERE");

    runExample(adWordsServices, session, serviceLinkId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long serviceLinkId)
      throws Exception {
    // Get the CustomerService.
    CustomerServiceInterface customerService =
        adWordsServices.get(session, CustomerServiceInterface.class);

    // Create the operation to set the status to ACTIVE.
    ServiceLinkOperation op = new ServiceLinkOperation();
    op.setOperator(Operator.SET);
    ServiceLink serviceLink = new ServiceLink();
    serviceLink.setServiceLinkId(serviceLinkId);
    serviceLink.setServiceType(ServiceType.MERCHANT_CENTER);
    serviceLink.setLinkStatus(ServiceLinkLinkStatus.ACTIVE);
    op.setOperand(serviceLink);

    // Update the service link.
    ServiceLink[] mutatedServiceLinks =
        customerService.mutateServiceLinks(new ServiceLinkOperation[] {op});

    // Display the results.
    for (ServiceLink mutatedServiceLink : mutatedServiceLinks) {
      System.out.printf(
          "Service link with service link ID %d, type '%s' updated to status: %s.%n",
          mutatedServiceLink.getServiceLinkId(),
          mutatedServiceLink.getServiceType(),
          mutatedServiceLink.getLinkStatus());
    }
  }
}
