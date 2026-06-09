/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class EstimateDeliveryDateOutputRepresentation {
  public List<DeliveryEstimateOutputRepresentation> deliveryEstimates;
  public String estimatedDeliveryReference;

  public EstimateDeliveryDateOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
