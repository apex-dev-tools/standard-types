/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SearchObject {
  public List<String> displayFields;
  public String objectApiName;
  public List<SearchAppliedOrderBy> orderBy;
  public PageInfo pageInfo;
  public List<SearchResult> searchResults;
  public SpellCorrectionInfo spellCorrectionInfo;
  public SearchStatus status;

  public SearchObject() {throw new java.lang.UnsupportedOperationException();}
}
