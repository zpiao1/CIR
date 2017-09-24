package io.swagger.api;


import io.swagger.annotations.ApiParam;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

@Controller
public class ConferenceApiController implements ConferenceApi {


  public ResponseEntity<List<String>> getAuthorsByDataset(
      @ApiParam(value = "Dataset name of the conference", required = true) @PathVariable("dataset") String dataset,
      @ApiParam(value = "Author name or in short form") @RequestParam(value = "author", required = false) String author,
      @ApiParam(value = "Conference name") @RequestParam(value = "conference", required = false) String conference) {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

  public ResponseEntity<List<String>> getCitationsByDataset(
      @ApiParam(value = "name of", required = true) @PathVariable("dataset") String dataset) {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

  public ResponseEntity<List<String>> getConfererences() {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

  public ResponseEntity<List<String>> getPapersByDataset(
      @ApiParam(value = "Dataset name of the conference", required = true) @PathVariable("dataset") String dataset) {
    // do some magic!
    return new ResponseEntity<List<String>>(HttpStatus.OK);
  }

  public ResponseEntity<List<Integer>> getYearsByDataset(
      @ApiParam(value = "name of dataset", required = true) @PathVariable("dataset") String dataset) {
    // do some magic!
    return new ResponseEntity<List<Integer>>(HttpStatus.OK);
  }

}
