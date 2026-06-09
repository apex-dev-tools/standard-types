/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationContactPointSourceConfig {
  public ActivationContactPointSourceConfig() {throw new java.lang.UnsupportedOperationException();}

  public String dataSourceId;
  public String dataSourceName;
  public ContactPointPrefEnum dataSourcePreference;
  public Integer dataSourcePriority;
}
