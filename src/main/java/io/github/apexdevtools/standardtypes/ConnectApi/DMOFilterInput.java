/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DMOFilterInput {
  public DMOFilterInput() {throw new java.lang.UnsupportedOperationException();}

  public BaseComparisonInput entityFilter;
  public String entityFilterType;
  public String entityName;
  public DmoFilterLimitInput filterLimit;
  public BaseComparisonInput inheritedFilter;
  public String inheritedFilterType;
  public List<QueryPathInputConfig> queryPathConfigForActivateOnToContainer;
  public List<QueryPathInputConfig> queryPathConfigFromContainerToEntity;
}
