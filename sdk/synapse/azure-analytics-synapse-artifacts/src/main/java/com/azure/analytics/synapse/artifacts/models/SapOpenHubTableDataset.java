// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Sap Business Warehouse Open Hub Destination Table properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHubTable")
@JsonFlatten
@Fluent
public class SapOpenHubTableDataset extends Dataset {
    /*
     * The name of the Open Hub Destination with destination type as Database
     * Table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.openHubDestinationName", required = true)
    private Object openHubDestinationName;

    /*
     * Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.excludeLastRequest")
    private Object excludeLastRequest;

    /*
     * The ID of request for delta loading. Once it is set, only data with
     * requestId larger than the value of this property will be retrieved. The
     * default value is 0. Type: integer (or Expression with resultType integer
     * ).
     */
    @JsonProperty(value = "typeProperties.baseRequestId")
    private Object baseRequestId;

    /**
     * Get the openHubDestinationName property: The name of the Open Hub Destination with destination type as Database
     * Table. Type: string (or Expression with resultType string).
     *
     * @return the openHubDestinationName value.
     */
    public Object getOpenHubDestinationName() {
        return this.openHubDestinationName;
    }

    /**
     * Set the openHubDestinationName property: The name of the Open Hub Destination with destination type as Database
     * Table. Type: string (or Expression with resultType string).
     *
     * @param openHubDestinationName the openHubDestinationName value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset setOpenHubDestinationName(Object openHubDestinationName) {
        this.openHubDestinationName = openHubDestinationName;
        return this;
    }

    /**
     * Get the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the excludeLastRequest value.
     */
    public Object getExcludeLastRequest() {
        return this.excludeLastRequest;
    }

    /**
     * Set the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     *
     * @param excludeLastRequest the excludeLastRequest value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset setExcludeLastRequest(Object excludeLastRequest) {
        this.excludeLastRequest = excludeLastRequest;
        return this;
    }

    /**
     * Get the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     *
     * @return the baseRequestId value.
     */
    public Object getBaseRequestId() {
        return this.baseRequestId;
    }

    /**
     * Set the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     *
     * @param baseRequestId the baseRequestId value to set.
     * @return the SapOpenHubTableDataset object itself.
     */
    public SapOpenHubTableDataset setBaseRequestId(Object baseRequestId) {
        this.baseRequestId = baseRequestId;
        return this;
    }
}
