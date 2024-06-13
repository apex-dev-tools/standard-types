/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

@SuppressWarnings("unused")
public class UpsertResult {
  public String errorMessage;
  public String externalId;
  public Boolean success;

  public UpsertResult() {throw new java.lang.UnsupportedOperationException();}

  public static UpsertResult failure(String externalId, String errorMessage) {throw new java.lang.UnsupportedOperationException();}
  public static UpsertResult success(String externalId) {throw new java.lang.UnsupportedOperationException();}

  public Boolean $equals(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer $hashCode() {throw new java.lang.UnsupportedOperationException();}
}
