/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Order {
  public String columnName;
  public OrderDirection direction;
  public String tableName;

  public Order() {throw new java.lang.UnsupportedOperationException();}

  public static Order get(String tableName, String columnName, OrderDirection direction) {throw new java.lang.UnsupportedOperationException();}
}
