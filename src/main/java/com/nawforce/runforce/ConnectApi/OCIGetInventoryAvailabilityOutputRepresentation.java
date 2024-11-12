/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;

@SuppressWarnings("unused")
public class OCIGetInventoryAvailabilityOutputRepresentation extends OCIBaseOutputRepresentation {
  public List<OCILocationGroupAvailabilityOutputRepresentation> locationGroups;
  public List<OCILocationAvailabilityOutputRepresentation> locations;

  public OCIGetInventoryAvailabilityOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
