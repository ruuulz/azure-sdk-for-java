/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.DiskEncryptionSetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DiskEncryptionSets.
 */
public interface DiskEncryptionSets extends SupportsCreating<DiskEncryptionSet.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DiskEncryptionSet>, SupportsListingByResourceGroup<DiskEncryptionSet>, SupportsListing<DiskEncryptionSet>, HasInner<DiskEncryptionSetsInner> {
    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> listAssociatedResourcesAsync(final String resourceGroupName, final String diskEncryptionSetName);

}
