/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudService;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceProperties;

class CloudServiceImpl extends GroupableResourceCoreImpl<CloudService, CloudServiceInner, CloudServiceImpl, ComputeManager> implements CloudService, CloudService.Definition, CloudService.Update {
    CloudServiceImpl(String name, CloudServiceInner inner, ComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<CloudService> createResourceAsync() {
        CloudServicesInner client = this.manager().inner().cloudServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CloudService> updateResourceAsync() {
        CloudServicesInner client = this.manager().inner().cloudServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CloudServiceInner> getInnerAsync() {
        CloudServicesInner client = this.manager().inner().cloudServices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public CloudServiceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public CloudServiceImpl withProperties(CloudServiceProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
