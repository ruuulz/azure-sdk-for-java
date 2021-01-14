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
import java.util.List;
import java.util.Map;

/** workbookTableSort. */
@Fluent
public final class MicrosoftGraphWorkbookTableSort extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookTableSort.class);

    /*
     * Represents the current conditions used to last sort the table.
     * Read-only.
     */
    @JsonProperty(value = "fields")
    private List<MicrosoftGraphWorkbookSortField> fields;

    /*
     * Represents whether the casing impacted the last sort of the table.
     * Read-only.
     */
    @JsonProperty(value = "matchCase")
    private Boolean matchCase;

    /*
     * Represents Chinese character ordering method last used to sort the
     * table. The possible values are: PinYin, StrokeCount. Read-only.
     */
    @JsonProperty(value = "method")
    private String method;

    /*
     * workbookTableSort
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the fields property: Represents the current conditions used to last sort the table. Read-only.
     *
     * @return the fields value.
     */
    public List<MicrosoftGraphWorkbookSortField> fields() {
        return this.fields;
    }

    /**
     * Set the fields property: Represents the current conditions used to last sort the table. Read-only.
     *
     * @param fields the fields value to set.
     * @return the MicrosoftGraphWorkbookTableSort object itself.
     */
    public MicrosoftGraphWorkbookTableSort withFields(List<MicrosoftGraphWorkbookSortField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the matchCase property: Represents whether the casing impacted the last sort of the table. Read-only.
     *
     * @return the matchCase value.
     */
    public Boolean matchCase() {
        return this.matchCase;
    }

    /**
     * Set the matchCase property: Represents whether the casing impacted the last sort of the table. Read-only.
     *
     * @param matchCase the matchCase value to set.
     * @return the MicrosoftGraphWorkbookTableSort object itself.
     */
    public MicrosoftGraphWorkbookTableSort withMatchCase(Boolean matchCase) {
        this.matchCase = matchCase;
        return this;
    }

    /**
     * Get the method property: Represents Chinese character ordering method last used to sort the table. The possible
     * values are: PinYin, StrokeCount. Read-only.
     *
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method property: Represents Chinese character ordering method last used to sort the table. The possible
     * values are: PinYin, StrokeCount. Read-only.
     *
     * @param method the method value to set.
     * @return the MicrosoftGraphWorkbookTableSort object itself.
     */
    public MicrosoftGraphWorkbookTableSort withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookTableSort.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookTableSort.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookTableSort object itself.
     */
    public MicrosoftGraphWorkbookTableSort withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphWorkbookTableSort withId(String id) {
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
        if (fields() != null) {
            fields().forEach(e -> e.validate());
        }
    }
}
