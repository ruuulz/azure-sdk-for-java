/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to get network configuration diagnostic.
 */
public class NetworkConfigurationDiagnosticParameters {
    /**
     * The ID of the target resource to perform network configuration
     * diagnostic. Valid options are VM, NetworkInterface,
     * VMSS/NetworkInterface and Application Gateway.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Verbosity level. Possible values include: 'Normal', 'Minimum', 'Full'.
     */
    @JsonProperty(value = "verbosityLevel")
    private VerbosityLevel verbosityLevel;

    /**
     * List of network configuration diagnostic profiles.
     */
    @JsonProperty(value = "profiles", required = true)
    private List<NetworkConfigurationDiagnosticProfile> profiles;

    /**
     * Get the ID of the target resource to perform network configuration diagnostic. Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the ID of the target resource to perform network configuration diagnostic. Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get verbosity level. Possible values include: 'Normal', 'Minimum', 'Full'.
     *
     * @return the verbosityLevel value
     */
    public VerbosityLevel verbosityLevel() {
        return this.verbosityLevel;
    }

    /**
     * Set verbosity level. Possible values include: 'Normal', 'Minimum', 'Full'.
     *
     * @param verbosityLevel the verbosityLevel value to set
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withVerbosityLevel(VerbosityLevel verbosityLevel) {
        this.verbosityLevel = verbosityLevel;
        return this;
    }

    /**
     * Get list of network configuration diagnostic profiles.
     *
     * @return the profiles value
     */
    public List<NetworkConfigurationDiagnosticProfile> profiles() {
        return this.profiles;
    }

    /**
     * Set list of network configuration diagnostic profiles.
     *
     * @param profiles the profiles value to set
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withProfiles(List<NetworkConfigurationDiagnosticProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

}
