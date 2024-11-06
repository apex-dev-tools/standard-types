/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCIFulfillReservationSingleInputRepresentation {
  public String actionRequestId;
  public String externalRefId;
  public String locationIdentifier;
  public Double quantity;
  public String reservationId;
  public String stockKeepingUnit;

  public OCIFulfillReservationSingleInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
