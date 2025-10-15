/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_interface_commercepayments_PaymentGatewayAsyncAdapter.htm
@SuppressWarnings("unused")
public interface PaymentGatewayAsyncAdapter {
  GatewayNotificationResponse processNotification(PaymentGatewayNotificationContext gatewayNotificationContext);
}
