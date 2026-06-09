/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_connectapi_output_managed_content_provider_instance.htm
@SuppressWarnings("unused")
public class ManagedContentProviderInstance {
  public String instanceKey;
  public Boolean isDefault;
  public String name;
  public String providerInstanceId;

  public ManagedContentProviderInstance() {throw new java.lang.UnsupportedOperationException();}
}
