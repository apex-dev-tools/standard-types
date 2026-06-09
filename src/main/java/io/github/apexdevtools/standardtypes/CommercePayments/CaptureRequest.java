/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_CaptureRequest.htm
@SuppressWarnings("unused")
public class CaptureRequest extends BaseRequest {
  public String accountId;
  public Double amount;
  public String paymentAuthorizationId;

  public CaptureRequest() {throw new java.lang.UnsupportedOperationException();}
  public CaptureRequest(Double amount, String authorizationId) {throw new java.lang.UnsupportedOperationException();}
}
