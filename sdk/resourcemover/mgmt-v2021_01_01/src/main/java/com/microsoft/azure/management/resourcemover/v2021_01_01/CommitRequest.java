/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the request body for commit operation.
 */
public class CommitRequest {
    /**
     * Gets or sets a value indicating whether the operation needs to only run
     * pre-requisite.
     */
    @JsonProperty(value = "validateOnly")
    private Boolean validateOnly;

    /**
     * Gets or sets the list of resource Id's, by default it accepts move
     * resource id's unless the input type is switched via
     * moveResourceInputType property.
     */
    @JsonProperty(value = "moveResources", required = true)
    private List<String> moveResources;

    /**
     * Possible values include: 'MoveResourceId', 'MoveResourceSourceId'.
     */
    @JsonProperty(value = "moveResourceInputType")
    private MoveResourceInputType moveResourceInputType;

    /**
     * Get gets or sets a value indicating whether the operation needs to only run pre-requisite.
     *
     * @return the validateOnly value
     */
    public Boolean validateOnly() {
        return this.validateOnly;
    }

    /**
     * Set gets or sets a value indicating whether the operation needs to only run pre-requisite.
     *
     * @param validateOnly the validateOnly value to set
     * @return the CommitRequest object itself.
     */
    public CommitRequest withValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }

    /**
     * Get gets or sets the list of resource Id's, by default it accepts move resource id's unless the input type is switched via moveResourceInputType property.
     *
     * @return the moveResources value
     */
    public List<String> moveResources() {
        return this.moveResources;
    }

    /**
     * Set gets or sets the list of resource Id's, by default it accepts move resource id's unless the input type is switched via moveResourceInputType property.
     *
     * @param moveResources the moveResources value to set
     * @return the CommitRequest object itself.
     */
    public CommitRequest withMoveResources(List<String> moveResources) {
        this.moveResources = moveResources;
        return this;
    }

    /**
     * Get possible values include: 'MoveResourceId', 'MoveResourceSourceId'.
     *
     * @return the moveResourceInputType value
     */
    public MoveResourceInputType moveResourceInputType() {
        return this.moveResourceInputType;
    }

    /**
     * Set possible values include: 'MoveResourceId', 'MoveResourceSourceId'.
     *
     * @param moveResourceInputType the moveResourceInputType value to set
     * @return the CommitRequest object itself.
     */
    public CommitRequest withMoveResourceInputType(MoveResourceInputType moveResourceInputType) {
        this.moveResourceInputType = moveResourceInputType;
        return this;
    }

}
