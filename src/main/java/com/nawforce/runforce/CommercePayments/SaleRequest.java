/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_SaleRequest.htm
@SuppressWarnings("unused")
public class SaleRequest extends BaseRequest {
  public String accountId;
  public Double amount;
  public String comments;
  public String currencyIsoCode;
  public SaleApiPaymentMethodRequest paymentMethod;
  public Map<String,String> paymentMethodData;

  public SaleRequest() {throw new java.lang.UnsupportedOperationException();}
  public SaleRequest(Double amount) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
