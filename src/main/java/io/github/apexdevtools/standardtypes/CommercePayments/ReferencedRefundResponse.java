/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.Boolean;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_ReferencedRefundResponse.htm
@SuppressWarnings("unused")
public class ReferencedRefundResponse extends AbstractTransactionResponse implements GatewayResponse {
  public ReferencedRefundResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setAmount(Double amount) {throw new java.lang.UnsupportedOperationException();}
  public void setAsync(Boolean async) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayAvsCode(String gatewayAvsCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayDate(Datetime gatewayDate) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayMessage(String gatewayMessage) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceDetails(String gatewayReferenceDetails) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceNumber(String gatewayReferenceNumber) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCode(String gatewayResultCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCodeDescription(String gatewayResultCodeDescription) {throw new java.lang.UnsupportedOperationException();}
  public void setSalesforceResultCodeInfo(SalesforceResultCodeInfo salesforceResultCodeInfo) {throw new java.lang.UnsupportedOperationException();}
}
