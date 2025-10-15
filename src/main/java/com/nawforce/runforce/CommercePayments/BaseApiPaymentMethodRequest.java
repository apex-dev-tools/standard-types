/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_BaseApiPaymentMethodRequest.htm
@SuppressWarnings("unused")
public abstract class BaseApiPaymentMethodRequest {
  public AddressRequest address;
  public String id;
  public Boolean saveForFuture;

  public BaseApiPaymentMethodRequest() {throw new java.lang.UnsupportedOperationException();}
  public BaseApiPaymentMethodRequest(AddressRequest address, String id, Boolean saveForFuture) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
