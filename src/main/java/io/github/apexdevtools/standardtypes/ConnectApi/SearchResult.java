/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchResult {
  public String apiName;
  public Map<String, RecordFieldValue> fields;
  public String id;
  public MatchInfo matchInfo;

  public SearchResult() {throw new java.lang.UnsupportedOperationException();}
}
