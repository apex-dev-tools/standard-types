/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;

@SuppressWarnings("unused")
public abstract class OCIBaseOutputRepresentation {
  public List<ErrorResponse> errors;
  public Boolean success;
}
