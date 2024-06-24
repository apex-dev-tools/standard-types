/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DataSource;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Table extends DataSourceUtil {
  public List<Column> columns;
  public String description;
  public String labelPlural;
  public String labelSingular;
  public String name;
  public String nameColumn;

  public Table() {throw new java.lang.UnsupportedOperationException();}

  public static Table get(String name, String labelSingular, String labelPlural, String description, String nameColumn, List<Column> columns) {throw new java.lang.UnsupportedOperationException();}
  public static Table get(String name, String nameColumn, List<Column> columns) {throw new java.lang.UnsupportedOperationException();}
}
