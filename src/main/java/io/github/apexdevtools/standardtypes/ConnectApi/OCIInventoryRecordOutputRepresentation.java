/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIInventoryRecordOutputRepresentation {
  public Double availableToFulfill;
  public Double availableToOrder;
  public Datetime effectiveDate;
  public Boolean exists;
  public List<OCIFutureInventoryOutputRepresentation> futures;
  public Double onHand;
  public Double reserved;
  public Double safetyStockCount;
  public String stockKeepingUnit;

  public OCIInventoryRecordOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
