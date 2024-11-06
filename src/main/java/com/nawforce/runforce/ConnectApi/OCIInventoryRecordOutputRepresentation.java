/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.String;

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
