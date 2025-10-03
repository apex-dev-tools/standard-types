/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AuthorizationRequest.htm
@SuppressWarnings("unused")
public class AuthorizationRequest extends BaseRequest {
  public String accountId;
  public Double amount;
  public String comments;
  public String currencyIsoCode;
  public AuthApiPaymentMethodRequest paymentMethod;

  public AuthorizationRequest() {throw new java.lang.UnsupportedOperationException();}
  public AuthorizationRequest(Double amount) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
