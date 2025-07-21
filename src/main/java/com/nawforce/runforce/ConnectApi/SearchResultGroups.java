/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SearchResultGroups {
  public Map<String, ObjectMetadata> metadata;
  public QueryInfo queryInfo;
  public SearchResultGroup resultGroups;
  public List<SearchObject> searchObjects;

  public SearchResultGroups() {throw new java.lang.UnsupportedOperationException();}
}
