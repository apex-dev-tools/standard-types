/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class SearchAnswer {
  public String content;
  public String llmGenerationId;
  public Map<String, ObjectMetadata> metadata;
  public List<SearchObject> searchObjects;

  public SearchAnswer() {throw new java.lang.UnsupportedOperationException();}
}
