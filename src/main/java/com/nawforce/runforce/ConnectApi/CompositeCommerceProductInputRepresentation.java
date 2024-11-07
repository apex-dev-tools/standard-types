/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CompositeCommerceProductInputRepresentation {
  public ProductAttributeSetInputRepresentation attributeSetInfo;
  public List<String> categoryIds;
  public Map<String, String> productFields;
  public ProductMedia productMedia;

  public CompositeCommerceProductInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
