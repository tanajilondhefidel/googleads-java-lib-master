// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201609.remarketing;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineConversionFeed;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineConversionFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This code example imports offline conversion values for specific clicks to
 * your account. To get Google Click ID for a click, run
 * CLICK_PERFORMANCE_REPORT. To set up a conversion tracker, run the
 * AddConversionTracker.java example.
 */
public class UploadOfflineConversions {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    // Name of the conversion tracker to upload to.
    String conversionName = "INSERT_CONVERSION_NAME_HERE";
    
    // Google Click ID should be newer than 30 days.
    String gClId = "INSERT_GOOGLE_CLICK_ID_HERE";
    
    // Conversion time should be after the click time.
    String conversionTime = "INSERT_CONVERSION_TIME_HERE";
    Double conversionValue = Double.valueOf("INSERT_CONVERSION_VALUE_HERE");

    runExample(adWordsServices, session, conversionName, gClId, conversionTime, conversionValue);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session, 
      String conversionName, String gClid, String conversionTime, 
      double conversionValue) throws Exception {

    // Get the OfflineConversionFeedService.
    OfflineConversionFeedServiceInterface offlineConversionFeedService =
        adWordsServices.get(session, OfflineConversionFeedServiceInterface.class);

    // Associate offline conversions with the existing named conversion tracker. If this tracker
    // was newly created, it may be a few hours before it can accept conversions.
    OfflineConversionFeed feed = new OfflineConversionFeed();
    feed.setConversionName(conversionName);
    feed.setConversionTime(conversionTime);
    feed.setConversionValue(conversionValue);
    feed.setGoogleClickId(gClid);

    OfflineConversionFeedOperation offlineConversionOperation =
        new OfflineConversionFeedOperation();
    offlineConversionOperation.setOperator(Operator.ADD);
    offlineConversionOperation.setOperand(feed);

    OfflineConversionFeedReturnValue offlineConversionReturnValue = offlineConversionFeedService
        .mutate(new OfflineConversionFeedOperation[] {offlineConversionOperation});

    OfflineConversionFeed newFeed = offlineConversionReturnValue.getValue(0);

    System.out.printf(
        "Uploaded offline conversion value of %.4f for Google Click ID '%s' to '%s'.%n",
        newFeed.getConversionValue(), newFeed.getGoogleClickId(), newFeed.getConversionName());
  }
}
