// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.mysql.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mysql.models.CheckNameAvailabilities;
import com.azure.resourcemanager.mysql.models.NameAvailability;
import com.azure.resourcemanager.mysql.models.NameAvailabilityRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CheckNameAvailabilitiesImpl implements CheckNameAvailabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilitiesImpl.class);

    private final CheckNameAvailabilitiesClient innerClient;

    private final MySqlManager serviceManager;

    public CheckNameAvailabilitiesImpl(CheckNameAvailabilitiesClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NameAvailability execute(NameAvailabilityRequest nameAvailabilityRequest) {
        NameAvailabilityInner inner = this.serviceClient().execute(nameAvailabilityRequest);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailability> executeWithResponse(
        NameAvailabilityRequest nameAvailabilityRequest, Context context) {
        Response<NameAvailabilityInner> inner =
            this.serviceClient().executeWithResponse(nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CheckNameAvailabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
