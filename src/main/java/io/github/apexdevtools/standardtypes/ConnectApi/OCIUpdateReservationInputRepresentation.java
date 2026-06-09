/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIUpdateReservationInputRepresentation {
  public String actionRequestId;
  public Boolean allowPartialReservations;
  public String externalRefId;
  public String reservationId;
  public String reservationTime;
  public Boolean updateAllOrNothingRecords;
  public List<OCIUpdateReservationSingleInputRepresentation> updateRecords;

  public OCIUpdateReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
