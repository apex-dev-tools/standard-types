/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.RichMessaging;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Integer;

@SuppressWarnings("unused")
public class TimeSlotOption {
    public Integer duration;
    public Datetime startTime;

    public TimeSlotOption() {throw new java.lang.UnsupportedOperationException();}
    public TimeSlotOption(Datetime startTime, Datetime endTime) {throw new java.lang.UnsupportedOperationException();}
    public TimeSlotOption(Datetime startTime, Integer duration) {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
