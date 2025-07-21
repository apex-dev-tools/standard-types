/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class AttributeFilterInput {
  public AttributeFilterInput() {throw new java.lang.UnsupportedOperationException();}

  public String attributeId;
  public String attributeName;
  public Datetime dateUnits;
  public String operator;
  public FilterOperatorDataTypeEnum type;
  public List<String> value;
}
