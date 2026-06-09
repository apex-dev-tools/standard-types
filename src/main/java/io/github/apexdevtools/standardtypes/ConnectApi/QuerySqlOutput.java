/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Long;

@SuppressWarnings("unused")
public class QuerySqlOutput {
  public QuerySqlOutput() {throw new java.lang.UnsupportedOperationException();}

  public QuerySqlRowRepresentation dataRows;
  public QuerySqlMetadataItem metadata;
  public Long returnedRows;
  public QuerySqlStatus status;
}
