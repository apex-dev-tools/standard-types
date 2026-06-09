/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchFilter {
  public String field;
  public FilterOperator operator;
  public List<AbstractList> values;

  public SearchFilter() {throw new java.lang.UnsupportedOperationException();}
}
