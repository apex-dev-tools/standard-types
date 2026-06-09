/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchAnswer {
  public String content;
  public String llmGenerationId;
  public Map<String, ObjectMetadata> metadata;
  public List<SearchObject> searchObjects;

  public SearchAnswer() {throw new java.lang.UnsupportedOperationException();}
}
