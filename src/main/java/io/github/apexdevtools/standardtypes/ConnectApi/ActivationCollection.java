/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationCollection {
  public ActivationCollection() {throw new java.lang.UnsupportedOperationException();}

  public List<Activation> activations;
  public Integer batchSize;
  public Integer offset;
  public String orderByExpression;
}
