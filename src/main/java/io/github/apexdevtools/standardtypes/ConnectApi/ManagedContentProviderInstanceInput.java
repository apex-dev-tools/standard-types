/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_connectapi_input_managed_content_provider_instance.htm
@SuppressWarnings("unused")
public class ManagedContentProviderInstanceInput {
  public String instanceKey;
  public Boolean isDefault;
  public String name;
  public String providerLightningComponentId;

  public ManagedContentProviderInstanceInput() {throw new java.lang.UnsupportedOperationException();}
}
