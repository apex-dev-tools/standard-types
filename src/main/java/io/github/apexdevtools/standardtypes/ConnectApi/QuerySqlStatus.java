/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class QuerySqlStatus {
  public QuerySqlStatus() {throw new java.lang.UnsupportedOperationException();}

  public Long chunkCount;
  public QuerySqlStatusEnum completionStatus;
  public String expirationTime;
  public Double progress;
  public String queryId;
  public Long rowCount;
}
