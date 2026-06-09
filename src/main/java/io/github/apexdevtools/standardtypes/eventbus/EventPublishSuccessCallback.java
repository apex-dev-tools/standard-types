/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.eventbus;

@SuppressWarnings("unused")
public interface EventPublishSuccessCallback {
  void onSuccess(SuccessResult result);
}
