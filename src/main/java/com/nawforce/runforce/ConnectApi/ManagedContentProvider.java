/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_connectapi_output_managed_content_provider.htm
@SuppressWarnings("unused")
public class ManagedContentProvider {
  public String componentDefinition;
  public String icon;
  public String label;
  public String providerId;
  public List<ManagedContentProviderInstance> providerInstances;
  public String providerLightningComponentId;
  public ManagedContentProviderType type;

  public ManagedContentProvider() {throw new java.lang.UnsupportedOperationException();}
}
