package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Author;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

@Controller
public class AuthorApiController implements AuthorApi {


  public ResponseEntity<Author> getAuthorById(
      @ApiParam(value = "id of the author", required = true) @PathVariable("id") String id) {
    // do some magic!
    return new ResponseEntity<Author>(HttpStatus.OK);
  }

  public ResponseEntity<List<String>> getAuthors() {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

}
