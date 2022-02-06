package com.samsung.sds.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.samsung.sds.demo.api.model.LocationPoint;
import com.samsung.sds.demo.api.model.LocationPolygon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Locations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Locations   {
  @JsonProperty("id")
  private JsonNullable<String> id = JsonNullable.undefined();

  @JsonProperty("locationId")
  private Integer locationId;

  @JsonProperty("code")
  private JsonNullable<String> code = JsonNullable.undefined();

  @JsonProperty("parent_Id")
  private JsonNullable<String> parentId = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("location")
  private JsonNullable<LocationPoint> location = JsonNullable.undefined();

  @JsonProperty("polygon")
  private JsonNullable<LocationPolygon> polygon = JsonNullable.undefined();

  public Locations id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public Locations locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @ApiModelProperty(value = "")


  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public Locations code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public Locations parentId(String parentId) {
    this.parentId = JsonNullable.of(parentId);
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getParentId() {
    return parentId;
  }

  public void setParentId(JsonNullable<String> parentId) {
    this.parentId = parentId;
  }

  public Locations description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public Locations latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  @ApiModelProperty(value = "")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Locations longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  @ApiModelProperty(value = "")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Locations location(LocationPoint location) {
    this.location = JsonNullable.of(location);
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<LocationPoint> getLocation() {
    return location;
  }

  public void setLocation(JsonNullable<LocationPoint> location) {
    this.location = location;
  }

  public Locations polygon(LocationPolygon polygon) {
    this.polygon = JsonNullable.of(polygon);
    return this;
  }

  /**
   * Get polygon
   * @return polygon
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<LocationPolygon> getPolygon() {
    return polygon;
  }

  public void setPolygon(JsonNullable<LocationPolygon> polygon) {
    this.polygon = polygon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locations locations = (Locations) o;
    return Objects.equals(this.id, locations.id) &&
        Objects.equals(this.locationId, locations.locationId) &&
        Objects.equals(this.code, locations.code) &&
        Objects.equals(this.parentId, locations.parentId) &&
        Objects.equals(this.description, locations.description) &&
        Objects.equals(this.latitude, locations.latitude) &&
        Objects.equals(this.longitude, locations.longitude) &&
        Objects.equals(this.location, locations.location) &&
        Objects.equals(this.polygon, locations.polygon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, code, parentId, description, latitude, longitude, location, polygon);
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
    sb.append("class Locations {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
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

