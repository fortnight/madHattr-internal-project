package io.reflectoring.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A new hat object to be created by post call. Id will be generated and enriched to create Hat object.
 */
@ApiModel(description = "A new hat object to be created by post call. Id will be generated and enriched to create Hat object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T10:57:25.142-04:00[America/New_York]")

public class NewHat   {
  /**
   * The color of the new hat
   */
  public enum ColorEnum {
    RED("RED"),
    
    ORANGE("ORANGE"),
    
    YELLOW("YELLOW"),
    
    GREEN("GREEN"),
    
    BLUE("BLUE"),
    
    PURPLE("PURPLE"),
    
    WHITE("WHITE"),
    
    BLACK("BLACK"),
    
    GRAY("GRAY"),
    
    BROWN("BROWN");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("color")
  private ColorEnum color;

  @JsonProperty("description")
  private String description;

  @JsonProperty("type")
  private String type;

  public NewHat color(ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the new hat
   * @return color
  */
  @ApiModelProperty(required = true, value = "The color of the new hat")
  @NotNull


  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public NewHat description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the new hat object.
   * @return description
  */
  @ApiModelProperty(value = "The description of the new hat object.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewHat type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of new hat object.
   * @return type
  */
  @ApiModelProperty(required = true, value = "The type of new hat object.")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewHat newHat = (NewHat) o;
    return Objects.equals(this.color, newHat.color) &&
        Objects.equals(this.description, newHat.description) &&
        Objects.equals(this.type, newHat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHat {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

