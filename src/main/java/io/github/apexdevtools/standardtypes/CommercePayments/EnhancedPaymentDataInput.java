/*
 Copyright (c) 2026 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

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
