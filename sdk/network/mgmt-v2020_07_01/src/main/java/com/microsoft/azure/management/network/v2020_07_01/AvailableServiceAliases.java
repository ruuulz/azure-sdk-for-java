/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.AvailableServiceAliasesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailableServiceAliases.
 */
public interface AvailableServiceAliases extends HasInner<AvailableServiceAliasesInner> {
    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailableServiceAlias> listByResourceGroupAsync(final String resourceGroupName, final String location);

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailableServiceAlias> listAsync(final String location);

}
