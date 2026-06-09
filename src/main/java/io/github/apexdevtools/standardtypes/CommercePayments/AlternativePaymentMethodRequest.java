/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */
package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AlternativePaymentMethodRequest.htm
@SuppressWarnings("unused")
public class AlternativePaymentMethodRequest {
  public String accountId;
  public String email;
  public String gatewayToken;
  public String gatewayTokenDetails;
  public String name;

  public AlternativePaymentMethodRequest(String gatewayToken) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
