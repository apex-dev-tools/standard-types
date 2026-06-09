/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchContext {
  public String searchPhrase;
  public List<TableSelection> tableSelections;

  public SearchContext() {throw new java.lang.UnsupportedOperationException();}
  public SearchContext(List<Table> metadata, Integer offset, Integer maxResults, List<TableSelection> tableSelections, String searchPhrase) {throw new java.lang.UnsupportedOperationException();}
}
