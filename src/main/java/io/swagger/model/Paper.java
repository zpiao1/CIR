package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Paper
 */
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

public class Paper {

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("abstract")
  private String _abstract = null;

  @JsonProperty("authors")
  private List<String> authors = null;

  @JsonProperty("inCitations")
  private List<String> inCitations = null;

  @JsonProperty("outCitations")
  private List<String> outCitations = null;

  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("conference")
  private String conference = null;

  public Paper id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Paper title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   **/
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Paper _abstract(String _abstract) {
    this._abstract = _abstract;
    return this;
  }

  /**
   * Get _abstract
   *
   * @return _abstract
   **/
  @ApiModelProperty(value = "")

  public String getAbstract() {
    return _abstract;
  }

  public void setAbstract(String _abstract) {
    this._abstract = _abstract;
  }

  public Paper authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public Paper addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

  /**
   * Get authors
   *
   * @return authors
   **/
  @ApiModelProperty(value = "")

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public Paper inCitations(List<String> inCitations) {
    this.inCitations = inCitations;
    return this;
  }

  public Paper addInCitationsItem(String inCitationsItem) {
    if (this.inCitations == null) {
      this.inCitations = new ArrayList<String>();
    }
    this.inCitations.add(inCitationsItem);
    return this;
  }

  /**
   * Get inCitations
   *
   * @return inCitations
   **/
  @ApiModelProperty(value = "")

  public List<String> getInCitations() {
    return inCitations;
  }

  public void setInCitations(List<String> inCitations) {
    this.inCitations = inCitations;
  }

  public Paper outCitations(List<String> outCitations) {
    this.outCitations = outCitations;
    return this;
  }

  public Paper addOutCitationsItem(String outCitationsItem) {
    if (this.outCitations == null) {
      this.outCitations = new ArrayList<String>();
    }
    this.outCitations.add(outCitationsItem);
    return this;
  }

  /**
   * Get outCitations
   *
   * @return outCitations
   **/
  @ApiModelProperty(value = "")

  public List<String> getOutCitations() {
    return outCitations;
  }

  public void setOutCitations(List<String> outCitations) {
    this.outCitations = outCitations;
  }

  public Paper year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   *
   * @return year
   **/
  @ApiModelProperty(value = "")

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Paper conference(String conference) {
    this.conference = conference;
    return this;
  }

  /**
   * Get conference
   *
   * @return conference
   **/
  @ApiModelProperty(value = "")

  public String getConference() {
    return conference;
  }

  public void setConference(String conference) {
    this.conference = conference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paper paper = (Paper) o;
    return Objects.equals(this.id, paper.id) &&
        Objects.equals(this.title, paper.title) &&
        Objects.equals(this._abstract, paper._abstract) &&
        Objects.equals(this.authors, paper.authors) &&
        Objects.equals(this.inCitations, paper.inCitations) &&
        Objects.equals(this.outCitations, paper.outCitations) &&
        Objects.equals(this.year, paper.year) &&
        Objects.equals(this.conference, paper.conference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, _abstract, authors, inCitations, outCitations, year, conference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paper {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    inCitations: ").append(toIndentedString(inCitations)).append("\n");
    sb.append("    outCitations: ").append(toIndentedString(outCitations)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

