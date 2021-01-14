/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourcesResponseEndpointsItem model.
 */
public class ResourcesResponseEndpointsItem {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The history property.
     */
    @JsonProperty(value = "history")
    private Boolean history;

    /**
     * The customDomains property.
     */
    @JsonProperty(value = "customDomains")
    private List<ResourcesResponseEndpointsItemCustomDomainsItem> customDomains;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the history value.
     *
     * @return the history value
     */
    public Boolean history() {
        return this.history;
    }

    /**
     * Set the history value.
     *
     * @param history the history value to set
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withHistory(Boolean history) {
        this.history = history;
        return this;
    }

    /**
     * Get the customDomains value.
     *
     * @return the customDomains value
     */
    public List<ResourcesResponseEndpointsItemCustomDomainsItem> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains value.
     *
     * @param customDomains the customDomains value to set
     * @return the ResourcesResponseEndpointsItem object itself.
     */
    public ResourcesResponseEndpointsItem withCustomDomains(List<ResourcesResponseEndpointsItemCustomDomainsItem> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

}
