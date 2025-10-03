/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AuthorizationResponse.htm
@SuppressWarnings("unused")
public class AuthorizationResponse extends AbstractTransactionResponse implements GatewayResponse {
  public AuthorizationResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setAmount(Double amount) {throw new java.lang.UnsupportedOperationException();}
  public void setAuthorizationExpirationDate(Datetime authExpDate) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayAuthCode(String gatewayAuthCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayAvsCode(String gatewayAvsCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayDate(Datetime gatewayDate) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayMessage(String gatewayMessage) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceDetails(String gatewayReferenceDetails) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceNumber(String gatewayReferenceNumber) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCode(String gatewayResultCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCodeDescription(String gatewayResultCodeDescription) {throw new java.lang.UnsupportedOperationException();}
  public void setPaymentMethodTokenizationResponse(PaymentMethodTokenizationResponse paymentMethodTokenizationResponse) {throw new java.lang.UnsupportedOperationException();}
  public void setSalesforceResultCodeInfo(SalesforceResultCodeInfo salesforceResultCodeInfo) {throw new java.lang.UnsupportedOperationException();}
}
