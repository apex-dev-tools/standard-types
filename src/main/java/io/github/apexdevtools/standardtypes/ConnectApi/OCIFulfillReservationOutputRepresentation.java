/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class OCIFulfillReservationOutputRepresentation {
  public List<OCIFulfillReservationErrorOutputRepresentation> errors;
  public Boolean success;

  public OCIFulfillReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
