/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
