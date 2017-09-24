package io.swagger.api;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

public class ApiException extends Exception {

  private int code;

  public ApiException(int code, String msg) {
    super(msg);
    this.code = code;
  }
}
