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

/**
 * Operand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201609.cm;


/**
 * A marker interface for entities that can be operated upon in mutate
 * operations.
 */
public class Operand  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdLabel adGroupAdLabel;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupAd adGroupAd;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupBidModifier adGroupBidModifier;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterionLabel adGroupCriterionLabel;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterion adGroupCriterion;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupExtensionSetting adGroupExtensionSetting;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroupLabel adGroupLabel;

    private com.google.api.ads.adwords.axis.v201609.cm.AdGroup adGroup;

    private com.google.api.ads.adwords.axis.v201609.cm.Ad ad;

    private com.google.api.ads.adwords.axis.v201609.cm.Budget budget;

    private com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterion campaignCriterion;

    private com.google.api.ads.adwords.axis.v201609.cm.CampaignExtensionSetting campaignExtensionSetting;

    private com.google.api.ads.adwords.axis.v201609.cm.CampaignLabel campaignLabel;

    private com.google.api.ads.adwords.axis.v201609.cm.Campaign campaign;

    private com.google.api.ads.adwords.axis.v201609.cm.CustomerExtensionSetting customerExtensionSetting;

    private com.google.api.ads.adwords.axis.v201609.cm.ExtensionFeedItem extensionFeedItem;

    private com.google.api.ads.adwords.axis.v201609.cm.FeedItem feedItem;

    private com.google.api.ads.adwords.axis.v201609.cm.Label label;

    private com.google.api.ads.adwords.axis.v201609.cm.Media media;

    public Operand() {
    }

    public Operand(
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdLabel adGroupAdLabel,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupAd adGroupAd,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupBidModifier adGroupBidModifier,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterionLabel adGroupCriterionLabel,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterion adGroupCriterion,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupExtensionSetting adGroupExtensionSetting,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroupLabel adGroupLabel,
           com.google.api.ads.adwords.axis.v201609.cm.AdGroup adGroup,
           com.google.api.ads.adwords.axis.v201609.cm.Ad ad,
           com.google.api.ads.adwords.axis.v201609.cm.Budget budget,
           com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterion campaignCriterion,
           com.google.api.ads.adwords.axis.v201609.cm.CampaignExtensionSetting campaignExtensionSetting,
           com.google.api.ads.adwords.axis.v201609.cm.CampaignLabel campaignLabel,
           com.google.api.ads.adwords.axis.v201609.cm.Campaign campaign,
           com.google.api.ads.adwords.axis.v201609.cm.CustomerExtensionSetting customerExtensionSetting,
           com.google.api.ads.adwords.axis.v201609.cm.ExtensionFeedItem extensionFeedItem,
           com.google.api.ads.adwords.axis.v201609.cm.FeedItem feedItem,
           com.google.api.ads.adwords.axis.v201609.cm.Label label,
           com.google.api.ads.adwords.axis.v201609.cm.Media media) {
           this.adGroupAdLabel = adGroupAdLabel;
           this.adGroupAd = adGroupAd;
           this.adGroupBidModifier = adGroupBidModifier;
           this.adGroupCriterionLabel = adGroupCriterionLabel;
           this.adGroupCriterion = adGroupCriterion;
           this.adGroupExtensionSetting = adGroupExtensionSetting;
           this.adGroupLabel = adGroupLabel;
           this.adGroup = adGroup;
           this.ad = ad;
           this.budget = budget;
           this.campaignCriterion = campaignCriterion;
           this.campaignExtensionSetting = campaignExtensionSetting;
           this.campaignLabel = campaignLabel;
           this.campaign = campaign;
           this.customerExtensionSetting = customerExtensionSetting;
           this.extensionFeedItem = extensionFeedItem;
           this.feedItem = feedItem;
           this.label = label;
           this.media = media;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("ad", getAd())
            .add("adGroup", getAdGroup())
            .add("adGroupAd", getAdGroupAd())
            .add("adGroupAdLabel", getAdGroupAdLabel())
            .add("adGroupBidModifier", getAdGroupBidModifier())
            .add("adGroupCriterion", getAdGroupCriterion())
            .add("adGroupCriterionLabel", getAdGroupCriterionLabel())
            .add("adGroupExtensionSetting", getAdGroupExtensionSetting())
            .add("adGroupLabel", getAdGroupLabel())
            .add("budget", getBudget())
            .add("campaign", getCampaign())
            .add("campaignCriterion", getCampaignCriterion())
            .add("campaignExtensionSetting", getCampaignExtensionSetting())
            .add("campaignLabel", getCampaignLabel())
            .add("customerExtensionSetting", getCustomerExtensionSetting())
            .add("extensionFeedItem", getExtensionFeedItem())
            .add("feedItem", getFeedItem())
            .add("label", getLabel())
            .add("media", getMedia())
            .toString();
    }

    /**
     * Gets the adGroupAdLabel value for this Operand.
     * 
     * @return adGroupAdLabel
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdLabel getAdGroupAdLabel() {
        return adGroupAdLabel;
    }


    /**
     * Sets the adGroupAdLabel value for this Operand.
     * 
     * @param adGroupAdLabel
     */
    public void setAdGroupAdLabel(com.google.api.ads.adwords.axis.v201609.cm.AdGroupAdLabel adGroupAdLabel) {
        this.adGroupAdLabel = adGroupAdLabel;
    }


    /**
     * Gets the adGroupAd value for this Operand.
     * 
     * @return adGroupAd
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupAd getAdGroupAd() {
        return adGroupAd;
    }


    /**
     * Sets the adGroupAd value for this Operand.
     * 
     * @param adGroupAd
     */
    public void setAdGroupAd(com.google.api.ads.adwords.axis.v201609.cm.AdGroupAd adGroupAd) {
        this.adGroupAd = adGroupAd;
    }


    /**
     * Gets the adGroupBidModifier value for this Operand.
     * 
     * @return adGroupBidModifier
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupBidModifier getAdGroupBidModifier() {
        return adGroupBidModifier;
    }


    /**
     * Sets the adGroupBidModifier value for this Operand.
     * 
     * @param adGroupBidModifier
     */
    public void setAdGroupBidModifier(com.google.api.ads.adwords.axis.v201609.cm.AdGroupBidModifier adGroupBidModifier) {
        this.adGroupBidModifier = adGroupBidModifier;
    }


    /**
     * Gets the adGroupCriterionLabel value for this Operand.
     * 
     * @return adGroupCriterionLabel
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterionLabel getAdGroupCriterionLabel() {
        return adGroupCriterionLabel;
    }


    /**
     * Sets the adGroupCriterionLabel value for this Operand.
     * 
     * @param adGroupCriterionLabel
     */
    public void setAdGroupCriterionLabel(com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterionLabel adGroupCriterionLabel) {
        this.adGroupCriterionLabel = adGroupCriterionLabel;
    }


    /**
     * Gets the adGroupCriterion value for this Operand.
     * 
     * @return adGroupCriterion
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }


    /**
     * Sets the adGroupCriterion value for this Operand.
     * 
     * @param adGroupCriterion
     */
    public void setAdGroupCriterion(com.google.api.ads.adwords.axis.v201609.cm.AdGroupCriterion adGroupCriterion) {
        this.adGroupCriterion = adGroupCriterion;
    }


    /**
     * Gets the adGroupExtensionSetting value for this Operand.
     * 
     * @return adGroupExtensionSetting
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupExtensionSetting getAdGroupExtensionSetting() {
        return adGroupExtensionSetting;
    }


    /**
     * Sets the adGroupExtensionSetting value for this Operand.
     * 
     * @param adGroupExtensionSetting
     */
    public void setAdGroupExtensionSetting(com.google.api.ads.adwords.axis.v201609.cm.AdGroupExtensionSetting adGroupExtensionSetting) {
        this.adGroupExtensionSetting = adGroupExtensionSetting;
    }


    /**
     * Gets the adGroupLabel value for this Operand.
     * 
     * @return adGroupLabel
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroupLabel getAdGroupLabel() {
        return adGroupLabel;
    }


    /**
     * Sets the adGroupLabel value for this Operand.
     * 
     * @param adGroupLabel
     */
    public void setAdGroupLabel(com.google.api.ads.adwords.axis.v201609.cm.AdGroupLabel adGroupLabel) {
        this.adGroupLabel = adGroupLabel;
    }


    /**
     * Gets the adGroup value for this Operand.
     * 
     * @return adGroup
     */
    public com.google.api.ads.adwords.axis.v201609.cm.AdGroup getAdGroup() {
        return adGroup;
    }


    /**
     * Sets the adGroup value for this Operand.
     * 
     * @param adGroup
     */
    public void setAdGroup(com.google.api.ads.adwords.axis.v201609.cm.AdGroup adGroup) {
        this.adGroup = adGroup;
    }


    /**
     * Gets the ad value for this Operand.
     * 
     * @return ad
     */
    public com.google.api.ads.adwords.axis.v201609.cm.Ad getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this Operand.
     * 
     * @param ad
     */
    public void setAd(com.google.api.ads.adwords.axis.v201609.cm.Ad ad) {
        this.ad = ad;
    }


    /**
     * Gets the budget value for this Operand.
     * 
     * @return budget
     */
    public com.google.api.ads.adwords.axis.v201609.cm.Budget getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Operand.
     * 
     * @param budget
     */
    public void setBudget(com.google.api.ads.adwords.axis.v201609.cm.Budget budget) {
        this.budget = budget;
    }


    /**
     * Gets the campaignCriterion value for this Operand.
     * 
     * @return campaignCriterion
     */
    public com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterion getCampaignCriterion() {
        return campaignCriterion;
    }


    /**
     * Sets the campaignCriterion value for this Operand.
     * 
     * @param campaignCriterion
     */
    public void setCampaignCriterion(com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterion campaignCriterion) {
        this.campaignCriterion = campaignCriterion;
    }


    /**
     * Gets the campaignExtensionSetting value for this Operand.
     * 
     * @return campaignExtensionSetting
     */
    public com.google.api.ads.adwords.axis.v201609.cm.CampaignExtensionSetting getCampaignExtensionSetting() {
        return campaignExtensionSetting;
    }


    /**
     * Sets the campaignExtensionSetting value for this Operand.
     * 
     * @param campaignExtensionSetting
     */
    public void setCampaignExtensionSetting(com.google.api.ads.adwords.axis.v201609.cm.CampaignExtensionSetting campaignExtensionSetting) {
        this.campaignExtensionSetting = campaignExtensionSetting;
    }


    /**
     * Gets the campaignLabel value for this Operand.
     * 
     * @return campaignLabel
     */
    public com.google.api.ads.adwords.axis.v201609.cm.CampaignLabel getCampaignLabel() {
        return campaignLabel;
    }


    /**
     * Sets the campaignLabel value for this Operand.
     * 
     * @param campaignLabel
     */
    public void setCampaignLabel(com.google.api.ads.adwords.axis.v201609.cm.CampaignLabel campaignLabel) {
        this.campaignLabel = campaignLabel;
    }


    /**
     * Gets the campaign value for this Operand.
     * 
     * @return campaign
     */
    public com.google.api.ads.adwords.axis.v201609.cm.Campaign getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Operand.
     * 
     * @param campaign
     */
    public void setCampaign(com.google.api.ads.adwords.axis.v201609.cm.Campaign campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the customerExtensionSetting value for this Operand.
     * 
     * @return customerExtensionSetting
     */
    public com.google.api.ads.adwords.axis.v201609.cm.CustomerExtensionSetting getCustomerExtensionSetting() {
        return customerExtensionSetting;
    }


    /**
     * Sets the customerExtensionSetting value for this Operand.
     * 
     * @param customerExtensionSetting
     */
    public void setCustomerExtensionSetting(com.google.api.ads.adwords.axis.v201609.cm.CustomerExtensionSetting customerExtensionSetting) {
        this.customerExtensionSetting = customerExtensionSetting;
    }


    /**
     * Gets the extensionFeedItem value for this Operand.
     * 
     * @return extensionFeedItem
     */
    public com.google.api.ads.adwords.axis.v201609.cm.ExtensionFeedItem getExtensionFeedItem() {
        return extensionFeedItem;
    }


    /**
     * Sets the extensionFeedItem value for this Operand.
     * 
     * @param extensionFeedItem
     */
    public void setExtensionFeedItem(com.google.api.ads.adwords.axis.v201609.cm.ExtensionFeedItem extensionFeedItem) {
        this.extensionFeedItem = extensionFeedItem;
    }


    /**
     * Gets the feedItem value for this Operand.
     * 
     * @return feedItem
     */
    public com.google.api.ads.adwords.axis.v201609.cm.FeedItem getFeedItem() {
        return feedItem;
    }


    /**
     * Sets the feedItem value for this Operand.
     * 
     * @param feedItem
     */
    public void setFeedItem(com.google.api.ads.adwords.axis.v201609.cm.FeedItem feedItem) {
        this.feedItem = feedItem;
    }


    /**
     * Gets the label value for this Operand.
     * 
     * @return label
     */
    public com.google.api.ads.adwords.axis.v201609.cm.Label getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Operand.
     * 
     * @param label
     */
    public void setLabel(com.google.api.ads.adwords.axis.v201609.cm.Label label) {
        this.label = label;
    }


    /**
     * Gets the media value for this Operand.
     * 
     * @return media
     */
    public com.google.api.ads.adwords.axis.v201609.cm.Media getMedia() {
        return media;
    }


    /**
     * Sets the media value for this Operand.
     * 
     * @param media
     */
    public void setMedia(com.google.api.ads.adwords.axis.v201609.cm.Media media) {
        this.media = media;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operand)) return false;
        Operand other = (Operand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupAdLabel==null && other.getAdGroupAdLabel()==null) || 
             (this.adGroupAdLabel!=null &&
              this.adGroupAdLabel.equals(other.getAdGroupAdLabel()))) &&
            ((this.adGroupAd==null && other.getAdGroupAd()==null) || 
             (this.adGroupAd!=null &&
              this.adGroupAd.equals(other.getAdGroupAd()))) &&
            ((this.adGroupBidModifier==null && other.getAdGroupBidModifier()==null) || 
             (this.adGroupBidModifier!=null &&
              this.adGroupBidModifier.equals(other.getAdGroupBidModifier()))) &&
            ((this.adGroupCriterionLabel==null && other.getAdGroupCriterionLabel()==null) || 
             (this.adGroupCriterionLabel!=null &&
              this.adGroupCriterionLabel.equals(other.getAdGroupCriterionLabel()))) &&
            ((this.adGroupCriterion==null && other.getAdGroupCriterion()==null) || 
             (this.adGroupCriterion!=null &&
              this.adGroupCriterion.equals(other.getAdGroupCriterion()))) &&
            ((this.adGroupExtensionSetting==null && other.getAdGroupExtensionSetting()==null) || 
             (this.adGroupExtensionSetting!=null &&
              this.adGroupExtensionSetting.equals(other.getAdGroupExtensionSetting()))) &&
            ((this.adGroupLabel==null && other.getAdGroupLabel()==null) || 
             (this.adGroupLabel!=null &&
              this.adGroupLabel.equals(other.getAdGroupLabel()))) &&
            ((this.adGroup==null && other.getAdGroup()==null) || 
             (this.adGroup!=null &&
              this.adGroup.equals(other.getAdGroup()))) &&
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.campaignCriterion==null && other.getCampaignCriterion()==null) || 
             (this.campaignCriterion!=null &&
              this.campaignCriterion.equals(other.getCampaignCriterion()))) &&
            ((this.campaignExtensionSetting==null && other.getCampaignExtensionSetting()==null) || 
             (this.campaignExtensionSetting!=null &&
              this.campaignExtensionSetting.equals(other.getCampaignExtensionSetting()))) &&
            ((this.campaignLabel==null && other.getCampaignLabel()==null) || 
             (this.campaignLabel!=null &&
              this.campaignLabel.equals(other.getCampaignLabel()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.customerExtensionSetting==null && other.getCustomerExtensionSetting()==null) || 
             (this.customerExtensionSetting!=null &&
              this.customerExtensionSetting.equals(other.getCustomerExtensionSetting()))) &&
            ((this.extensionFeedItem==null && other.getExtensionFeedItem()==null) || 
             (this.extensionFeedItem!=null &&
              this.extensionFeedItem.equals(other.getExtensionFeedItem()))) &&
            ((this.feedItem==null && other.getFeedItem()==null) || 
             (this.feedItem!=null &&
              this.feedItem.equals(other.getFeedItem()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdGroupAdLabel() != null) {
            _hashCode += getAdGroupAdLabel().hashCode();
        }
        if (getAdGroupAd() != null) {
            _hashCode += getAdGroupAd().hashCode();
        }
        if (getAdGroupBidModifier() != null) {
            _hashCode += getAdGroupBidModifier().hashCode();
        }
        if (getAdGroupCriterionLabel() != null) {
            _hashCode += getAdGroupCriterionLabel().hashCode();
        }
        if (getAdGroupCriterion() != null) {
            _hashCode += getAdGroupCriterion().hashCode();
        }
        if (getAdGroupExtensionSetting() != null) {
            _hashCode += getAdGroupExtensionSetting().hashCode();
        }
        if (getAdGroupLabel() != null) {
            _hashCode += getAdGroupLabel().hashCode();
        }
        if (getAdGroup() != null) {
            _hashCode += getAdGroup().hashCode();
        }
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getCampaignCriterion() != null) {
            _hashCode += getCampaignCriterion().hashCode();
        }
        if (getCampaignExtensionSetting() != null) {
            _hashCode += getCampaignExtensionSetting().hashCode();
        }
        if (getCampaignLabel() != null) {
            _hashCode += getCampaignLabel().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getCustomerExtensionSetting() != null) {
            _hashCode += getCustomerExtensionSetting().hashCode();
        }
        if (getExtensionFeedItem() != null) {
            _hashCode += getExtensionFeedItem().hashCode();
        }
        if (getFeedItem() != null) {
            _hashCode += getFeedItem().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Operand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupAdLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupAdLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupAdLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupAd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupAd"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupAd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupBidModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupBidModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupBidModifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupCriterionLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupCriterionLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupExtensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupExtensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupExtensionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroupLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Ad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignExtensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignExtensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignExtensionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CampaignLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerExtensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CustomerExtensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "CustomerExtensionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionFeedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "ExtensionFeedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "ExtensionFeedItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "FeedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "FeedItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Media"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "Media"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
