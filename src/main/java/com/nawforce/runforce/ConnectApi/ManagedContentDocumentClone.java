/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
