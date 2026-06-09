/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCITransferReservationInputRepresentation {
  String allOrNothingTransferId;
  String reservationId;
  List<OCITransferReservationSingleInputRepresentation> transferRecords;

  public OCITransferReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
