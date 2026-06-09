/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.RichMessaging;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Integer;

@SuppressWarnings("unused")
public class TimeSlotOption {
    public Integer duration;
    public Datetime startTime;

    public TimeSlotOption() {throw new java.lang.UnsupportedOperationException();}
    public TimeSlotOption(Datetime startTime, Datetime endTime) {throw new java.lang.UnsupportedOperationException();}
    public TimeSlotOption(Datetime startTime, Integer duration) {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
