/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.SObjectStubs.ChatterActivity;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserDetail {
	public String aboutMe;
	public Address address;
	public BannerPhoto bannerPhoto;
	public ChatterActivity chatterActivity;
	public GlobalInfluence chatterInfluence;
	public String email;
	public Integer followersCount;
	public FollowingCounts followingCounts;
	public Integer groupCount;
	public Boolean hasChatter;
	public Boolean isActive;
	public String managerId;
	public String managerName;
	public PhoneNumber phoneNumbers;
	public Integer thanksReceived;
	public String username;

	public UserDetail() {throw new java.lang.UnsupportedOperationException();}

	public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
	public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
	public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
	public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
