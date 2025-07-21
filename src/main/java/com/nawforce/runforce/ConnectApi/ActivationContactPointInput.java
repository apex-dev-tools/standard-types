/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
