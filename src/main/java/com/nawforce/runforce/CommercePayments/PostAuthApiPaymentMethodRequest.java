/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_PostAuthApiPaymentMethodRequest.htm
@SuppressWarnings("unused")
public class PostAuthApiPaymentMethodRequest extends BaseApiPaymentMethodRequest {
  public AlternativePaymentMethodRequest alternativePaymentMethod;
  public CardPaymentMethodRequest cardPaymentMethod;

  public PostAuthApiPaymentMethodRequest() {throw new java.lang.UnsupportedOperationException();}
  public PostAuthApiPaymentMethodRequest(AlternativePaymentMethodRequest alternativePaymentMethodRequest) {throw new java.lang.UnsupportedOperationException();}
  public PostAuthApiPaymentMethodRequest(CardPaymentMethodRequest cardPaymentMethodRequest) {throw new java.lang.UnsupportedOperationException();}
}
