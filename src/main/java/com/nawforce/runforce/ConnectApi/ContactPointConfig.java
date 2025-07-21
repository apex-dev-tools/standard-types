/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ContactPointConfig {
  public ContactPointConfig() {throw new java.lang.UnsupportedOperationException();}

  public ActivationContactPointsFieldConfig activationContactPointFieldConfig;
  public ActivationContactPointsSourceConfig activationContactPointSourcesConfig;
  public ContactPointFilterExpression contactPointFilterExpression;
  public String contactPointPath;
  public ContactPointTypeRepresentationEnum contactPointType;
  public String entityId;
  public String entityName;
  public List<QueryPathConfigList> queryPathConfigList;
}
