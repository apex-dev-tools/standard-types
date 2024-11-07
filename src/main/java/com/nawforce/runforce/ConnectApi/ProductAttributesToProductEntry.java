/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductAttributesToProductEntry {
  public String canonicalKey;
  public String productId;
  public List<ProductAttributeSelectionInfo> selectedAttributes;
  public String urlName;

  public ProductAttributesToProductEntry() {throw new java.lang.UnsupportedOperationException();}
}
