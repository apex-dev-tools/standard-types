/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class TableSelection {
  public List<ColumnSelection> columnsSelected;
  public Filter filter;
  public List<Order> order;
  public String tableSelected;

  public TableSelection() {throw new java.lang.UnsupportedOperationException();}
}
