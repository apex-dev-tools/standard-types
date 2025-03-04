/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DeliveryEstimateOutputRepresentation {
  public DeliveryEstimationErrorOutputRepresentation error;
  public String location;
  public List<ProductDeliverEstimationOutputRepresentation> productDeliverEstimations;
  public String shippingCarrierMethodExternalReference;

  public DeliveryEstimateOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
