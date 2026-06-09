/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DeleteResult {
  public String errorMessage;
  public String externalId;
  public Boolean success;

  public DeleteResult() {throw new java.lang.UnsupportedOperationException();}
}
