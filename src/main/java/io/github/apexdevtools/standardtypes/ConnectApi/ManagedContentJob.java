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

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_connectapi_output_managed_content_job.htm
@SuppressWarnings("unused")
public class ManagedContentJob {
  public ManagedContentUserSummary createdBy;
  public Datetime createdDate;
  public String errorBodyUrl;
  public String id;
  // inputBodyUrl, lastModifiedBy, lastModifiedDate & outputBodyUrl: Documented for Winter '27 (API 68.0) but not yet available in the pre-release org; included to match the docs
  public String inputBodyUrl;
  public ManagedContentJobType jobType;
  public String lastModifiedBy;
  public Datetime lastModifiedDate;
  public Datetime lastStatusUpdateDate;
  public String name;
  public String outputBodyUrl;
  public Datetime startDate;
  public ManagedContentJobStatus status;

  public ManagedContentJob() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
