/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductDeliverEstimationOutputRepresentation {
  public Datetime estimatedDeliveryDate;
  public Datetime estimatedShipDate;
  public Double quantity;
  public String routingCalculationType;
  public String stockKeepingUnit;

  public ProductDeliverEstimationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
