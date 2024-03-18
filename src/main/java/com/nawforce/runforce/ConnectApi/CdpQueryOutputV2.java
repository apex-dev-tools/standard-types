/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpQueryOutputV2 {
  public List<CdpQueryV2Row> data;
  public Boolean done;
  public String endTime;
  public Map<String,CdpQueryMetadataItem> metadata;
  public String nextBatchId;
  public String queryId;
  public Integer rowCount;
  public String startTime;

  public CdpQueryOutputV2() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
