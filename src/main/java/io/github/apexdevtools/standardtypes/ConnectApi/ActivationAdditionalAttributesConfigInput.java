/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationAdditionalAttributesConfigInput {
  public ActivationAdditionalAttributesConfigInput() {throw new java.lang.UnsupportedOperationException();}

  public String activationPlatformAttrId;
  public String dataSourceType;
  public String entityName;
  public List<AttributeFilterInput> filterExpression;
  public Boolean isRolluppable;
  public String label;
  public String name;
  public String preferredName;
  public List<QueryPathInputConfig> queryPathConfig;
  public String referenceAttributeName;
  public DataExportAttributeSourceEnum source;
  public DataExportAttributeTypeEnum type;
}
