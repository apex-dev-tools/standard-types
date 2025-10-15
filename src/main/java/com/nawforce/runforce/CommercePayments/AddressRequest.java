/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AddressRequest.htm
@SuppressWarnings("unused")
public class AddressRequest {
  public String city;
  public String companyName;
  public String country;
  public String postalCode;
  public String state;
  public String street;

  public AddressRequest() {throw new java.lang.UnsupportedOperationException();}
  public AddressRequest(String street, String city, String state, String country, String postalCode) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
