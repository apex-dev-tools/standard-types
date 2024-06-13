/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Filter {
  public String columnName;
  public Object columnValue;
  public List<Filter> subfilters;
  public String tableName;
  public FilterType type;

  public Filter() {throw new java.lang.UnsupportedOperationException();}
}
