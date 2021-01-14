/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Insights agent versions properties payload.
 */
public class ApplicationInsightsAgentVersions {
    /**
     * Indicates the version of application insight java agent.
     */
    @JsonProperty(value = "java", access = JsonProperty.Access.WRITE_ONLY)
    private String java;

    /**
     * Get indicates the version of application insight java agent.
     *
     * @return the java value
     */
    public String java() {
        return this.java;
    }

}
