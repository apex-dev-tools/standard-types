/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public abstract class OCIBaseOutputRepresentation {
  public List<ErrorResponse> errors;
  public Boolean success;
}
