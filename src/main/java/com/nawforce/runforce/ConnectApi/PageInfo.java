/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;

@SuppressWarnings("unused")
public class PageInfo {
  public Boolean hasNextPage;
  public Integer offset;
  public Integer pageSize;

  public PageInfo() {throw new java.lang.UnsupportedOperationException();}
}
