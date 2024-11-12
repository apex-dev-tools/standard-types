/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.String;

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
