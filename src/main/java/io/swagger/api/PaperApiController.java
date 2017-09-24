package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Paper;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

@Controller
public class PaperApiController implements PaperApi {


  public ResponseEntity<Paper> getPaperById(
      @ApiParam(value = "ID of the paper", required = true) @PathVariable("id") String id) {
    // do some magic!
    return new ResponseEntity<Paper>(HttpStatus.OK);
  }

  public ResponseEntity<List<String>> getPapers(
      @ApiParam(value = "Name of the author of papers") @RequestParam(value = "author", required = false) String author,
      @ApiParam(value = "Year of the paper published") @RequestParam(value = "year", required = false) Integer year) {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

}
