/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_ReferencedRefundRequest.htm
@SuppressWarnings("unused")
public class ReferencedRefundRequest extends RefundRequest {
  public String PaymentId;
  public String accountId;
  public Double amount;

  public ReferencedRefundRequest(Double amount, String paymentId) {throw new java.lang.UnsupportedOperationException();}
}
