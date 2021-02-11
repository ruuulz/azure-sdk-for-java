/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key Vault Key Url to be used for server side encryption of Managed Disks and
 * Snapshots.
 */
public class KeyForDiskEncryptionSet {
    /**
     * Resource id of the KeyVault containing the key or secret. This property
     * is optional and cannot be used if the KeyVault subscription is not the
     * same as the Disk Encryption Set subscription.
     */
    @JsonProperty(value = "sourceVault")
    private SourceVault sourceVault;

    /**
     * Fully versioned Key Url pointing to a key in KeyVault.
     */
    @JsonProperty(value = "keyUrl", required = true)
    private String keyUrl;

    /**
     * Get resource id of the KeyVault containing the key or secret. This property is optional and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     *
     * @return the sourceVault value
     */
    public SourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set resource id of the KeyVault containing the key or secret. This property is optional and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     *
     * @param sourceVault the sourceVault value to set
     * @return the KeyForDiskEncryptionSet object itself.
     */
    public KeyForDiskEncryptionSet withSourceVault(SourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get fully versioned Key Url pointing to a key in KeyVault.
     *
     * @return the keyUrl value
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set fully versioned Key Url pointing to a key in KeyVault.
     *
     * @param keyUrl the keyUrl value to set
     * @return the KeyForDiskEncryptionSet object itself.
     */
    public KeyForDiskEncryptionSet withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

}
