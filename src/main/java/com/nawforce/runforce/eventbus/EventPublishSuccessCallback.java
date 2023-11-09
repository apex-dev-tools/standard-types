/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.eventbus;

@SuppressWarnings("unused")
public interface EventPublishSuccessCallback {
  void onSuccess(SuccessResult result);
}
