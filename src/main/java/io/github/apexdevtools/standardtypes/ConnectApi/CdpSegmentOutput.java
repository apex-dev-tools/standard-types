/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class CdpSegmentOutput {
  public String apiName;
  public String dataSpace;
  public String description;
  public String developerName;
  public String displayName;
  public String excludeCriteria;
  public String includeCriteria;
  public CdpSegmentDbtPipeline includeDbt;
  public String marketSegmentDefinitionId;
  public String marketSegmentId;
  public String nextPublishDateTime;
  public String publishInterval;
  public String publishScheduleEndDate;
  public String publishScheduleStartDateTime;
  public String publishStatus;
  public CdpSegmentMembershipTableOutput segmentMembershipDmo;
  public String segmentMembershipTable;
  public String segmentOnApiName;
  public String segmentOnId;
  public String segmentStatus;
  public String segmentType;

  public CdpSegmentOutput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
