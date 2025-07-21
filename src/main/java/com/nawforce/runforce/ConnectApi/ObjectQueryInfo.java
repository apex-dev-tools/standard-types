/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
