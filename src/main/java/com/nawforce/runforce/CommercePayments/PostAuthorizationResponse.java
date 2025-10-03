/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_PostAuthorizationResponse.htm
@SuppressWarnings("unused")
public class PostAuthorizationResponse extends AbstractTransactionResponse {

  public PostAuthorizationResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setAlternativePaymentMethodResponse(AlternativePaymentMethodResponse alternativePaymentMethod) {throw new java.lang.UnsupportedOperationException();}
  public void setAsync(Boolean async) {throw new java.lang.UnsupportedOperationException();}
  public void setAuthorizationExpirationDate(Datetime authExpDate) {throw new java.lang.UnsupportedOperationException();}
  public void setCardPaymentMethodResponse(CardPaymentMethodResponse cardPaymentMethod) {throw new java.lang.UnsupportedOperationException();}
  public void setGatewayAuthCode(String gatewayAuthCode) {throw new java.lang.UnsupportedOperationException();}
  public void setPaymentMethodDetailsResponse(PaymentMethodDetailsResponse paymentMethodDetails) {throw new java.lang.UnsupportedOperationException();}
  public void setPaymentMethodTokenizationResponse(PaymentMethodTokenizationResponse paymentMethodTokenizationResponse) {throw new java.lang.UnsupportedOperationException();}
}
