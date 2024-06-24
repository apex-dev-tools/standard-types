/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;

@SuppressWarnings("unused")
public class ReadContext {
  public Integer maxResults;
  public List<Table> metadata;
  public Integer offset;

  public ReadContext() {throw new java.lang.UnsupportedOperationException();}
}
