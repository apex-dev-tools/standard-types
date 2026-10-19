/*
 Copyright (c) 2026 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package io.github.apexdevtools.standardtypes.Database;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_Database_QueryOptions.htm
@SuppressWarnings("unused")
public class QueryOptions {
  private QueryOptions() {throw new java.lang.UnsupportedOperationException();}

  public static QueryOptionsBuilder builder() {throw new java.lang.UnsupportedOperationException();}
  public String getDataspace() {throw new java.lang.UnsupportedOperationException();}
  public Boolean getExplicitNamespace() {throw new java.lang.UnsupportedOperationException();}
  public Boolean getHonorEmptyStrings() {throw new java.lang.UnsupportedOperationException();}
}
