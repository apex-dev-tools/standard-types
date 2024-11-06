/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OCIPublishLocationStructureStatusOutputRepresentation extends OCIBaseOutputRepresentation {
  public String endTimeUTC;
  public Integer recordsProcessedCount;
  public Integer recordsReadCount;
  public Integer recordsSkippedCount;
  public String startTimeUTC;
  public String status;
  public String uploadId;
  public List<String> validationErrors;
  public String validationStatus;

  public OCIPublishLocationStructureStatusOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
