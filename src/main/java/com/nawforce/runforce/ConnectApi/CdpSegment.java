/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpSegment {
  public static CdpSegmentOutput createSegment(CdpSegmentInput input) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentOutput createSegment(CdpSegmentInput input, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentActionOutput deactivateSegmentByApiName(String segmentApiName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentActionOutput deactivateSegmentById(String segmentId) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteSegment(String segmentApiName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentActionOutput executePublishAdhoc(String segmentId) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentContainerOutput getSegment(String segmentApiName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentMemberOutput getSegmentMembers(Integer limit, Integer offset, String orderBy, String segmentApiName, String filters, List<String> fields) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentContainerOutput getSegments() {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentContainerOutput getSegmentsPaginated(Integer batchSize, Integer offset, String orderBy) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentContainerOutput getSegmentsPaginated(Integer batchSize, Integer offset, String orderBy, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static CdpSegmentOutput updateSegment(String segmentApiName, CdpSegmentInput input) {throw new java.lang.UnsupportedOperationException();}
}
