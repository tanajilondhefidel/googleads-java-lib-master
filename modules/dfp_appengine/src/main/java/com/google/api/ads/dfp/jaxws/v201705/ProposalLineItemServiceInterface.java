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


package com.google.api.ads.dfp.jaxws.v201705;

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
 *       Provides methods for creating, updating and retrieving {@link ProposalLineItem} objects.
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
@WebService(name = "ProposalLineItemServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProposalLineItemServiceInterface {


    /**
     * 
     *         Creates new {@link ProposalLineItem} objects.
     *         
     *         For each proposal line item, the following fields are required:
     *         <ul>
     *         <li>{@link ProposalLineItem#proposalId}</li>
     *         <li>{@link ProposalLineItem#rateCardId}</li>
     *         <li>{@link ProposalLineItem#productId}</li>
     *         <li>{@link ProposalLineItem#name}</li>
     *         <li>{@link ProposalLineItem#startDateTime}</li>
     *         <li>{@link ProposalLineItem#endDateTime}</li>
     *         </ul>
     *         
     *         @param proposalLineItems the proposal line items to create
     *         @return the created proposal line items with their IDs filled in
     *       
     * 
     * @param proposalLineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201705.ProposalLineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
    @RequestWrapper(localName = "createProposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfacecreateProposalLineItems")
    @ResponseWrapper(localName = "createProposalLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfacecreateProposalLineItemsResponse")
    public List<ProposalLineItem> createProposalLineItems(
        @WebParam(name = "proposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
        List<ProposalLineItem> proposalLineItems)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem} objects
     *         that satisfy the given {@link Statement#query}.  The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProposalLineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProposalLineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ProposalLineItem#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ProposalLineItem#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ProposalLineItem#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProposalLineItem#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProposalLineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code useThirdPartyAdServerFromProposal}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#useThirdPartyAdServerFromProposal}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code thirdPartyAdServerId}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code customThirdPartyAdServerName}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#customThirdPartyAdServerName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isProgrammatic}</td>
     *         <td>{@link ProposalLineItem#isProgrammatic}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of proposal line items
     *         @return the proposal line items that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
    @RequestWrapper(localName = "getProposalLineItemsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfacegetProposalLineItemsByStatement")
    @ResponseWrapper(localName = "getProposalLineItemsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfacegetProposalLineItemsByStatementResponse")
    public ProposalLineItemPage getProposalLineItemsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ProposalLineItem} objects that match
     *         the given {@link Statement#query}.
     *         
     *         @param proposalLineItemAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         proposal line items
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param proposalLineItemAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201705.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
    @RequestWrapper(localName = "performProposalLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfaceperformProposalLineItemAction")
    @ResponseWrapper(localName = "performProposalLineItemActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfaceperformProposalLineItemActionResponse")
    public UpdateResult performProposalLineItemAction(
        @WebParam(name = "proposalLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
        ProposalLineItemAction proposalLineItemAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ProposalLineItem} objects. If free editing mode is enabled,
     *         this will trigger inventory reservation and cause the proposal to be pushed to DFP again.
     *         
     *         @param proposalLineItems the proposal line items to update
     *         @return the updated proposal line items
     *       
     * 
     * @param proposalLineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201705.ProposalLineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
    @RequestWrapper(localName = "updateProposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfaceupdateProposalLineItems")
    @ResponseWrapper(localName = "updateProposalLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705", className = "com.google.api.ads.dfp.jaxws.v201705.ProposalLineItemServiceInterfaceupdateProposalLineItemsResponse")
    public List<ProposalLineItem> updateProposalLineItems(
        @WebParam(name = "proposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201705")
        List<ProposalLineItem> proposalLineItems)
        throws ApiException_Exception
    ;

}
