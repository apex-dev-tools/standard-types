/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class ReadContext {
  public Integer maxResults;
  public List<Table> metadata;
  public Integer offset;

  public ReadContext() {throw new java.lang.UnsupportedOperationException();}
}
