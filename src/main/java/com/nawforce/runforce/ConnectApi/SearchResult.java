/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SearchResult {
  public String apiName;
  public Map<String, RecordFieldValue> fields;
  public String id;
  public MatchInfo matchInfo;

  public SearchResult() {throw new java.lang.UnsupportedOperationException();}
}
