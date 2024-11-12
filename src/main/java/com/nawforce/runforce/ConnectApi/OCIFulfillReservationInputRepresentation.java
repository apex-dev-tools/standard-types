/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCIFulfillReservationInputRepresentation {
  public List<OCIFulfillReservationSingleInputRepresentation> fulfillmentRecords;
  public String reservationId;

  public OCIFulfillReservationInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
