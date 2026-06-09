/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class UpsertContext {
  public List<Map<String,Object>> rows;
  public String tableSelected;

  public UpsertContext() {throw new java.lang.UnsupportedOperationException();}
}
