/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCIUpdateReservationOutputRepresentation {
  public List<OCIUpdateReservationSingleOutputRepresentation> details;
  public List<OCIUpdateReservationErrorOutputRepresentation> errors;
  public String reservationTime;
  public Boolean success;

  public OCIUpdateReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
