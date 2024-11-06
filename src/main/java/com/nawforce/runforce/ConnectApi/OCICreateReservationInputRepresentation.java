/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
