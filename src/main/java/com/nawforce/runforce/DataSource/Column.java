/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Column extends DataSourceUtil {
  public Integer decimalPlaces;
  public String description;
  public Boolean filterable;
  public String label;
  public Integer length;
  public String name;
  public String referenceTargetField;
  public String referenceTo;
  public Boolean sortable;
  public DataType type;

  public Column() {throw new java.lang.UnsupportedOperationException();}

  public static Column $boolean(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column currency(String name, Integer length, Integer decimalPlaces) {throw new java.lang.UnsupportedOperationException();}
  public static Column datetime(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column email(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column externalLookup(String name, String domain) {throw new java.lang.UnsupportedOperationException();}
  public static Column get(String name, String label, String description, Boolean isSortable, Boolean isFilterable, DataType type, Integer length, Integer decimalPlaces, String referenceTo, String referenceTargetField) {throw new java.lang.UnsupportedOperationException();}
  public static Column get(String name, String label, String description, Boolean isSortable, Boolean isFilterable, DataType type, Integer length, Integer decimalPlaces) {throw new java.lang.UnsupportedOperationException();}
  public static Column get(String name, String label, String description, Boolean isSortable, Boolean isFilterable, DataType type, Integer length) {throw new java.lang.UnsupportedOperationException();}
  public static Column indirectLookup(String name, String domain, String targetField) {throw new java.lang.UnsupportedOperationException();}
  public static Column integer(String name, Integer length) {throw new java.lang.UnsupportedOperationException();}
  public static Column lookup(String name, String domain) {throw new java.lang.UnsupportedOperationException();}
  public static Column number(String name, Integer length, Integer decimalPlaces) {throw new java.lang.UnsupportedOperationException();}
  public static Column percent(String name, Integer length, Integer decimalPlaces) {throw new java.lang.UnsupportedOperationException();}
  public static Column phone(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column text(String name, String label, Integer length) {throw new java.lang.UnsupportedOperationException();}
  public static Column text(String name, Integer length) {throw new java.lang.UnsupportedOperationException();}
  public static Column text(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column textarea(String name) {throw new java.lang.UnsupportedOperationException();}
  public static Column url(String name, Integer length) {throw new java.lang.UnsupportedOperationException();}
  public static Column url(String name) {throw new java.lang.UnsupportedOperationException();}
}
