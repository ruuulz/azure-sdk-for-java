/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.OptimizationType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of the GetSupportedOptimizationTypes API.
 */
public class SupportedOptimizationTypesListResultInner {
    /**
     * Supported optimization types for a profile.
     */
    @JsonProperty(value = "supportedOptimizationTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<OptimizationType> supportedOptimizationTypes;

    /**
     * Get supported optimization types for a profile.
     *
     * @return the supportedOptimizationTypes value
     */
    public List<OptimizationType> supportedOptimizationTypes() {
        return this.supportedOptimizationTypes;
    }

}
