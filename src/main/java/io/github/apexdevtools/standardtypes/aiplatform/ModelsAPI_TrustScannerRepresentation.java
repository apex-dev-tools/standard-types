/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.aiplatform;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class ModelsAPI_TrustScannerRepresentation {
  public Boolean isDetected;
  public List<ModelsAPI_TrustCategoryDetail> categories;

  public ModelsAPI_TrustScannerRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
