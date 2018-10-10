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


package com.google.api.ads.dfp.jaxws.v201611;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for managing {@link RateCard} objects.
 *       
 *       <p>To use this service, you need to have the new sales management solution enabled on your
 *       network. If you do not see a "Sales" tab in <a href="https://www.google.com/dfp">DoubleClick for
 *       Publishers (DFP)</a>, you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RateCardServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RateCardServiceInterface {


    /**
     * 
     *         Creates a list of {@link RateCard} objects. Rate cards must be activated
     *         before being associated with proposal line items and products.
     *         
     *         @param rateCards the rate cards to be created
     *         @return the created rate cards.
     *       
     * 
     * @param rateCards
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.RateCard>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "createRateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfacecreateRateCards")
    @ResponseWrapper(localName = "createRateCardsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfacecreateRateCardsResponse")
    public List<RateCard> createRateCards(
        @WebParam(name = "rateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<RateCard> rateCards)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link RateCardPage} of {@link RateCard} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table><tr><th>PQL property</th><th>Entity property</th></tr><tr><td><code>ForMarketplace</code></td><td>{@link RateCard#forMarketplace}</td></tr><tr><td><code>Id</code></td><td>{@link RateCard#id}</td></tr><tr><td><code>LastModifiedDateTime</code></td><td>{@link RateCard#lastModifiedDateTime}</td></tr><tr><td><code>Name</code></td><td>{@link RateCard#name}</td></tr><tr><td><code>Status</code></td><td>{@link RateCard#status}</td></tr></table>
     *         @param filterStatement a Publisher Query Language statement to filter a list of rate cards.
     *         @return the rate cards that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201611.RateCardPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "getRateCardsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfacegetRateCardsByStatement")
    @ResponseWrapper(localName = "getRateCardsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfacegetRateCardsByStatementResponse")
    public RateCardPage getRateCardsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link RateCard} objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         @param rateCardAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of rate cards.
     *         @return the result of the action performed
     *       
     * 
     * @param rateCardAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201611.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "performRateCardAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfaceperformRateCardAction")
    @ResponseWrapper(localName = "performRateCardActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfaceperformRateCardActionResponse")
    public UpdateResult performRateCardAction(
        @WebParam(name = "rateCardAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        RateCardAction rateCardAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates a list of {@link RateCard} objects.
     *         
     *         @param rateCards the rate cards to be updated
     *         @return the updated rate cards
     *       
     * 
     * @param rateCards
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.RateCard>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "updateRateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfaceupdateRateCards")
    @ResponseWrapper(localName = "updateRateCardsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.RateCardServiceInterfaceupdateRateCardsResponse")
    public List<RateCard> updateRateCards(
        @WebParam(name = "rateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<RateCard> rateCards)
        throws ApiException_Exception
    ;

}
