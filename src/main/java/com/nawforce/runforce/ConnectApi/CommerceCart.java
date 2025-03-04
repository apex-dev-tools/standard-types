/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CommerceCart {
  public static CartItem addItemToCart(String webstoreId, String effectiveAccountId, String activeCartOrId, CartItemInput cartItemInput, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static BatchResult[] addItemsToCart(String webstoreId, String effectiveAccountId, String activeCartOrId, List<BatchInput> cartItems) {throw new java.lang.UnsupportedOperationException();}
  public static BatchResult[] addItemsToCart(String webstoreId, String effectiveAccountId, String activeCartOrId, List<BatchInput> cartItems, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartItem addItemToCart(String webstoreId, String effectiveAccountId, String activeCartOrId, CartItemInput cartItemInput) {throw new java.lang.UnsupportedOperationException();}
  public static CartCouponCollection applyCartCoupon(String webstoreId, String effectiveAccountId, String activeCartOrId, CartCouponInput cartCouponInput) {throw new java.lang.UnsupportedOperationException();}
  public static CartCouponCollection applyCartCoupon(String webstoreId, String effectiveAccountId, String activeCartOrId, CartCouponInput cartCouponInput, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartToWishlistResult copyCartToWishlist(String webstoreId, String effectiveAccountId, String activeCartOrId, CartToWishlistInput cartToWishlistInput) {throw new java.lang.UnsupportedOperationException();}
  public static CalculateCartResult calculateCart(String webstoreId, String activeCartOrId, String effectiveAccountId) {throw new UnsupportedOperationException();}
  public static CalculateCartResult calculateCart(String webstoreId, String activeCartOrId, String effectiveAccountId, ConnectApiCalculateCartInput calculateCartInput) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary createCart(String webstoreId, CartInput cart) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary cloneCart(String webstoreId, String activeCartOrId, String targetEffectiveAccountId, String targetType) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteCart(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteCartCoupon(String webstoreId, String effectiveAccountId, String activeCartOrId, String cartCouponId) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteCartCoupon(String webstoreId, String effectiveAccountId, String activeCartOrId, String cartCouponId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteCartItem(String webstoreId, String effectiveAccountId, String activeCartOrId, String cartItemId) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteInventoryReservation(String webstoreId, String activeCartOrId, String effectiveAccountId) {throw new java.lang.UnsupportedOperationException();}
  public static CalculateCartResult evaluateShipping(String webstoreId, String activeCartOrId, String effectiveAccountId, CartEvaluateShippingInput cartEvaluateShippingInput) {throw new java.lang.UnsupportedOperationException();}
  public static CalculateCartResult evaluateTaxes(String webstoreId, String activeCartOrId, String effectiveAccountId, CartEvaluateTaxInput cartEvaluateTaxInput) {throw new java.lang.UnsupportedOperationException();}
  public static CartCouponCollection getCartCoupons(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static CartCouponCollection getCartCoupons(String webstoreId, String effectiveAccountId, String activeCartOrId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemPromotionCollectionOutputRepresentation getCartItemPromotion(String webstoreId, String effectiveAccountId, String activeCartOrId, CartItemPromotionCollectionInputRepresentation cartItemPromotionCollectionInput) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemPromotionCollectionOutputRepresentation getCartItemPromotion(String webstoreId, String effectiveAccountId, String activeCartOrId, CartItemPromotionCollectionInputRepresentation cartItemPromotionCollectionInput, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String pageParam) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String pageParam, CartItemSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String pageParam, Integer pageSize) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String pageParam, Integer pageSize, CartItemSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String productFields, String pageParam, Integer pageSize, CartItemSortOrder sortParam) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String productFields, String pageParam, Integer pageSize, CartItemSortOrder sortParam, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String productFields, String pageParam, Integer pageSize, CartItemSortOrder sortParam, String currencyIsoCode, Boolean includePromotions, Boolean includeCoupons) {throw new java.lang.UnsupportedOperationException();}
  public static CartItemCollection getCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, String productFields, String pageParam, Integer pageSize, CartItemSortOrder sortParam, String currencyIsoCode, Boolean includePromotions, Boolean includeCoupons, Integer pageNumber) {throw new java.lang.UnsupportedOperationException();}
  public static CartPromotionCollection getCartPromotions(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static CartPromotionCollection getCartPromotions(String webstoreId, String effectiveAccountId, String activeCartOrId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary getCartSummary(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary getCartSummary(String webstoreId, String effectiveAccountId, String activeCartOrId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary getOrCreateActiveCartSummary(String webstoreId, String effectiveAccountId, String activeCartOrId) {throw new java.lang.UnsupportedOperationException();}
  public static CartSummary getOrCreateActiveCartSummary(String webstoreId, String effectiveAccountId, String activeCartOrId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static ProductCartItem getProductCartItem(String webstoreId, String effectiveAccountId, String activeCartOrId, String productId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static ProductCartItemCollection getProductCartItems(String webstoreId, String effectiveAccountId, String activeCartOrId, Integer pageSize, Integer pageNumber, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CommerceActionResult makeCartPrimary(String webstoreId, String activeCartOrId, String effectiveAccountId) {throw new java.lang.UnsupportedOperationException();}
  public static PreserveCart preserveGuestCart(String webstoreId, String effectiveAccountId, String activeCartOrId, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartMessagesVisibilityResult setCartMessagesVisibility(String webstoreId, String activeCartOrId, String effectiveAccountId, CartMessagesVisibilityInput messageVisibility) {throw new java.lang.UnsupportedOperationException();}
  public static CartItem updateCartItem(String webstoreId, String effectiveAccountId, String activeCartOrId, String cartItemId, CartItemInput cartItem) {throw new java.lang.UnsupportedOperationException();}
  public static CartItem updateCartItem(String webstoreId, String effectiveAccountId, String activeCartOrId, String cartItemId, CartItemInput cartItem, String currencyIsoCode) {throw new java.lang.UnsupportedOperationException();}
  public static CartInventoryReservationOutputRepresentation upsertInventoryReservation(String webstoreId, String activeCartOrId, String effectiveAccountId, CartInventoryReservationInputRepresentation cartInventoryReservationInput) {throw new java.lang.UnsupportedOperationException();}
}
