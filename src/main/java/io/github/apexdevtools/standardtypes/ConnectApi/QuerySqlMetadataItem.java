/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class QuerySqlMetadataItem {
  public QuerySqlMetadataItem() {throw new java.lang.UnsupportedOperationException();}

  public QuerySqlMetadataItem innerElement;
  public String name;
  public Boolean nullable;
  public Integer precision;
  public Integer scale;
  public TypeEnum type;
}
