/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualHubRouteTableV2 route.
 */
public class VirtualHubRouteV2 {
    /**
     * The type of destinations.
     */
    @JsonProperty(value = "destinationType")
    private String destinationType;

    /**
     * List of all destinations.
     */
    @JsonProperty(value = "destinations")
    private List<String> destinations;

    /**
     * The type of next hops.
     */
    @JsonProperty(value = "nextHopType")
    private String nextHopType;

    /**
     * NextHops ip address.
     */
    @JsonProperty(value = "nextHops")
    private List<String> nextHops;

    /**
     * Get the type of destinations.
     *
     * @return the destinationType value
     */
    public String destinationType() {
        return this.destinationType;
    }

    /**
     * Set the type of destinations.
     *
     * @param destinationType the destinationType value to set
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * Get list of all destinations.
     *
     * @return the destinations value
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set list of all destinations.
     *
     * @param destinations the destinations value to set
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the type of next hops.
     *
     * @return the nextHopType value
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the type of next hops.
     *
     * @param nextHopType the nextHopType value to set
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get nextHops ip address.
     *
     * @return the nextHops value
     */
    public List<String> nextHops() {
        return this.nextHops;
    }

    /**
     * Set nextHops ip address.
     *
     * @param nextHops the nextHops value to set
     * @return the VirtualHubRouteV2 object itself.
     */
    public VirtualHubRouteV2 withNextHops(List<String> nextHops) {
        this.nextHops = nextHops;
        return this;
    }

}
