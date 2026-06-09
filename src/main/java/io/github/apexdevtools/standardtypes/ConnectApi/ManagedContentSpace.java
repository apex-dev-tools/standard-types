/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentSpace {
  public String apiName;
  public String createdBy;
  public Datetime createdDate;
  public String defaultLanguage;
  public String description;
  public String fullyQualifiedName;
  public String id;
  public Boolean isEnhancedSpace;
  public String lastModifiedBy;
  public Datetime lastModifiedDate;
  public String name;
  public String rootFolderId;
  public ManagedContentSpaceBaseType spaceType;

  public ManagedContentSpace() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
