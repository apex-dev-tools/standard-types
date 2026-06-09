/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.Boolean;

@SuppressWarnings("unused")
public class FieldMetadata {
  public String domain;
  public String field;
  public String fieldApiName;
  public FieldType fieldType;
  public Boolean filterable;
  public Boolean highlightable;
  public String label;
  public Boolean sortable;

  public FieldMetadata() {throw new java.lang.UnsupportedOperationException();}
}
