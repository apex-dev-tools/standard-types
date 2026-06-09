/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIReleaseReservationInputRepresentation {
  public List<OCIReleaseReservationSingleInputRepresentation> releaseRecords;
  public String reservationId;

  public OCIReleaseReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
