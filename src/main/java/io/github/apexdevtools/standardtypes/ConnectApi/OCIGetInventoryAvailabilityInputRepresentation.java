/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
