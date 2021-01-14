// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookChartPoint. */
@Fluent
public final class MicrosoftGraphWorkbookChartPoint extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookChartPoint.class);

    /*
     * Json
     */
    @JsonProperty(value = "value")
    private Map<String, Object> value;

    /*
     * workbookChartPointFormat
     */
    @JsonProperty(value = "format")
    private MicrosoftGraphWorkbookChartPointFormat format;

    /*
     * workbookChartPoint
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the value property: Json.
     *
     * @return the value value.
     */
    public Map<String, Object> value() {
        return this.value;
    }

    /**
     * Set the value property: Json.
     *
     * @param value the value value to set.
     * @return the MicrosoftGraphWorkbookChartPoint object itself.
     */
    public MicrosoftGraphWorkbookChartPoint withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the format property: workbookChartPointFormat.
     *
     * @return the format value.
     */
    public MicrosoftGraphWorkbookChartPointFormat format() {
        return this.format;
    }

    /**
     * Set the format property: workbookChartPointFormat.
     *
     * @param format the format value to set.
     * @return the MicrosoftGraphWorkbookChartPoint object itself.
     */
    public MicrosoftGraphWorkbookChartPoint withFormat(MicrosoftGraphWorkbookChartPointFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartPoint.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartPoint.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartPoint object itself.
     */
    public MicrosoftGraphWorkbookChartPoint withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookChartPoint withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (format() != null) {
            format().validate();
        }
    }
}
