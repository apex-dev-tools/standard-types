/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Datetime;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AbstractResponse.htm
@SuppressWarnings("unused")
public abstract class AbstractResponse implements GatewayResponse {
  public AbstractResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setGatewayAvsCode(String gatewayAvsCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayDate(Datetime gatewayDate) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayMessage(String gatewayMessage) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCode(String gatewayResultCode) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayResultCodeDescription(String gatewayResultCodeDescription) {throw new java.lang.UnsupportedOperationException();}
  public void setSalesforceResultCodeInfo(SalesforceResultCodeInfo salesforceResultCodeInfo) {throw new java.lang.UnsupportedOperationException();}
}
