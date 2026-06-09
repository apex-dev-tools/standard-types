/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationContactPointInput {
  public ActivationContactPointInput() {throw new java.lang.UnsupportedOperationException();}

  public List<ContactPointAttributeInput> attributesConfig;
  public String entityName;
  public String externalPlatformHashMethod;
  public List<DMOFilterInput> filterExpression;
  public List<QueryPathInputConfig> queryPathConfig;
  public List<ContactPointSourceInput> sourcesConfig;
  public ContactPointTypeRepresentationEnum type;
}
