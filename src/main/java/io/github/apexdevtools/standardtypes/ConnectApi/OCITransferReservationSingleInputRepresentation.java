/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCITransferReservationSingleInputRepresentation {
  String actionRequestId;
  String externalRefId;
  String fromLocationGroupIdentifier;
  String fromLocationIdentifier;
  Boolean ignoreAvailabilityCheck;
  Double quantity;
  String reservationId;
  String stockKeepingUnit;
  String toLocationGroupIdentifier;
  String toLocationIdentifier;

  public OCITransferReservationSingleInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
