/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OCIUploadInventoryAvailabilityStatusOutputRepresentation {
  public String endTimeUTC;
  public Integer recordsProcessedCount;
  public Integer recordsReadCount;
  public Integer recordsSkippedCount;
  public String startTimeUTC;
  public String status;
  public String uploadId;
  public List<String> validationErrors;
  public String validationStatus;

  public OCIUploadInventoryAvailabilityStatusOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
