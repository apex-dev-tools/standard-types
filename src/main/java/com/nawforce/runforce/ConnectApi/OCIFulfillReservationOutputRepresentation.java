/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;

@SuppressWarnings("unused")
public class OCIFulfillReservationOutputRepresentation {
  public List<OCIFulfillReservationErrorOutputRepresentation> errors;
  public Boolean success;

  public OCIFulfillReservationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
