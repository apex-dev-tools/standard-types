/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Blob;
import io.github.apexdevtools.standardtypes.System.Integer;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_GatewayNotificationResponse.htm
@SuppressWarnings("unused")
public class GatewayNotificationResponse extends AbstractResponse implements GatewayResponse {
  public GatewayNotificationResponse() {throw new java.lang.UnsupportedOperationException();}

  public void setResponseBody(Blob responseBody) {throw new java.lang.UnsupportedOperationException();}
  public void setStatusCode(Integer statusCode) {throw new java.lang.UnsupportedOperationException();}
}
