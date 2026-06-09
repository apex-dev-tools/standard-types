/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.RevSalesTrxn;

import io.github.apexdevtools.standardtypes.Schema.SObjectType;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class RecordResource {
  public Map<String, Object> criteria;
  public Map<String, Object> fieldValues;
  public String groupAction;
  public String id;
  public String method;
  public SObjectType type;

  public RecordResource(SObjectType type, String method, String groupAction, Map<String, Object> criteria) {throw new java.lang.UnsupportedOperationException();}
  public RecordResource(SObjectType type, String method, Id id) {throw new java.lang.UnsupportedOperationException();}
  public RecordResource(SObjectType type, String method) {throw new java.lang.UnsupportedOperationException();}
  public RecordResource() {throw new java.lang.UnsupportedOperationException();}
}
