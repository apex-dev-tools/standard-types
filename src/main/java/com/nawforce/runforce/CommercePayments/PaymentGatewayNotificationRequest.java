/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Blob;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_PaymentGatewayNotificationRequest.htm
@SuppressWarnings("unused")
public class PaymentGatewayNotificationRequest {
  public Blob requestBody;

  public PaymentGatewayNotificationRequest() {throw new java.lang.UnsupportedOperationException();}

  public Map<String,String> getHeaders() {throw new java.lang.UnsupportedOperationException();}
  public Blob getRequestBody() {throw new java.lang.UnsupportedOperationException();}
}
