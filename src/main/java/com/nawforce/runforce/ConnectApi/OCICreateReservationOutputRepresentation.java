/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCICreateReservationOutputRepresentation {
  public List<OCICreateReservationSingleOutputRepresentation> details;
  public List<OCICreateReservationErrorOutputRepresentation> errors;
  public String expirationTime;
  public String reservationTime;
  public Boolean success;

  public OCICreateReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
