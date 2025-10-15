/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_SaleApiPaymentMethodRequest.htm
@SuppressWarnings("unused")
public class SaleApiPaymentMethodRequest extends BaseApiPaymentMethodRequest {
  public CardPaymentMethodRequest cardPaymentMethod;
  public StandardEntryClassCode standardEntryClassCode;

  public SaleApiPaymentMethodRequest() {throw new java.lang.UnsupportedOperationException();}
  public SaleApiPaymentMethodRequest(CardPaymentMethodRequest cardPaymentMethodRequest) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
