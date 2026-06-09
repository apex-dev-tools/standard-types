/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.Boolean;

@SuppressWarnings("unused")
public class Search {
  public static SearchAnswer answer(String q) {throw new java.lang.UnsupportedOperationException();}
  public static SearchAnswer answer(String q, String objectApiName) {throw new java.lang.UnsupportedOperationException();}
  public static SearchAnswer answer(String q, String objectApiName, List<String> displayFields) {throw new java.lang.UnsupportedOperationException();}
  public static SearchResultGroups findAndGroup(String q) {throw new java.lang.UnsupportedOperationException();}
  public static SearchResultGroups findAndGroup(String q, String configurationName) {throw new java.lang.UnsupportedOperationException();}
  public static SearchResultGroups findAndGroup(String q, String configurationName, Boolean highlights) {throw new java.lang.UnsupportedOperationException();}
  public static ScopedSearchResults find(String objectApiName, SearchRequest request) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestAnswer(String q, SearchAnswer result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestAnswer(String q, String objectApiName, SearchAnswer result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestAnswer(String q, String objectApiName, List<String> displayFields, SearchAnswer result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestFindAndGroup(String q, SearchResultGroups result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestFindAndGroup(String q, String configurationName, SearchResultGroups result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestFindAndGroup(String q, String configurationName, Boolean highlights, SearchResultGroups result) {throw new java.lang.UnsupportedOperationException();}
  public static void setTestFind(String objectApiName, SearchRequest request, ScopedSearchResults result) {throw new java.lang.UnsupportedOperationException();}
}
