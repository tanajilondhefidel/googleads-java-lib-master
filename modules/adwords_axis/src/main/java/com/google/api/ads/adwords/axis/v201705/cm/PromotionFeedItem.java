// Copyright 2017 Google Inc. All Rights Reserved.
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
 * PromotionFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201705.cm;


/**
 * Represents a promotion extension.
 */
public class PromotionFeedItem  extends com.google.api.ads.adwords.axis.v201705.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* Promotion target. Required. */
    private java.lang.String promotionTarget;

    /* Discount modifier. Optional. */
    private com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionDiscountModifier discountModifier;

    /* Percent off in micros. One million is equivalent to one percent.
     * Either percentOff or moneyAmountOff is required. */
    private java.lang.Long percentOff;

    /* Money amount off. Either percentOff or moneyAmountOff is required. */
    private com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency moneyAmountOff;

    /* Promotion code. Optional. */
    private java.lang.String promotionCode;

    /* Orders over amount. Optional. */
    private com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency ordersOverAmount;

    /* Promotion start. Optional. */
    private java.lang.String promotionStart;

    /* Promotion end . Optional. */
    private java.lang.String promotionEnd;

    /* Occasion of the promotion. Optional. */
    private com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionOccasion occasion;

    /* Final URLs. Required. */
    private com.google.api.ads.adwords.axis.v201705.cm.UrlList finalUrls;

    /* Final mobile URLs. Optional. */
    private com.google.api.ads.adwords.axis.v201705.cm.UrlList finalMobileUrls;

    /* Tracking URL template. Optional. */
    private java.lang.String trackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201705.cm.CustomParameters promotionUrlCustomParameters;

    public PromotionFeedItem() {
    }

    public PromotionFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201705.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemCampaignTargeting campaignTargeting,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemAdGroupTargeting adGroupTargeting,
           com.google.api.ads.adwords.axis.v201705.cm.Keyword keywordTargeting,
           com.google.api.ads.adwords.axis.v201705.cm.Location geoTargeting,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemGeoRestriction geoTargetingRestriction,
           com.google.api.ads.adwords.axis.v201705.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String promotionTarget,
           com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionDiscountModifier discountModifier,
           java.lang.Long percentOff,
           com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency moneyAmountOff,
           java.lang.String promotionCode,
           com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency ordersOverAmount,
           java.lang.String promotionStart,
           java.lang.String promotionEnd,
           com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionOccasion occasion,
           com.google.api.ads.adwords.axis.v201705.cm.UrlList finalUrls,
           com.google.api.ads.adwords.axis.v201705.cm.UrlList finalMobileUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201705.cm.CustomParameters promotionUrlCustomParameters) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            campaignTargeting,
            adGroupTargeting,
            keywordTargeting,
            geoTargeting,
            geoTargetingRestriction,
            policyData,
            extensionFeedItemType);
        this.promotionTarget = promotionTarget;
        this.discountModifier = discountModifier;
        this.percentOff = percentOff;
        this.moneyAmountOff = moneyAmountOff;
        this.promotionCode = promotionCode;
        this.ordersOverAmount = ordersOverAmount;
        this.promotionStart = promotionStart;
        this.promotionEnd = promotionEnd;
        this.occasion = occasion;
        this.finalUrls = finalUrls;
        this.finalMobileUrls = finalMobileUrls;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.promotionUrlCustomParameters = promotionUrlCustomParameters;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("discountModifier", getDiscountModifier())
            .add("endTime", getEndTime())
            .add("extensionFeedItemType", getExtensionFeedItemType())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedType", getFeedType())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrls", getFinalUrls())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("moneyAmountOff", getMoneyAmountOff())
            .add("occasion", getOccasion())
            .add("ordersOverAmount", getOrdersOverAmount())
            .add("percentOff", getPercentOff())
            .add("policyData", getPolicyData())
            .add("promotionCode", getPromotionCode())
            .add("promotionEnd", getPromotionEnd())
            .add("promotionStart", getPromotionStart())
            .add("promotionTarget", getPromotionTarget())
            .add("promotionUrlCustomParameters", getPromotionUrlCustomParameters())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .toString();
    }

    /**
     * Gets the promotionTarget value for this PromotionFeedItem.
     * 
     * @return promotionTarget   * Promotion target. Required.
     */
    public java.lang.String getPromotionTarget() {
        return promotionTarget;
    }


    /**
     * Sets the promotionTarget value for this PromotionFeedItem.
     * 
     * @param promotionTarget   * Promotion target. Required.
     */
    public void setPromotionTarget(java.lang.String promotionTarget) {
        this.promotionTarget = promotionTarget;
    }


    /**
     * Gets the discountModifier value for this PromotionFeedItem.
     * 
     * @return discountModifier   * Discount modifier. Optional.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionDiscountModifier getDiscountModifier() {
        return discountModifier;
    }


    /**
     * Sets the discountModifier value for this PromotionFeedItem.
     * 
     * @param discountModifier   * Discount modifier. Optional.
     */
    public void setDiscountModifier(com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionDiscountModifier discountModifier) {
        this.discountModifier = discountModifier;
    }


    /**
     * Gets the percentOff value for this PromotionFeedItem.
     * 
     * @return percentOff   * Percent off in micros. One million is equivalent to one percent.
     * Either percentOff or moneyAmountOff is required.
     */
    public java.lang.Long getPercentOff() {
        return percentOff;
    }


    /**
     * Sets the percentOff value for this PromotionFeedItem.
     * 
     * @param percentOff   * Percent off in micros. One million is equivalent to one percent.
     * Either percentOff or moneyAmountOff is required.
     */
    public void setPercentOff(java.lang.Long percentOff) {
        this.percentOff = percentOff;
    }


    /**
     * Gets the moneyAmountOff value for this PromotionFeedItem.
     * 
     * @return moneyAmountOff   * Money amount off. Either percentOff or moneyAmountOff is required.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency getMoneyAmountOff() {
        return moneyAmountOff;
    }


    /**
     * Sets the moneyAmountOff value for this PromotionFeedItem.
     * 
     * @param moneyAmountOff   * Money amount off. Either percentOff or moneyAmountOff is required.
     */
    public void setMoneyAmountOff(com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency moneyAmountOff) {
        this.moneyAmountOff = moneyAmountOff;
    }


    /**
     * Gets the promotionCode value for this PromotionFeedItem.
     * 
     * @return promotionCode   * Promotion code. Optional.
     */
    public java.lang.String getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this PromotionFeedItem.
     * 
     * @param promotionCode   * Promotion code. Optional.
     */
    public void setPromotionCode(java.lang.String promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the ordersOverAmount value for this PromotionFeedItem.
     * 
     * @return ordersOverAmount   * Orders over amount. Optional.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency getOrdersOverAmount() {
        return ordersOverAmount;
    }


    /**
     * Sets the ordersOverAmount value for this PromotionFeedItem.
     * 
     * @param ordersOverAmount   * Orders over amount. Optional.
     */
    public void setOrdersOverAmount(com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency ordersOverAmount) {
        this.ordersOverAmount = ordersOverAmount;
    }


    /**
     * Gets the promotionStart value for this PromotionFeedItem.
     * 
     * @return promotionStart   * Promotion start. Optional.
     */
    public java.lang.String getPromotionStart() {
        return promotionStart;
    }


    /**
     * Sets the promotionStart value for this PromotionFeedItem.
     * 
     * @param promotionStart   * Promotion start. Optional.
     */
    public void setPromotionStart(java.lang.String promotionStart) {
        this.promotionStart = promotionStart;
    }


    /**
     * Gets the promotionEnd value for this PromotionFeedItem.
     * 
     * @return promotionEnd   * Promotion end . Optional.
     */
    public java.lang.String getPromotionEnd() {
        return promotionEnd;
    }


    /**
     * Sets the promotionEnd value for this PromotionFeedItem.
     * 
     * @param promotionEnd   * Promotion end . Optional.
     */
    public void setPromotionEnd(java.lang.String promotionEnd) {
        this.promotionEnd = promotionEnd;
    }


    /**
     * Gets the occasion value for this PromotionFeedItem.
     * 
     * @return occasion   * Occasion of the promotion. Optional.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionOccasion getOccasion() {
        return occasion;
    }


    /**
     * Sets the occasion value for this PromotionFeedItem.
     * 
     * @param occasion   * Occasion of the promotion. Optional.
     */
    public void setOccasion(com.google.api.ads.adwords.axis.v201705.cm.PromotionExtensionOccasion occasion) {
        this.occasion = occasion;
    }


    /**
     * Gets the finalUrls value for this PromotionFeedItem.
     * 
     * @return finalUrls   * Final URLs. Required.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.UrlList getFinalUrls() {
        return finalUrls;
    }


    /**
     * Sets the finalUrls value for this PromotionFeedItem.
     * 
     * @param finalUrls   * Final URLs. Required.
     */
    public void setFinalUrls(com.google.api.ads.adwords.axis.v201705.cm.UrlList finalUrls) {
        this.finalUrls = finalUrls;
    }


    /**
     * Gets the finalMobileUrls value for this PromotionFeedItem.
     * 
     * @return finalMobileUrls   * Final mobile URLs. Optional.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }


    /**
     * Sets the finalMobileUrls value for this PromotionFeedItem.
     * 
     * @param finalMobileUrls   * Final mobile URLs. Optional.
     */
    public void setFinalMobileUrls(com.google.api.ads.adwords.axis.v201705.cm.UrlList finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }


    /**
     * Gets the trackingUrlTemplate value for this PromotionFeedItem.
     * 
     * @return trackingUrlTemplate   * Tracking URL template. Optional.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this PromotionFeedItem.
     * 
     * @param trackingUrlTemplate   * Tracking URL template. Optional.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the promotionUrlCustomParameters value for this PromotionFeedItem.
     * 
     * @return promotionUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201705.cm.CustomParameters getPromotionUrlCustomParameters() {
        return promotionUrlCustomParameters;
    }


    /**
     * Sets the promotionUrlCustomParameters value for this PromotionFeedItem.
     * 
     * @param promotionUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setPromotionUrlCustomParameters(com.google.api.ads.adwords.axis.v201705.cm.CustomParameters promotionUrlCustomParameters) {
        this.promotionUrlCustomParameters = promotionUrlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionFeedItem)) return false;
        PromotionFeedItem other = (PromotionFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.promotionTarget==null && other.getPromotionTarget()==null) || 
             (this.promotionTarget!=null &&
              this.promotionTarget.equals(other.getPromotionTarget()))) &&
            ((this.discountModifier==null && other.getDiscountModifier()==null) || 
             (this.discountModifier!=null &&
              this.discountModifier.equals(other.getDiscountModifier()))) &&
            ((this.percentOff==null && other.getPercentOff()==null) || 
             (this.percentOff!=null &&
              this.percentOff.equals(other.getPercentOff()))) &&
            ((this.moneyAmountOff==null && other.getMoneyAmountOff()==null) || 
             (this.moneyAmountOff!=null &&
              this.moneyAmountOff.equals(other.getMoneyAmountOff()))) &&
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.ordersOverAmount==null && other.getOrdersOverAmount()==null) || 
             (this.ordersOverAmount!=null &&
              this.ordersOverAmount.equals(other.getOrdersOverAmount()))) &&
            ((this.promotionStart==null && other.getPromotionStart()==null) || 
             (this.promotionStart!=null &&
              this.promotionStart.equals(other.getPromotionStart()))) &&
            ((this.promotionEnd==null && other.getPromotionEnd()==null) || 
             (this.promotionEnd!=null &&
              this.promotionEnd.equals(other.getPromotionEnd()))) &&
            ((this.occasion==null && other.getOccasion()==null) || 
             (this.occasion!=null &&
              this.occasion.equals(other.getOccasion()))) &&
            ((this.finalUrls==null && other.getFinalUrls()==null) || 
             (this.finalUrls!=null &&
              this.finalUrls.equals(other.getFinalUrls()))) &&
            ((this.finalMobileUrls==null && other.getFinalMobileUrls()==null) || 
             (this.finalMobileUrls!=null &&
              this.finalMobileUrls.equals(other.getFinalMobileUrls()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.promotionUrlCustomParameters==null && other.getPromotionUrlCustomParameters()==null) || 
             (this.promotionUrlCustomParameters!=null &&
              this.promotionUrlCustomParameters.equals(other.getPromotionUrlCustomParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPromotionTarget() != null) {
            _hashCode += getPromotionTarget().hashCode();
        }
        if (getDiscountModifier() != null) {
            _hashCode += getDiscountModifier().hashCode();
        }
        if (getPercentOff() != null) {
            _hashCode += getPercentOff().hashCode();
        }
        if (getMoneyAmountOff() != null) {
            _hashCode += getMoneyAmountOff().hashCode();
        }
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getOrdersOverAmount() != null) {
            _hashCode += getOrdersOverAmount().hashCode();
        }
        if (getPromotionStart() != null) {
            _hashCode += getPromotionStart().hashCode();
        }
        if (getPromotionEnd() != null) {
            _hashCode += getPromotionEnd().hashCode();
        }
        if (getOccasion() != null) {
            _hashCode += getOccasion().hashCode();
        }
        if (getFinalUrls() != null) {
            _hashCode += getFinalUrls().hashCode();
        }
        if (getFinalMobileUrls() != null) {
            _hashCode += getFinalMobileUrls().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getPromotionUrlCustomParameters() != null) {
            _hashCode += getPromotionUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "PromotionFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "promotionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "discountModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "PromotionExtensionDiscountModifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOff");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "percentOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneyAmountOff");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "moneyAmountOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "MoneyWithCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "promotionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordersOverAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "ordersOverAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "MoneyWithCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionStart");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "promotionStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "promotionEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occasion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "occasion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "PromotionExtensionOccasion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "finalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "finalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionUrlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "promotionUrlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201705", "CustomParameters"));
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
