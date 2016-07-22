/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AuthorizationUseStatus.
 */
public final class AuthorizationUseStatus {
    /** Static value Available for AuthorizationUseStatus. */
    public static final AuthorizationUseStatus AVAILABLE = new AuthorizationUseStatus("Available");

    /** Static value InUse for AuthorizationUseStatus. */
    public static final AuthorizationUseStatus IN_USE = new AuthorizationUseStatus("InUse");

    private String value;

    /**
     * Creates a custom value for AuthorizationUseStatus.
     * @param value the custom value
     */
    public AuthorizationUseStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationUseStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AuthorizationUseStatus rhs = (AuthorizationUseStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
