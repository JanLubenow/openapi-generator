/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AdditionalPropertiesClass
 */
@JsonPropertyOrder({
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_PROPERTY,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_OF_MAP_PROPERTY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
public class AdditionalPropertiesClass {
  public static final String JSON_PROPERTY_MAP_PROPERTY = "map_property";
  @javax.annotation.Nullable
  private Map<String, String> mapProperty;

  public static final String JSON_PROPERTY_MAP_OF_MAP_PROPERTY = "map_of_map_property";
  @javax.annotation.Nullable
  private Map<String, Map<String, String>> mapOfMapProperty;

  public AdditionalPropertiesClass() {
  }

  public AdditionalPropertiesClass mapProperty(@javax.annotation.Nullable Map<String, String> mapProperty) {
    
    this.mapProperty = mapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapPropertyItem(String key, String mapPropertyItem) {
    if (this.mapProperty == null) {
      this.mapProperty = new HashMap<>();
    }
    this.mapProperty.put(key, mapPropertyItem);
    return this;
  }

  /**
   * Get mapProperty
   * @return mapProperty
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMapProperty() {
    return mapProperty;
  }


  @JsonProperty(JSON_PROPERTY_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapProperty(@javax.annotation.Nullable Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }

  public AdditionalPropertiesClass mapOfMapProperty(@javax.annotation.Nullable Map<String, Map<String, String>> mapOfMapProperty) {
    
    this.mapOfMapProperty = mapOfMapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapOfMapPropertyItem(String key, Map<String, String> mapOfMapPropertyItem) {
    if (this.mapOfMapProperty == null) {
      this.mapOfMapProperty = new HashMap<>();
    }
    this.mapOfMapProperty.put(key, mapOfMapPropertyItem);
    return this;
  }

  /**
   * Get mapOfMapProperty
   * @return mapOfMapProperty
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAP_OF_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }


  @JsonProperty(JSON_PROPERTY_MAP_OF_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapOfMapProperty(@javax.annotation.Nullable Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(this.mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapProperty, mapOfMapProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
    sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
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

