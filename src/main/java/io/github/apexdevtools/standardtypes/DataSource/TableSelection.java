/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class TableSelection {
  public List<ColumnSelection> columnsSelected;
  public Filter filter;
  public List<Order> order;
  public String tableSelected;

  public TableSelection() {throw new java.lang.UnsupportedOperationException();}
}
