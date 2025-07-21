/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.embeddedai;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class RecordApexRepresentation {
  public RecordApexRepresentation() {throw new java.lang.UnsupportedOperationException();}

  public String objectType;
  public List<ApexMap> recordData;
  public List<RecordApexRepresentation> relatedRecordData;
}
