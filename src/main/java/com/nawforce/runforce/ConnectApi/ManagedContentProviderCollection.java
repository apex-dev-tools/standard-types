/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_connectapi_output_managed_content_provider_collection.htm
@SuppressWarnings("unused")
public class ManagedContentProviderCollection {
  public String currentPageUrl;
  public String nextPageUrl;
  public List<ManagedContentProvider> providers;
  public Integer total;

  public ManagedContentProviderCollection() {throw new java.lang.UnsupportedOperationException();}
}
