/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductDeliverEstimationOutputRepresentation {
  public Datetime estimatedDeliveryDate;
  public Datetime estimatedShipDate;
  public Double quantity;
  public String routingCalculationType;
  public String stockKeepingUnit;

  public ProductDeliverEstimationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
