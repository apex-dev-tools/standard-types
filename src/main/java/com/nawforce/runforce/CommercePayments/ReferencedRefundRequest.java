/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_ReferencedRefundRequest.htm
@SuppressWarnings("unused")
public class ReferencedRefundRequest extends RefundRequest {
  public String PaymentId;
  public String accountId;
  public Double amount;

  public ReferencedRefundRequest(Double amount, String paymentId) {throw new java.lang.UnsupportedOperationException();}
}
