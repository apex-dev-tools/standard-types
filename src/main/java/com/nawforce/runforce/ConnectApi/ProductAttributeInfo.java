/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductAttributeInfo {
  public List<String> allowableValues;
  public String apiName;
  public List<String> availableValues;
  public String fieldEnumOrId;
  public String label;
  public String objectName;
  public List<ProductAttributeValueMetadataRepresentation> options;
  public Integer sequence;
  public ProductAttributeViewType viewType;

  public ProductAttributeInfo() {throw new java.lang.UnsupportedOperationException();}
}
