/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchRequest {
  public String q;
  public String configurationName;
  public List<SearchDataCategory> dataCategories;
  public List<String> displayFields;
  public List<SearchFilter> filters;
  public Boolean highlights;
  public Integer offset;
  public List<SearchOrderBy> orderBy;
  public Integer pageSize;
  public Boolean spellcheck;

  public SearchRequest() {throw new java.lang.UnsupportedOperationException();}
}
