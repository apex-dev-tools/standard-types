/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDocumentClone {
  public String apiName;
  public ManagedContentDocumentCloneStatus cloneStatus;
  public String contentKey;
  public String errorMessage;
  public List<ManagedContentFailedVariants> failedVariants;
  public ManagedContentFolderSummary folder;
  public String managedContentId;
  public String resourceURL;
  public String sourceContentKeyOrId;
  public String title;
  public List<ManagedContentClonedVariants> variants;

  public ManagedContentDocumentClone() {throw new java.lang.UnsupportedOperationException();}
}
