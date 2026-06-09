/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class MCSFolderShare {
  public Boolean canUserUnshare;
  public MCSFolderShareStatus shareStatus;
  public String targetId;
  public String targetLabel;

  public MCSFolderShare() {throw new java.lang.UnsupportedOperationException();}
}
