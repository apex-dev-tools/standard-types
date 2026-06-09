/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDocument {
  public String apiName;
  public Map<String, Object> contentBody;
  public String contentFqn;
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

  public ManagedContentDocument() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
