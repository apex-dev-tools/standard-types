/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

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
