/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.NetworkVirtualApplianceSkuInstances;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Available NetworkVirtualApplianceSkus.
 * Definition of the NetworkVirtualApplianceSkus resource.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkVirtualApplianceSkuInner extends Resource {
    /**
     * Network Virtual Appliance Sku vendor.
     */
    @JsonProperty(value = "properties.vendor", access = JsonProperty.Access.WRITE_ONLY)
    private String vendor;

    /**
     * Available Network Virtual Appliance versions.
     */
    @JsonProperty(value = "properties.availableVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> availableVersions;

    /**
     * The list of scale units available.
     */
    @JsonProperty(value = "properties.availableScaleUnits")
    private List<NetworkVirtualApplianceSkuInstances> availableScaleUnits;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get network Virtual Appliance Sku vendor.
     *
     * @return the vendor value
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get available Network Virtual Appliance versions.
     *
     * @return the availableVersions value
     */
    public List<String> availableVersions() {
        return this.availableVersions;
    }

    /**
     * Get the list of scale units available.
     *
     * @return the availableScaleUnits value
     */
    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        return this.availableScaleUnits;
    }

    /**
     * Set the list of scale units available.
     *
     * @param availableScaleUnits the availableScaleUnits value to set
     * @return the NetworkVirtualApplianceSkuInner object itself.
     */
    public NetworkVirtualApplianceSkuInner withAvailableScaleUnits(List<NetworkVirtualApplianceSkuInstances> availableScaleUnits) {
        this.availableScaleUnits = availableScaleUnits;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the NetworkVirtualApplianceSkuInner object itself.
     */
    public NetworkVirtualApplianceSkuInner withId(String id) {
        this.id = id;
        return this;
    }

}
