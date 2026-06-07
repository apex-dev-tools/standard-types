/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_LineItemInput.htm
@SuppressWarnings("unused")
public class LineItemInput {
  public Map<String,String> additionalAttributes;
  public String commodityCode;
  public String description;
  public Double discount;
  public Boolean discountIndicator;
  public Double dutyAmount;
  public String grossNetIndicator;
  public String lineItemId;
  public Double lineItemTotal;
  public String name;
  public Integer quantity;
  public Double shippingAmount;
  public String sku;
  public Double taxAmount;
  public Double taxRate;
  public Double unitPrice;
  public String uom;

  public LineItemInput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
