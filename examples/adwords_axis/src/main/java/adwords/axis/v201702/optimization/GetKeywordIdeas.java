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

package adwords.axis.v201702.optimization;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201702.cm.Language;
import com.google.api.ads.adwords.axis.v201702.cm.NetworkSetting;
import com.google.api.ads.adwords.axis.v201702.cm.Paging;
import com.google.api.ads.adwords.axis.v201702.o.Attribute;
import com.google.api.ads.adwords.axis.v201702.o.AttributeType;
import com.google.api.ads.adwords.axis.v201702.o.IdeaType;
import com.google.api.ads.adwords.axis.v201702.o.IntegerSetAttribute;
import com.google.api.ads.adwords.axis.v201702.o.LanguageSearchParameter;
import com.google.api.ads.adwords.axis.v201702.o.LongAttribute;
import com.google.api.ads.adwords.axis.v201702.o.NetworkSearchParameter;
import com.google.api.ads.adwords.axis.v201702.o.RelatedToQuerySearchParameter;
import com.google.api.ads.adwords.axis.v201702.o.RequestType;
import com.google.api.ads.adwords.axis.v201702.o.SearchParameter;
import com.google.api.ads.adwords.axis.v201702.o.StringAttribute;
import com.google.api.ads.adwords.axis.v201702.o.TargetingIdea;
import com.google.api.ads.adwords.axis.v201702.o.TargetingIdeaPage;
import com.google.api.ads.adwords.axis.v201702.o.TargetingIdeaSelector;
import com.google.api.ads.adwords.axis.v201702.o.TargetingIdeaServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.util.Map;

/**
 * This example gets keywords related to a seed keyword.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetKeywordIdeas {

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
    // Get the TargetingIdeaService.
    TargetingIdeaServiceInterface targetingIdeaService =
        adWordsServices.get(session, TargetingIdeaServiceInterface.class);

    // Create selector.
    TargetingIdeaSelector selector = new TargetingIdeaSelector();
    selector.setRequestType(RequestType.IDEAS);
    selector.setIdeaType(IdeaType.KEYWORD);
    selector.setRequestedAttributeTypes(new AttributeType[] {
        AttributeType.KEYWORD_TEXT,
        AttributeType.SEARCH_VOLUME,
        AttributeType.CATEGORY_PRODUCTS_AND_SERVICES});

    // Set selector paging (required for targeting idea service).
    Paging paging = new Paging();
    paging.setStartIndex(0);
    paging.setNumberResults(10);
    selector.setPaging(paging);

    // Create related to query search parameter.
    RelatedToQuerySearchParameter relatedToQuerySearchParameter =
        new RelatedToQuerySearchParameter();
    relatedToQuerySearchParameter.setQueries(new String[] {"mars cruise"});

    // Language setting (optional).
    // The ID can be found in the documentation:
    //   https://developers.google.com/adwords/api/docs/appendix/languagecodes
    // See the documentation for limits on the number of allowed language parameters:
    //   https://developers.google.com/adwords/api/docs/reference/latest/TargetingIdeaService.LanguageSearchParameter
    LanguageSearchParameter languageParameter = new LanguageSearchParameter();
    Language english = new Language();
    english.setId(1000L);
    languageParameter.setLanguages(new Language[] {english});

    // Create network search parameter (optional).
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(false);
    networkSetting.setTargetContentNetwork(false);
    networkSetting.setTargetPartnerSearchNetwork(false);
    
    NetworkSearchParameter networkSearchParameter = new NetworkSearchParameter();
    networkSearchParameter.setNetworkSetting(networkSetting);
    
    selector.setSearchParameters(
        new SearchParameter[] {relatedToQuerySearchParameter, languageParameter,
            networkSearchParameter});

    // Get related keywords.
    TargetingIdeaPage page = targetingIdeaService.get(selector);

    // Display related keywords.
    if (page.getEntries() != null && page.getEntries().length > 0) {
      for (TargetingIdea targetingIdea : page.getEntries()) {
        Map<AttributeType, Attribute> data = Maps.toMap(targetingIdea.getData());
        StringAttribute keyword = (StringAttribute) data.get(AttributeType.KEYWORD_TEXT);

        IntegerSetAttribute categories =
            (IntegerSetAttribute) data.get(AttributeType.CATEGORY_PRODUCTS_AND_SERVICES);
        String categoriesString = "(none)";
        if (categories != null && categories.getValue() != null) {
          categoriesString = Joiner.on(", ").join(Ints.asList(categories.getValue()));
        }
        Long averageMonthlySearches =
            ((LongAttribute) data.get(AttributeType.SEARCH_VOLUME))
                .getValue();
        System.out.printf("Keyword with text '%s', and average monthly search volume %d "
            + "was found with categories: %s%n", keyword.getValue(), averageMonthlySearches,
            categoriesString);
      }
    } else {
      System.out.println("No related keywords were found.");
    }
  }
}
