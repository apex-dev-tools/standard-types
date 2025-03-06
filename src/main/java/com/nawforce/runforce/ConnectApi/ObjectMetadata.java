/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ObjectMetadata {
  public Map<String, DataCategoryMetadata> dataCategories;
  public Map<String, FieldMetadata> fields;
  public String label;
  public String labelPlural;
  public String objectApiName;
  public ThemeInfo themeInfo;

  public ObjectMetadata() {throw new java.lang.UnsupportedOperationException();}
}
