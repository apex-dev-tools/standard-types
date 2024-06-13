/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class QueryContext {
  public String queryMoreToken;
  public TableSelection tableSelection;

  public QueryContext() {throw new java.lang.UnsupportedOperationException();}

  public static QueryContext get(List<Table> metadata, Integer offset, Integer maxResults, TableSelection tableSelection) {throw new java.lang.UnsupportedOperationException();}
}
