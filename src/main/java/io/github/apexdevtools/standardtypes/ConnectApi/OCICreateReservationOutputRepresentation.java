/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCICreateReservationOutputRepresentation {
  public List<OCICreateReservationSingleOutputRepresentation> details;
  public List<OCICreateReservationErrorOutputRepresentation> errors;
  public String expirationTime;
  public String reservationTime;
  public Boolean success;

  public OCICreateReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
