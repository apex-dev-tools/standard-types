/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentCollectionItem {
  public Map<String, Object> body;
  public ManagedContentCollectionItemTypeSummary contentType;
  public String id;
  public String name;

  public ManagedContentCollectionItem() {throw new java.lang.UnsupportedOperationException();}
}
