/*
 * Copyright (c) 2026 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DocumentAI;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class MatchingRecord {
  public Map<String,Object> data;
  public Map<String,Object> fieldValues;
  public Double matchScore;
  public String objectName;
  public Id recordId;

  public MatchingRecord() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
