/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

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
