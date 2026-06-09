/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
