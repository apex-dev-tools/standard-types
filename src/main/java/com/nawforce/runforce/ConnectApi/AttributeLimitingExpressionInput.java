/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class AttributeLimitingExpressionInput {
  public AttributeLimitingExpressionInput() {throw new java.lang.UnsupportedOperationException();}

  public String attributeName;
  public String entityName;
  public FilterSortOrderEnum order;
  public List<QueryPathInputConfig> queryPathConfig;
  public String type;
}
