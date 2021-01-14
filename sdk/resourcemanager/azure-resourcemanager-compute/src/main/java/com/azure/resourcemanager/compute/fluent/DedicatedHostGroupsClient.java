// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.DedicatedHostGroupInner;
import com.azure.resourcemanager.compute.models.DedicatedHostGroupUpdate;
import com.azure.resourcemanager.compute.models.InstanceViewTypes;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DedicatedHostGroupsClient. */
public interface DedicatedHostGroupsClient
    extends InnerSupportsGet<DedicatedHostGroupInner>,
        InnerSupportsListing<DedicatedHostGroupInner>,
        InnerSupportsDelete<Void> {
    /**
     * Create or update a dedicated host group. For details of Dedicated Host and Dedicated Host Groups please see
     * [Dedicated Host Documentation] (https://go.microsoft.com/fwlink/?linkid=2082596).
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated hosts should be
     *     assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at
     *     creation time. An existing dedicated host cannot be added to another dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DedicatedHostGroupInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupInner parameters);

    /**
     * Create or update a dedicated host group. For details of Dedicated Host and Dedicated Host Groups please see
     * [Dedicated Host Documentation] (https://go.microsoft.com/fwlink/?linkid=2082596).
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated hosts should be
     *     assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at
     *     creation time. An existing dedicated host cannot be added to another dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostGroupInner> createOrUpdateAsync(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupInner parameters);

    /**
     * Create or update a dedicated host group. For details of Dedicated Host and Dedicated Host Groups please see
     * [Dedicated Host Documentation] (https://go.microsoft.com/fwlink/?linkid=2082596).
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated hosts should be
     *     assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at
     *     creation time. An existing dedicated host cannot be added to another dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostGroupInner createOrUpdate(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupInner parameters);

    /**
     * Create or update a dedicated host group. For details of Dedicated Host and Dedicated Host Groups please see
     * [Dedicated Host Documentation] (https://go.microsoft.com/fwlink/?linkid=2082596).
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated hosts should be
     *     assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at
     *     creation time. An existing dedicated host cannot be added to another dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedHostGroupInner> createOrUpdateWithResponse(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupInner parameters, Context context);

    /**
     * Update an dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated host should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DedicatedHostGroupInner>> updateWithResponseAsync(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupUpdate parameters);

    /**
     * Update an dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated host should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostGroupInner> updateAsync(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupUpdate parameters);

    /**
     * Update an dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated host should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostGroupInner update(String resourceGroupName, String hostGroupName, DedicatedHostGroupUpdate parameters);

    /**
     * Update an dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Specifies information about the dedicated host group that the dedicated host should be assigned
     *     to. Only tags may be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedHostGroupInner> updateWithResponse(
        String resourceGroupName, String hostGroupName, DedicatedHostGroupUpdate parameters, Context context);

    /**
     * Delete a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String hostGroupName);

    /**
     * Delete a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String hostGroupName);

    /**
     * Delete a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostGroupName);

    /**
     * Delete a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String hostGroupName, Context context);

    /**
     * Retrieves information about a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param expand The expand expression to apply on the operation. The response shows the list of instance view of
     *     the dedicated hosts under the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DedicatedHostGroupInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String hostGroupName, InstanceViewTypes expand);

    /**
     * Retrieves information about a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param expand The expand expression to apply on the operation. The response shows the list of instance view of
     *     the dedicated hosts under the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostGroupInner> getByResourceGroupAsync(
        String resourceGroupName, String hostGroupName, InstanceViewTypes expand);

    /**
     * Retrieves information about a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostGroupInner> getByResourceGroupAsync(String resourceGroupName, String hostGroupName);

    /**
     * Retrieves information about a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostGroupInner getByResourceGroup(String resourceGroupName, String hostGroupName);

    /**
     * Retrieves information about a dedicated host group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param expand The expand expression to apply on the operation. The response shows the list of instance view of
     *     the dedicated hosts under the dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedHostGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String hostGroupName, InstanceViewTypes expand, Context context);

    /**
     * Lists all of the dedicated host groups in the specified resource group. Use the nextLink property in the response
     * to get the next page of dedicated host groups.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DedicatedHostGroupInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all of the dedicated host groups in the specified resource group. Use the nextLink property in the response
     * to get the next page of dedicated host groups.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the dedicated host groups in the specified resource group. Use the nextLink property in the response
     * to get the next page of dedicated host groups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostGroupInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the dedicated host groups in the subscription. Use the nextLink property in the response to get the
     * next page of dedicated host groups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DedicatedHostGroupInner> listAsync();

    /**
     * Lists all of the dedicated host groups in the subscription. Use the nextLink property in the response to get the
     * next page of dedicated host groups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostGroupInner> list();

    /**
     * Lists all of the dedicated host groups in the subscription. Use the nextLink property in the response to get the
     * next page of dedicated host groups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostGroupInner> list(Context context);
}
