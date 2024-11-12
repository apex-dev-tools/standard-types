/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.aiplatform;

import com.nawforce.runforce.System.Exception;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ModelsAPI {

  public ModelsAPI() {throw new UnsupportedOperationException();}

  public createChatGenerations_Response createChatGenerations(createChatGenerations_Request input) {throw new UnsupportedOperationException();}
  public createEmbeddings_Response createEmbeddings(createEmbeddings_Request input) {throw new UnsupportedOperationException();}
  public createGenerations_Response createGenerations(createGenerations_Request input) {throw new UnsupportedOperationException();}
  public submitFeedback_Response submitFeedback(submitFeedback_Request input) {throw new UnsupportedOperationException();}

  public static class createChatGenerations_Request {
    public String modelName;
    public ModelsAPI_ChatGenerationsRequest body;

    public createChatGenerations_Request() {throw new UnsupportedOperationException();}
  }

  public static class createChatGenerations_Response {
    public ModelsAPI_ChatGenerationsResponse Code200;
    public Integer responseCode;

    public createChatGenerations_Response() {throw new UnsupportedOperationException();}
  }

  public static class createChatGenerations_ResponseException extends Exception {
    public Integer responseCode;
    public ModelsAPI_Error Code400;
    public ModelsAPI_Error Code401;
    public ModelsAPI_Error Code403;
    public ModelsAPI_Error Code423;
    public ModelsAPI_Error Code429;
    public ModelsAPI_Error Code500;
    public ModelsAPI_Error Code503;
    public ModelsAPI_Error defaultResponse;

    public createChatGenerations_ResponseException() {throw new UnsupportedOperationException();}
    public createChatGenerations_ResponseException(Exception param1) {throw new UnsupportedOperationException();}
    public createChatGenerations_ResponseException(String param1) {throw new UnsupportedOperationException();}
    public createChatGenerations_ResponseException(String param1, Exception param2) {throw new UnsupportedOperationException();}
  }

  public static class createGenerations_Request {
    public String modelName;
    public ModelsAPI_GenerationRequest body;

    public createGenerations_Request() {throw new UnsupportedOperationException();}
  }

  public static class createGenerations_Response {
    public ModelsAPI_GenerationResponse Code200;
    public Integer responseCode;

    public createGenerations_Response() {throw new UnsupportedOperationException();}
  }

  public static class createGenerations_ResponseException extends Exception {
    public Integer responseCode;
    public ModelsAPI_Error Code400;
    public ModelsAPI_Error Code401;
    public ModelsAPI_Error Code403;
    public ModelsAPI_Error Code423;
    public ModelsAPI_Error Code429;
    public ModelsAPI_Error Code500;
    public ModelsAPI_Error Code503;
    public ModelsAPI_Error defaultResponse;

    public createGenerations_ResponseException() {throw new UnsupportedOperationException();}
    public createGenerations_ResponseException(Exception param1) {throw new UnsupportedOperationException();}
    public createGenerations_ResponseException(String param1) {throw new UnsupportedOperationException();}
    public createGenerations_ResponseException(String param1, Exception param2) {throw new UnsupportedOperationException();}
  }

  public static class createEmbeddings_Request {
    public String modelName;
    public ModelsAPI_EmbeddingRequest body;

    public createEmbeddings_Request() {throw new UnsupportedOperationException();}
  }

  public static class createEmbeddings_Response {
    public ModelsAPI_EmbeddingResponse Code200;
    public Integer responseCode;

    public createEmbeddings_Response() {throw new UnsupportedOperationException();}
  }

  public static class createEmbeddings_ResponseException extends Exception {
    public Integer responseCode;
    public ModelsAPI_Error Code400;
    public ModelsAPI_Error Code401;
    public ModelsAPI_Error Code403;
    public ModelsAPI_Error Code423;
    public ModelsAPI_Error Code429;
    public ModelsAPI_Error Code500;
    public ModelsAPI_Error Code503;
    public ModelsAPI_Error defaultResponse;

    public createEmbeddings_ResponseException() {throw new UnsupportedOperationException();}
    public createEmbeddings_ResponseException(Exception param1) {throw new UnsupportedOperationException();}
    public createEmbeddings_ResponseException(String param1) {throw new UnsupportedOperationException();}
    public createEmbeddings_ResponseException(String param1, Exception param2) {throw new UnsupportedOperationException();}
  }

  public static class submitFeedback_Request {
    public ModelsAPI_FeedbackRequest body;

    public submitFeedback_Request() {throw new UnsupportedOperationException();}
  }

  public static class submitFeedback_Response {
    public ModelsAPI_submitFeedback_OUT_202 Code202;
    public Integer responseCode;

    public submitFeedback_Response() {throw new UnsupportedOperationException();}
  }

  public static class submitFeedback_ResponseException extends Exception {
    public Integer responseCode;
    public ModelsAPI_Error Code400;
    public ModelsAPI_Error Code401;
    public ModelsAPI_Error Code403;
    public ModelsAPI_Error Code423;
    public ModelsAPI_Error Code429;
    public ModelsAPI_Error Code500;
    public ModelsAPI_Error Code503;
    public ModelsAPI_Error defaultResponse;

    public submitFeedback_ResponseException() {throw new UnsupportedOperationException();}
    public submitFeedback_ResponseException(Exception param1) {throw new UnsupportedOperationException();}
    public submitFeedback_ResponseException(String param1) {throw new UnsupportedOperationException();}
    public submitFeedback_ResponseException(String param1, Exception param2) {throw new UnsupportedOperationException();}
  }

}
