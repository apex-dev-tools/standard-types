/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationAttribute {
  public ActivationAttribute() {throw new java.lang.UnsupportedOperationException();}

  public String activationPlatformAttrId;
  public String attributeLabel;
  public String attributeName;
  public String curatedFieldId;
  public String dataSourceType;
  public String entityName;
  public AttributeFilterExpression filterExpression;
  public List<QueryPathConfigList> path;
  public String preferredName;
  public String refAttrDeveloperName;
  public DataExportAttributeSourceEnum source;
  public DataExportAttributeTypeEnum type;
}
