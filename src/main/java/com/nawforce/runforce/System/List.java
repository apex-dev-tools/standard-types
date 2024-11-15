/*
 Copyright (c) 2018 Kevin Jones, All rights reserved.
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

import com.nawforce.runforce.Schema.SObjectType;

@SuppressWarnings("unused")
public class List<T> implements Iterable<T> {
    public List() {throw new java.lang.UnsupportedOperationException();}
    public List(List<T> listToCopy) {throw new java.lang.UnsupportedOperationException();}
    public List(Set<T> setToCopy) {throw new java.lang.UnsupportedOperationException();}
    public List(Integer size) {throw new java.lang.UnsupportedOperationException();}

    public void add(T listElement) {throw new java.lang.UnsupportedOperationException();}
    public void add(Integer index, T listElement) {throw new java.lang.UnsupportedOperationException();}
    public void addAll(List<T> fromList) {throw new java.lang.UnsupportedOperationException();}
    public void addAll(Set<T> fromSet) {throw new java.lang.UnsupportedOperationException();}
    public void clear() {throw new java.lang.UnsupportedOperationException();}
    public Boolean contains(T listElement) {throw new java.lang.UnsupportedOperationException();}
    public List<T> deepClone() {throw new java.lang.UnsupportedOperationException();}
    public List<T> deepClone(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
    public List<T> deepClone(Boolean preserveId, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
    public List<T> deepClone(Boolean preserveId, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
    public T get(Integer index) {throw new java.lang.UnsupportedOperationException();}
    public SObjectType getSObjectType() {throw new java.lang.UnsupportedOperationException();}
    public Integer indexOf(T listElement) {throw new java.lang.UnsupportedOperationException();}
    public Iterator<T> iterator() {throw new java.lang.UnsupportedOperationException();}
    public Boolean isEmpty() {throw new java.lang.UnsupportedOperationException();}
    public T remove(Integer index) {throw new java.lang.UnsupportedOperationException();}
    public void set(Integer index, T listElement) {throw new java.lang.UnsupportedOperationException();}
    public Integer size() {throw new java.lang.UnsupportedOperationException();}
    public void sort() {throw new java.lang.UnsupportedOperationException();}
    public void sort(Comparator<T> comparator) {throw new java.lang.UnsupportedOperationException();}
    public String toString$() {throw new java.lang.UnsupportedOperationException();}

    public List<T> clone$() {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public Boolean equals(List<T> other) {throw new java.lang.UnsupportedOperationException();}
}
