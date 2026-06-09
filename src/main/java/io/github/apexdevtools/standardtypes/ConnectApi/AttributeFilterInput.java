/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class AttributeFilterInput {
  public AttributeFilterInput() {throw new java.lang.UnsupportedOperationException();}

  public String attributeId;
  public String attributeName;
  public Datetime dateUnits;
  public String operator;
  public FilterOperatorDataTypeEnum type;
  public List<String> value;
}
