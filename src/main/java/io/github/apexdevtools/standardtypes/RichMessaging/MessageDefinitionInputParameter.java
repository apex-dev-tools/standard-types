/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.RichMessaging;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Date;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class MessageDefinitionInputParameter {
    public Boolean booleanValue;
    public List<Boolean> booleanValues;
    public Datetime dateTimeValue;
    public List<Datetime> dateTimeValues;
    public Date dateValue;
    public List<Date> dateValues;
    public String name;
    public Double numberValue;
    public List<Double> numberValues;
    public String recordIdValue;
    public List<String> recordIdValues;
    public String textValue;
    public List<String> textValues;

    public MessageDefinitionInputParameter() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
