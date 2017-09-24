/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen Do not edit the class manually.
 */
package io.swagger.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

@Api(value = "conference", description = "the conference API")
public interface ConferenceApi {

  @ApiOperation(value = "Get all author ids in given dataset", notes = "", response = String.class, responseContainer = "List", tags = {
      "conference",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = String.class, responseContainer = "List"),
      @ApiResponse(code = 400, message = "Unknown dataset", response = Void.class)})

  @RequestMapping(value = "/conference/{dataset}/author",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<String>> getAuthorsByDataset(
      @ApiParam(value = "Dataset name of the conference", required = true) @PathVariable("dataset") String dataset,
      @ApiParam(value = "Author name or in short form") @RequestParam(value = "author", required = false) String author,
      @ApiParam(value = "Conference name") @RequestParam(value = "conference", required = false) String conference);


  @ApiOperation(value = "Get all cited papers in given dataset", notes = "", response = String.class, responseContainer = "List", tags = {
      "conference",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = String.class, responseContainer = "List"),
      @ApiResponse(code = 400, message = "Unknown dataset", response = Void.class)})

  @RequestMapping(value = "/conference/{dataset}/citation",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<String>> getCitationsByDataset(
      @ApiParam(value = "name of", required = true) @PathVariable("dataset") String dataset);


  @ApiOperation(value = "Get all names of conference datasets", notes = "", response = String.class, responseContainer = "List", tags = {
      "conference",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = String.class, responseContainer = "List")})

  @RequestMapping(value = "/conference",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<String>> getConfererences();


  @ApiOperation(value = "Get all papers in given dataset", notes = "", response = String.class, responseContainer = "List", tags = {
      "conference",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = String.class, responseContainer = "List"),
      @ApiResponse(code = 400, message = "Unknown dataset", response = Void.class)})

  @RequestMapping(value = "/conference/{dataset}/paper",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<String>> getPapersByDataset(
      @ApiParam(value = "Dataset name of the conference", required = true) @PathVariable("dataset") String dataset);


  @ApiOperation(value = "Find all years within the given dataset", notes = "Returns the range of years papers in this conference are published", response = Integer.class, responseContainer = "List", tags = {
      "conference",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "successful operation", response = Integer.class, responseContainer = "List"),
      @ApiResponse(code = 400, message = "Unknown dataset", response = Void.class)})

  @RequestMapping(value = "/conference/{dataset}/year",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<Integer>> getYearsByDataset(
      @ApiParam(value = "name of dataset", required = true) @PathVariable("dataset") String dataset);

}