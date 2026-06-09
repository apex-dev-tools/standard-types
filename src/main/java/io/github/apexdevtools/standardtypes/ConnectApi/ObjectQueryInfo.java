/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ObjectQueryInfo {
  public ObjectQueryInfo() {throw new java.lang.UnsupportedOperationException();}

  public List<String> displayFields;
  public Boolean hasMoreResults;
  public Integer numberOfMatches;
  public List<SearchAppliedOrderBy> orderBy;
  public String source;
  public SpellCorrectionInfo spellCorrectionInfo;
  public SearchStatus status;
}
