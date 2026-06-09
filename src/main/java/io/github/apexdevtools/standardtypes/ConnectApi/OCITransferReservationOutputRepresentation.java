/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class OCITransferReservationOutputRepresentation {
  public List<OCITransferReservationErrorOutputRepresentation> errors;
  public Boolean success;

  public OCITransferReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
