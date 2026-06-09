/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class AttributeFilterExpression {
  public AttributeFilterExpression() {throw new java.lang.UnsupportedOperationException();}

  public FilterConjunctionEnum conjunction;
  public List<AttributeFilter> filters;
}
