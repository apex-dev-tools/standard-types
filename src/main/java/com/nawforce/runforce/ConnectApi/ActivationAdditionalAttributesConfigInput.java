/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
