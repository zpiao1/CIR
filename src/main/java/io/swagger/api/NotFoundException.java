package io.swagger.api;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

public class NotFoundException extends ApiException {

  private int code;

  public NotFoundException(int code, String msg) {
    super(code, msg);
    this.code = code;
  }
}
