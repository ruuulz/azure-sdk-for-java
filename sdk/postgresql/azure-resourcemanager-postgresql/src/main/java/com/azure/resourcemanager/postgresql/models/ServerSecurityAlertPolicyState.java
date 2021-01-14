// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ServerSecurityAlertPolicyState. */
public enum ServerSecurityAlertPolicyState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a ServerSecurityAlertPolicyState instance. */
    private final String value;

    ServerSecurityAlertPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ServerSecurityAlertPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ServerSecurityAlertPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static ServerSecurityAlertPolicyState fromString(String value) {
        ServerSecurityAlertPolicyState[] items = ServerSecurityAlertPolicyState.values();
        for (ServerSecurityAlertPolicyState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
