/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class MCSFolderShareCollectionUpdateInput {
  public List<MCSFolderShareInput> shareWith;
  public List<String> unshareWith;

  public MCSFolderShareCollectionUpdateInput() {throw new java.lang.UnsupportedOperationException();}
}
