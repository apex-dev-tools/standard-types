/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class QueryContext {
  public String queryMoreToken;
  public TableSelection tableSelection;

  public QueryContext() {throw new java.lang.UnsupportedOperationException();}

  public static QueryContext get(List<Table> metadata, Integer offset, Integer maxResults, TableSelection tableSelection) {throw new java.lang.UnsupportedOperationException();}
}
