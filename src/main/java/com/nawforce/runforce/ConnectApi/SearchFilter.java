/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SearchFilter {
  public String field;
  public FilterOperator operator;
  public List<AbstractList> values;

  public SearchFilter() {throw new java.lang.UnsupportedOperationException();}
}
