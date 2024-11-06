/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCITransferReservationSingleOutputRepresentation {
  public String actionRequestId;
  public String externalRefId;
  public String fromLocationGroupIdentifier;
  public String fromLocationIdentifier;
  public Boolean ignoreAvailabilityCheck;
  public Double quantity;
  public String stockKeepingUnit;
  public String toLocationGroupIdentifier;
  public String toLocationIdentifier;

  public OCITransferReservationSingleOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
