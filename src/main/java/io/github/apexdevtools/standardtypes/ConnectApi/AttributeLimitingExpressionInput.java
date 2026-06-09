/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class AttributeLimitingExpressionInput {
  public AttributeLimitingExpressionInput() {throw new java.lang.UnsupportedOperationException();}

  public String attributeName;
  public String entityName;
  public FilterSortOrderEnum order;
  public List<QueryPathInputConfig> queryPathConfig;
  public String type;
}
