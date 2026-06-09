/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class Filter {
  public String columnName;
  public Object columnValue;
  public List<Filter> subfilters;
  public String tableName;
  public FilterType type;

  public Filter() {throw new java.lang.UnsupportedOperationException();}
}
