/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DataCategoryMetadata {
  public io.github.apexdevtools.standardtypes.System.String groupName;
  public String label;
  public Map<String, DataCategoryValueMetadata> values;

  public DataCategoryMetadata() {throw new java.lang.UnsupportedOperationException();}
}
