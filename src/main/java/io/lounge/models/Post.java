package io.lounge.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PostDO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-16T12:49:56.829Z")

public class Post   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("userId")
  private BigDecimal userId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("isCorrectAnswer")
  private Boolean isCorrectAnswer = null;

  @JsonProperty("responses")
  @Valid
  private List<Post> responses = null;

  @JsonProperty("hashtags")
  @Valid
  private List<Hashtag> hashtags = null;

  public Post id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Post timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date of post
   * @return timestamp
  **/
  @ApiModelProperty(value = "date of post")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Post userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

  /**
   * author
   * @return userId
  **/
  @ApiModelProperty(value = "author")

  @Valid

  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public Post text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Post type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * 0 = post, 1 = question
   * @return type
  **/
  @ApiModelProperty(value = "0 = post, 1 = question")

  @Valid

  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Post isCorrectAnswer(Boolean isCorrectAnswer) {
    this.isCorrectAnswer = isCorrectAnswer;
    return this;
  }

  /**
   * Get isCorrectAnswer
   * @return isCorrectAnswer
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsCorrectAnswer() {
    return isCorrectAnswer;
  }

  public void setIsCorrectAnswer(Boolean isCorrectAnswer) {
    this.isCorrectAnswer = isCorrectAnswer;
  }

  public Post responses(List<Post> responses) {
    this.responses = responses;
    return this;
  }

  public Post addResponsesItem(Post responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<Post>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * Get responses
   * @return responses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Post> getResponses() {
    return responses;
  }

  public void setResponses(List<Post> responses) {
    this.responses = responses;
  }

  public Post hashtags(List<Hashtag> hashtags) {
    this.hashtags = hashtags;
    return this;
  }

  public Post addHashtagsItem(Hashtag hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<Hashtag>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

  /**
   * Get hashtags
   * @return hashtags
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Hashtag> getHashtags() {
    return hashtags;
  }

  public void setHashtags(List<Hashtag> hashtags) {
    this.hashtags = hashtags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.id, post.id) &&
        Objects.equals(this.timestamp, post.timestamp) &&
        Objects.equals(this.userId, post.userId) &&
        Objects.equals(this.text, post.text) &&
        Objects.equals(this.type, post.type) &&
        Objects.equals(this.isCorrectAnswer, post.isCorrectAnswer) &&
        Objects.equals(this.responses, post.responses) &&
        Objects.equals(this.hashtags, post.hashtags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, userId, text, type, isCorrectAnswer, responses, hashtags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCorrectAnswer: ").append(toIndentedString(isCorrectAnswer)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

