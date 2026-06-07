/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_EnhancedPaymentDataInput.htm
@SuppressWarnings("unused")
public class EnhancedPaymentDataInput {
  public Map<String,String> additionalAttributes;
  public Double discountAmount;
  public Double dutyAmount;
  public String invoiceNumber;
  public List<LineItemInput> lineItems;
  public String referenceId;
  public Double salesTaxAmount;
  public String shipFromZip;
  public String shipToCountry;
  public String shipToZip;
  public Double shippingAmount;
  public Double taxRate;
  public Double totalTaxAmount;

  public EnhancedPaymentDataInput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
