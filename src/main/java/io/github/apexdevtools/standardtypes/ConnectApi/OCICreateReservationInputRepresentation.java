/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCICreateReservationInputRepresentation {
  public String actionRequestId;
  public Boolean allowPartialReservations;
  public List<OCICreateReservationSingleInputRepresentation> createRecords;
  public Integer expirationSeconds;
  public String externalRefId;
  public String reservationTime;

  public OCICreateReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
