/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchResultGroups {
  public Map<String, ObjectMetadata> metadata;
  public QueryInfo queryInfo;
  public SearchResultGroup resultGroups;
  public List<SearchObject> searchObjects;

  public SearchResultGroups() {throw new java.lang.UnsupportedOperationException();}
}
