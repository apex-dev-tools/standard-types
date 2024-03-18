/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpSegmentInput {
  public Map<String,String> additionalMetadata;
  public String dataSpace;
  public String description;
  public String developerName;
  public String displayName;
  public CdpSegmentDbtInput includeDbt;
  public PublishSchedule publishSchedule;
  public String publishScheduleEndDate;
  public String publishScheduleStartDateTime;
  public String segmentOnApiName;
  public SegmentType segmentType;

  public CdpSegmentInput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
