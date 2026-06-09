/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_SaleRequest.htm
@SuppressWarnings("unused")
public class SaleRequest extends BaseRequest {
  public String accountId;
  public Double amount;
  public String comments;
  public String currencyIsoCode;
  public EnhancedPaymentDataInput enhancedPaymentData;
  public String paymentInitiationSourceId;
  public SaleApiPaymentMethodRequest paymentMethod;
  public Map<String,String> paymentMethodData;
  public Boolean submittedByMerchant;

  public SaleRequest() {throw new java.lang.UnsupportedOperationException();}
  public SaleRequest(Double amount) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
