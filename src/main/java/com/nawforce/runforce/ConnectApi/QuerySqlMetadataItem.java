/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class QuerySqlMetadataItem {
  public QuerySqlMetadataItem() {throw new java.lang.UnsupportedOperationException();}

  public QuerySqlMetadataItem innerElement;
  public String name;
  public Boolean nullable;
  public Integer precision;
  public Integer scale;
  public TypeEnum type;
}
