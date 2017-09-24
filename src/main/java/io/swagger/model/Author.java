package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Author
 */
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-24T19:22:52.557+08:00")

public class Author {

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("affiliation")
  private String affiliation = null;

  @JsonProperty("papers")
  private List<String> papers = null;

  public Author id(String id) {
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

  public Author name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author affiliation(String affiliation) {
    this.affiliation = affiliation;
    return this;
  }

  /**
   * Get affiliation
   *
   * @return affiliation
   **/
  @ApiModelProperty(value = "")

  public String getAffiliation() {
    return affiliation;
  }

  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  public Author papers(List<String> papers) {
    this.papers = papers;
    return this;
  }

  public Author addPapersItem(String papersItem) {
    if (this.papers == null) {
      this.papers = new ArrayList<String>();
    }
    this.papers.add(papersItem);
    return this;
  }

  /**
   * Get papers
   *
   * @return papers
   **/
  @ApiModelProperty(value = "")

  public List<String> getPapers() {
    return papers;
  }

  public void setPapers(List<String> papers) {
    this.papers = papers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.id, author.id) &&
        Objects.equals(this.name, author.name) &&
        Objects.equals(this.affiliation, author.affiliation) &&
        Objects.equals(this.papers, author.papers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, affiliation, papers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affiliation: ").append(toIndentedString(affiliation)).append("\n");
    sb.append("    papers: ").append(toIndentedString(papers)).append("\n");
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

