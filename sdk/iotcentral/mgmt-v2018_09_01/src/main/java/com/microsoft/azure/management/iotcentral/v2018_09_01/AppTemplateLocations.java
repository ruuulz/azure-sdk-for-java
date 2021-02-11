/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IoT Central Application Template Locations.
 */
public class AppTemplateLocations {
    /**
     * The ID of the location.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The display name of the location.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Get the ID of the location.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the display name of the location.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

}
