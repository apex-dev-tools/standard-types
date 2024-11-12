/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductAttributeSetInfo {
  public Map<String, ProductAttributeInfo> attributeInfo;
  public String description;
  public String developerName;
  public String id;
  public String masterLabel;
  public Integer sequence;

  public ProductAttributeSetInfo() {throw new java.lang.UnsupportedOperationException();}
}
