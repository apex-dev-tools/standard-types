/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Blob;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_PaymentGatewayNotificationRequest.htm
@SuppressWarnings("unused")
public class PaymentGatewayNotificationRequest {
  public Blob requestBody;

  public PaymentGatewayNotificationRequest() {throw new java.lang.UnsupportedOperationException();}

  public Map<String,String> getHeaders() {throw new java.lang.UnsupportedOperationException();}
  public Blob getRequestBody() {throw new java.lang.UnsupportedOperationException();}
}
