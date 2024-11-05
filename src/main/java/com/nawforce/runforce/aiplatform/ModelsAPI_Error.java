/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.aiplatform;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_Error {
  public String errorCode;
  public String messageCode;
  public String message;
  public List<ModelsAPI_Error_targets> targets;
  public List<ModelsAPI_Error_parameters> parameters;
  public Map<String, Object> properties;

  public ModelsAPI_Error() {throw new java.lang.UnsupportedOperationException();}
}
