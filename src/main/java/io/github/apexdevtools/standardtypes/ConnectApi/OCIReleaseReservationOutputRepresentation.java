/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class OCIReleaseReservationOutputRepresentation {
  public List<OCIReleaseReservationErrorOutputRepresentation> errors;
  public Boolean success;

  public OCIReleaseReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
