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


package com.google.api.ads.adwords.jaxws.v201705.rm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201705.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201705.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201705.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201705.rm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201705", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201705", "ApiExceptionFault");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/rm/v201705", "RequestHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201705.rm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuleBasedUserList }
     * 
     */
    public RuleBasedUserList createRuleBasedUserList() {
        return new RuleBasedUserList();
    }

    /**
     * Create an instance of {@link SimilarUserList }
     * 
     */
    public SimilarUserList createSimilarUserList() {
        return new SimilarUserList();
    }

    /**
     * Create an instance of {@link DateKey }
     * 
     */
    public DateKey createDateKey() {
        return new DateKey();
    }

    /**
     * Create an instance of {@link LogicalUserListOperand }
     * 
     */
    public LogicalUserListOperand createLogicalUserListOperand() {
        return new LogicalUserListOperand();
    }

    /**
     * Create an instance of {@link UserListError }
     * 
     */
    public UserListError createUserListError() {
        return new UserListError();
    }

    /**
     * Create an instance of {@link RuleItem }
     * 
     */
    public RuleItem createRuleItem() {
        return new RuleItem();
    }

    /**
     * Create an instance of {@link CollectionSizeError }
     * 
     */
    public CollectionSizeError createCollectionSizeError() {
        return new CollectionSizeError();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link StringRuleItem }
     * 
     */
    public StringRuleItem createStringRuleItem() {
        return new StringRuleItem();
    }

    /**
     * Create an instance of {@link UserListOperation }
     * 
     */
    public UserListOperation createUserListOperation() {
        return new UserListOperation();
    }

    /**
     * Create an instance of {@link RelativeDate }
     * 
     */
    public RelativeDate createRelativeDate() {
        return new RelativeDate();
    }

    /**
     * Create an instance of {@link MutateMembersOperand }
     * 
     */
    public MutateMembersOperand createMutateMembersOperand() {
        return new MutateMembersOperand();
    }

    /**
     * Create an instance of {@link Rule }
     * 
     */
    public Rule createRule() {
        return new Rule();
    }

    /**
     * Create an instance of {@link DataUploadResult }
     * 
     */
    public DataUploadResult createDataUploadResult() {
        return new DataUploadResult();
    }

    /**
     * Create an instance of {@link StringKey }
     * 
     */
    public StringKey createStringKey() {
        return new StringKey();
    }

    /**
     * Create an instance of {@link DateSpecificRuleUserList }
     * 
     */
    public DateSpecificRuleUserList createDateSpecificRuleUserList() {
        return new DateSpecificRuleUserList();
    }

    /**
     * Create an instance of {@link NumberRuleItem }
     * 
     */
    public NumberRuleItem createNumberRuleItem() {
        return new NumberRuleItem();
    }

    /**
     * Create an instance of {@link MutateMembersError }
     * 
     */
    public MutateMembersError createMutateMembersError() {
        return new MutateMembersError();
    }

    /**
     * Create an instance of {@link ExpressionRuleUserList }
     * 
     */
    public ExpressionRuleUserList createExpressionRuleUserList() {
        return new ExpressionRuleUserList();
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link UserListPage }
     * 
     */
    public UserListPage createUserListPage() {
        return new UserListPage();
    }

    /**
     * Create an instance of {@link DateRuleItem }
     * 
     */
    public DateRuleItem createDateRuleItem() {
        return new DateRuleItem();
    }

    /**
     * Create an instance of {@link LogicalUserList }
     * 
     */
    public LogicalUserList createLogicalUserList() {
        return new LogicalUserList();
    }

    /**
     * Create an instance of {@link BasicUserList }
     * 
     */
    public BasicUserList createBasicUserList() {
        return new BasicUserList();
    }

    /**
     * Create an instance of {@link RuleItemGroup }
     * 
     */
    public RuleItemGroup createRuleItemGroup() {
        return new RuleItemGroup();
    }

    /**
     * Create an instance of {@link UserListReturnValue }
     * 
     */
    public UserListReturnValue createUserListReturnValue() {
        return new UserListReturnValue();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link UserListLogicalRule }
     * 
     */
    public UserListLogicalRule createUserListLogicalRule() {
        return new UserListLogicalRule();
    }

    /**
     * Create an instance of {@link CrmBasedUserList }
     * 
     */
    public CrmBasedUserList createCrmBasedUserList() {
        return new CrmBasedUserList();
    }

    /**
     * Create an instance of {@link MutateMembersOperation }
     * 
     */
    public MutateMembersOperation createMutateMembersOperation() {
        return new MutateMembersOperation();
    }

    /**
     * Create an instance of {@link UserListConversionType }
     * 
     */
    public UserListConversionType createUserListConversionType() {
        return new UserListConversionType();
    }

    /**
     * Create an instance of {@link MutateMembersReturnValue }
     * 
     */
    public MutateMembersReturnValue createMutateMembersReturnValue() {
        return new MutateMembersReturnValue();
    }

    /**
     * Create an instance of {@link NumberKey }
     * 
     */
    public NumberKey createNumberKey() {
        return new NumberKey();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201705", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201705", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/rm/v201705", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

}
