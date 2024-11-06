/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCITransferReservationInputRepresentation {
  String allOrNothingTransferId;
  String reservationId;
  List<OCITransferReservationSingleInputRepresentation> transferRecords;

  public OCITransferReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
