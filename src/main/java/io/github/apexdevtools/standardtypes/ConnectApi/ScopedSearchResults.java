/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class ScopedSearchResults {
  public ObjectMetadata metadata;
  public ObjectQueryInfo objectQueryInfo;
  public List<SearchResult> results;
  public SearchObject searchObject;

  public ScopedSearchResults() {throw new java.lang.UnsupportedOperationException();}
}
