/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Double;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AbstractTransactionResponse.htm
@SuppressWarnings("unused")
public abstract class AbstractTransactionResponse extends AbstractResponse {
  public AbstractTransactionResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setAmount(Double amount) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceDetails(String gatewayReferenceDetails) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayReferenceNumber(String gatewayReferenceNumber) {throw new java.lang.UnsupportedOperationException();}
}
