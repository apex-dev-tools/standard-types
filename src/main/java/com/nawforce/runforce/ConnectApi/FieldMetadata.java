/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Boolean;

@SuppressWarnings("unused")
public class FieldMetadata {
  public String domain;
  public String field;
  public String fieldApiName;
  public FieldType fieldType;
  public Boolean filterable;
  public Boolean highlightable;
  public String label;
  public Boolean sortable;

  public FieldMetadata() {throw new java.lang.UnsupportedOperationException();}
}
