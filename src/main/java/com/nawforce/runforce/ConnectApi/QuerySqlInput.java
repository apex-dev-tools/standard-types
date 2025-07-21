/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class QuerySqlInput {
  public QuerySqlInput() {throw new java.lang.UnsupportedOperationException();}

  public Integer adaptiveTimeout;
  public Map<String, String> querySettings;
  public Long rowLimit;
  public String sql;
  public List<QuerySqlParameterItem> sqlParameters;
}
