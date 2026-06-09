/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

@SuppressWarnings("unused")
public enum Capability {
  MULTI_PICKLIST,
  PICKLIST,
  QUERY_PAGINATION_SERVER_DRIVEN,
  QUERY_TOTAL_SIZE,
  REQUIRE_ENDPOINT,
  REQUIRE_HTTPS,
  ROW_CREATE,
  ROW_DELETE,
  ROW_QUERY,
  ROW_UPDATE,
  SEARCH
}
