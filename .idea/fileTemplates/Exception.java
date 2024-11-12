/*
 * Copyright (c) ${YEAR} Certinia Inc. All rights reserved.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

#if (${PACKAGE_NAME} != "com.nawforce.runforce.System")
import com.nawforce.runforce.System.Exception;
import com.nawforce.runforce.System.String;
#end

@SuppressWarnings("unused")
public class ${NAME} extends Exception {
  public ${NAME}() {throw new java.lang.UnsupportedOperationException();}
  public ${NAME}(Exception param1) {throw new java.lang.UnsupportedOperationException();}
  public ${NAME}(String param1) {throw new java.lang.UnsupportedOperationException();}
  public ${NAME}(String param1, Exception param2) {throw new java.lang.UnsupportedOperationException();}
}
