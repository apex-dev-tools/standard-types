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

package com.nawforce.runforce.System;

import com.nawforce.runforce.Search.SearchResults;
import com.nawforce.runforce.Search.SuggestionResults;

@SuppressWarnings("unused")
public class Search {
	public static SearchResults find(String searchQuery) {throw new java.lang.UnsupportedOperationException();}
	public static SearchResults find(String searchQuery, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<List<SObject>> query(String searchQuery) {throw new java.lang.UnsupportedOperationException();}
	public static List<List<SObject>> query(String searchQuery, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SuggestionResults suggest(String searchQuery, String sObjectType, Object options) {throw new java.lang.UnsupportedOperationException();}
	public static SuggestionResults suggest(String searchQuery, String sObjectType, Object options, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
}
