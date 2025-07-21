/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
