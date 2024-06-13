/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class UpsertContext {
  public List<Map<String,Object>> rows;
  public String tableSelected;

  public UpsertContext() {throw new java.lang.UnsupportedOperationException();}
}
