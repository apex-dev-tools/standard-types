/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.Integer;

@SuppressWarnings("unused")
public class TableResult {
  public String errorMessage;
  public String queryMoreToken;
  public List<Map<String,Object>> rows;
  public Boolean success;
  public String tableName;
  public Integer totalSize;

  public TableResult() {throw new java.lang.UnsupportedOperationException();}

  public static TableResult error(String errorMessage) {throw new java.lang.UnsupportedOperationException();}
  public static TableResult get(Boolean success, String errorMessage, String tableName, List<Map<String,Object>> rows, Integer totalSize) {throw new java.lang.UnsupportedOperationException();}
  public static TableResult get(Boolean success, String errorMessage, String tableName, List<Map<String,Object>> rows) {throw new java.lang.UnsupportedOperationException();}
  public static TableResult get(QueryContext queryContext, List<Map<String,Object>> rows) {throw new java.lang.UnsupportedOperationException();}
  public static TableResult get(TableSelection tableSelection, List<Map<String,Object>> rows) {throw new java.lang.UnsupportedOperationException();}
}
