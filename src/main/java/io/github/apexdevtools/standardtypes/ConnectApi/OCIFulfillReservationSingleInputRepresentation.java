/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIFulfillReservationSingleInputRepresentation {
  public String actionRequestId;
  public String externalRefId;
  public String locationIdentifier;
  public Double quantity;
  public String reservationId;
  public String stockKeepingUnit;

  public OCIFulfillReservationSingleInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
