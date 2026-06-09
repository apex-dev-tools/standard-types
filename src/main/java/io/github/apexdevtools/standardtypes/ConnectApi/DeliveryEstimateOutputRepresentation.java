/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DeliveryEstimateOutputRepresentation {
  public DeliveryEstimationErrorOutputRepresentation error;
  public String location;
  public List<ProductDeliverEstimationOutputRepresentation> productDeliverEstimations;
  public String shippingCarrierMethodExternalReference;

  public DeliveryEstimateOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
