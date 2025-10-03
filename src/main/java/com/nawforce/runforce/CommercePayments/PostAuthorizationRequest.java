/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_PostAuthorizationRequest.htm
@SuppressWarnings("unused")
public class PostAuthorizationRequest extends BaseRequest {
  public String accountId;
  public Double amount;
  public String comments;
  public String currencyIsoCode;
  public String paymentMethod;

  public PostAuthorizationRequest() {throw new java.lang.UnsupportedOperationException();}
  public PostAuthorizationRequest(Double amount) {throw new java.lang.UnsupportedOperationException();}
}
