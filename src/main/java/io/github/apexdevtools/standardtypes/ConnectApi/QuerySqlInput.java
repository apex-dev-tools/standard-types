/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class QuerySqlInput {
  public QuerySqlInput() {throw new java.lang.UnsupportedOperationException();}

  public Integer adaptiveTimeout;
  public Map<String, String> querySettings;
  public Long rowLimit;
  public String sql;
  public List<QuerySqlParameterItem> sqlParameters;
}
