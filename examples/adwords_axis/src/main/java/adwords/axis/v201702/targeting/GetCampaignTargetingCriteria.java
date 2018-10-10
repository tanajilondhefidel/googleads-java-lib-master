// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201702.targeting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201702.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201702.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201702.cm.CampaignCriterionPage;
import com.google.api.ads.adwords.axis.v201702.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201702.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201702.cm.CampaignCriterionField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to retrieve all the campaign criteria. To add
 * campaign criteria, run AddCampaignTargetingCriteria.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCampaignTargetingCriteria {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws Exception {
    // Get the CampaignService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    int offset = 0;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector = builder
        .fields(
            CampaignCriterionField.CampaignId,
            CampaignCriterionField.Id,
            CampaignCriterionField.CriteriaType,
            CampaignCriterionField.PlatformName,
            CampaignCriterionField.LanguageName,
            CampaignCriterionField.LocationName,
            CampaignCriterionField.KeywordText)
        .in(CampaignCriterionField.CriteriaType, "KEYWORD", "LANGUAGE", "LOCATION", "PLATFORM")
        .offset(0)
        .limit(PAGE_SIZE)
        .build();

    CampaignCriterionPage page = null;
    do {
      page = campaignCriterionService.get(selector);

      if (page.getEntries() != null) {
        // Display campaigns.
        for (CampaignCriterion campaignCriterion : page.getEntries()) {
          System.out.printf("Campaign criterion with campaign ID %d, criterion ID %d, "
              + "and type '%s' was found.%n", campaignCriterion.getCampaignId(), campaignCriterion
              .getCriterion().getId(), campaignCriterion.getCriterion().getCriterionType());
        }
        Thread.sleep(1000);
      } else {
        System.out.println("No campaign criteria were found.");
      }
      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
    } while (offset < page.getTotalNumEntries());
  }
}
