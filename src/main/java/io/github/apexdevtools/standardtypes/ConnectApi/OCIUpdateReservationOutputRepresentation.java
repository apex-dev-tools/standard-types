/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIUpdateReservationOutputRepresentation {
  public List<OCIUpdateReservationSingleOutputRepresentation> details;
  public List<OCIUpdateReservationErrorOutputRepresentation> errors;
  public String reservationTime;
  public Boolean success;

  public OCIUpdateReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
