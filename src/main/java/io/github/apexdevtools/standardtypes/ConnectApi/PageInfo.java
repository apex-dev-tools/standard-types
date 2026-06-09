/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;

@SuppressWarnings("unused")
public class PageInfo {
  public Boolean hasNextPage;
  public Integer offset;
  public Integer pageSize;

  public PageInfo() {throw new java.lang.UnsupportedOperationException();}
}
