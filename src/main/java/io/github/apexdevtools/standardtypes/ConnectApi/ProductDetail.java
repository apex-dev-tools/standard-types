/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductDetail {
  public Map<String, ProductAttributeSetInfo> attributeSetInfo;
  public ProductMedia defaultImage;
  public ProductEntitlement entitlement;
  public Map<String, String> fields;
  public String id;
  public List<ProductMediaGroup> mediaGroups;
  public ProductCategoryPath primaryProductCategoryPath;
  public ProductClass productClass;
  public List<ProductSellingModel> productSellingModels;
  public PurchaseQuantityRule purchaseQuantityRule;
  public String urlName;
  public ProductAttributeSet variationAttributeSet;
  public ProductVariationInfo variationInfo;
  public String variationParentId;

  public ProductDetail() {throw new java.lang.UnsupportedOperationException();}
}
