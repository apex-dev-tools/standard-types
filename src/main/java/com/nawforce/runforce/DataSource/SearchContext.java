/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SearchContext {
  public String searchPhrase;
  public List<TableSelection> tableSelections;

  public SearchContext() {throw new java.lang.UnsupportedOperationException();}
  public SearchContext(List<Table> metadata, Integer offset, Integer maxResults, List<TableSelection> tableSelections, String searchPhrase) {throw new java.lang.UnsupportedOperationException();}
}
