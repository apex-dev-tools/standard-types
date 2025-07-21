/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DmoFilter {
  public DmoFilter() {throw new java.lang.UnsupportedOperationException();}

  public BaseComparison entityFilter;
  public String entityFilterType;
  public String entityName;
  public DmoFilterLimit filterLimit;
  public BaseComparison inheritedFilter;
  public String inheritedFilterType;
  public List<QueryPathConfigList> pathFromActivateOnToContainer;
  public List<QueryPathConfigList> pathFromContainerToEntity;
}
