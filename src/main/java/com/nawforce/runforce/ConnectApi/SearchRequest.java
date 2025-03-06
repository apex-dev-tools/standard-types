/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
