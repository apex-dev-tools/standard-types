/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContentVariant {
  public Map<String, Object> contentBody;
  public String contentKey;
  public ManagedContentSpaceSummary contentSpace;
  public ManagedContentTypeSummary contentType;
  public ManagedContentUserSummary createdBy;
  public Datetime createdDate;
  public String externalId;
  public ManagedContentFolderSummary folder;
  public Boolean isPublished;
  public String language;
  public ManagedContentUserSummary lastModifiedBy;
  public Datetime lastModifiedDate;
  public String managedContentId;
  public String managedContentVariantId;
  public String managedContentVersionId;
  public ManagedContentVariantStatusOutput status;
  public String title;
  public String urlName;
  public String versionNumber;

  public ManagedContentVariant() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
