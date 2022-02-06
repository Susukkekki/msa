package com.samsung.sds.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationPolygon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class LocationPolygon   {
  @JsonProperty("type")
  private JsonNullable<String> type = JsonNullable.undefined();

  @JsonProperty("coordinates")
  @Valid
  private JsonNullable<List<List<List<Double>>>> coordinates = JsonNullable.undefined();

  public LocationPolygon type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(readOnly = true, value = "")


  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public LocationPolygon coordinates(List<List<List<Double>>> coordinates) {
    this.coordinates = JsonNullable.of(coordinates);
    return this;
  }

  public LocationPolygon addCoordinatesItem(List<List<Double>> coordinatesItem) {
    if (this.coordinates == null || !this.coordinates.isPresent()) {
      this.coordinates = JsonNullable.of(new ArrayList<>());
    }
    this.coordinates.get().add(coordinatesItem);
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  */
  @ApiModelProperty(readOnly = true, value = "")

  @Valid

  public JsonNullable<List<List<List<Double>>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(JsonNullable<List<List<List<Double>>>> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationPolygon locationPolygon = (LocationPolygon) o;
    return Objects.equals(this.type, locationPolygon.type) &&
        Objects.equals(this.coordinates, locationPolygon.coordinates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationPolygon {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

