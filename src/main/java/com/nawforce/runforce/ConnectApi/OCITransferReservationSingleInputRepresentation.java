/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

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
