/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIFulfillReservationInputRepresentation {
  public List<OCIFulfillReservationSingleInputRepresentation> fulfillmentRecords;
  public String reservationId;

  public OCIFulfillReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
