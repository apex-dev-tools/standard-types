/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCIGetInventoryAvailabilityInputRepresentation {
  public String locationGroupIdentifier;
  public List<String> locationGroupIdentifiers;
  public List<String> locationIdentifiers;
  public String stockKeepingUnit;
  public List<String> stockKeepingUnits;
  public Boolean useCache;

  public OCIGetInventoryAvailabilityInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
