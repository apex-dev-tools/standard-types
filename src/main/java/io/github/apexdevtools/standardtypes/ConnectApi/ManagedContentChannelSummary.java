/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentChannelSummary extends AbstractManagedContentChannelRepresentation {
  public String domainUrl;
  public String id;
  public String name;
  public String resourceUrl;
  public ManagedContentChannelTargetSummary target;
  public ManagedContentChannelType type;
  public String url;

  public ManagedContentChannelSummary() {throw new java.lang.UnsupportedOperationException();}
}
