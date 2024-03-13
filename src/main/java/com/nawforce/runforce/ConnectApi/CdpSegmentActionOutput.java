/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpSegmentActionOutput extends CdpActionResponse {
  public String errorCode;
  public String errorMessage;
  public String jobId;
  public String partitionId;
  public String publishStatus;
  public String segmentApiName;
  public String segmentId;

  public CdpSegmentActionOutput() {throw new java.lang.UnsupportedOperationException();}
}
