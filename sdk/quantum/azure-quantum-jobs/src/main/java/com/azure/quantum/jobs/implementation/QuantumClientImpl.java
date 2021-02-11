// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the QuantumClient type. */
public final class QuantumClientImpl {
    /** The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000). */
    private final String subscriptionId;

    /**
     * Gets The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** Name of an Azure resource group. */
    private final String resourceGroupName;

    /**
     * Gets Name of an Azure resource group.
     *
     * @return the resourceGroupName value.
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /** Name of the workspace. */
    private final String workspaceName;

    /**
     * Gets Name of the workspace.
     *
     * @return the workspaceName value.
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The JobsImpl object to access its operations. */
    private final JobsImpl jobs;

    /**
     * Gets the JobsImpl object to access its operations.
     *
     * @return the JobsImpl object.
     */
    public JobsImpl getJobs() {
        return this.jobs;
    }

    /** The ProvidersImpl object to access its operations. */
    private final ProvidersImpl providers;

    /**
     * Gets the ProvidersImpl object to access its operations.
     *
     * @return the ProvidersImpl object.
     */
    public ProvidersImpl getProviders() {
        return this.providers;
    }

    /** The StoragesImpl object to access its operations. */
    private final StoragesImpl storages;

    /**
     * Gets the StoragesImpl object to access its operations.
     *
     * @return the StoragesImpl object.
     */
    public StoragesImpl getStorages() {
        return this.storages;
    }

    /** The QuotasImpl object to access its operations. */
    private final QuotasImpl quotas;

    /**
     * Gets the QuotasImpl object to access its operations.
     *
     * @return the QuotasImpl object.
     */
    public QuotasImpl getQuotas() {
        return this.quotas;
    }

    /**
     * Initializes an instance of QuantumClient client.
     *
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param resourceGroupName Name of an Azure resource group.
     * @param workspaceName Name of the workspace.
     * @param host server parameter.
     */
    public QuantumClientImpl(String subscriptionId, String resourceGroupName, String workspaceName, String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                subscriptionId,
                resourceGroupName,
                workspaceName,
                host);
    }

    /**
     * Initializes an instance of QuantumClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param resourceGroupName Name of an Azure resource group.
     * @param workspaceName Name of the workspace.
     * @param host server parameter.
     */
    public QuantumClientImpl(
            HttpPipeline httpPipeline,
            String subscriptionId,
            String resourceGroupName,
            String workspaceName,
            String host) {
        this(
                httpPipeline,
                JacksonAdapter.createDefaultSerializerAdapter(),
                subscriptionId,
                resourceGroupName,
                workspaceName,
                host);
    }

    /**
     * Initializes an instance of QuantumClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param resourceGroupName Name of an Azure resource group.
     * @param workspaceName Name of the workspace.
     * @param host server parameter.
     */
    public QuantumClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String subscriptionId,
            String resourceGroupName,
            String workspaceName,
            String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.subscriptionId = subscriptionId;
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.host = host;
        this.jobs = new JobsImpl(this);
        this.providers = new ProvidersImpl(this);
        this.storages = new StoragesImpl(this);
        this.quotas = new QuotasImpl(this);
    }
}
