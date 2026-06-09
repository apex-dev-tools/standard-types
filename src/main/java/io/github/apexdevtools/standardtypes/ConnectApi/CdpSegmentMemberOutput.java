/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class CdpSegmentMemberOutput {
  public List<CdpSegmentMemberRowOutput> data;
  public Datetime endTime;
  public String filter;
  public Integer limit;
  public String nextPageUrl;
  public Integer offSet;
  public String orderBy;
  public Integer rowCount;
  public Datetime startTime;
  public Integer totalCount;

  public CdpSegmentMemberOutput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
