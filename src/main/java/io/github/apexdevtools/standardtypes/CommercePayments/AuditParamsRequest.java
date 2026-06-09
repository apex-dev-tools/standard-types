/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_AuditParamsRequest.htm
@SuppressWarnings("unused")
public abstract class AuditParamsRequest {
  public String email;
  public String ipAddress;
  public String macAddress;
  public String phone;

  public AuditParamsRequest(String email, String macAddress, String ipAddress, String phone) {throw new java.lang.UnsupportedOperationException();}
}
