/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

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
