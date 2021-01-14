/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EvaluationState.
 */
public final class EvaluationState extends ExpandableStringEnum<EvaluationState> {
    /** Static value NotStarted for EvaluationState. */
    public static final EvaluationState NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for EvaluationState. */
    public static final EvaluationState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for EvaluationState. */
    public static final EvaluationState COMPLETED = fromString("Completed");

    /**
     * Creates or finds a EvaluationState from its string representation.
     * @param name a name to look for
     * @return the corresponding EvaluationState
     */
    @JsonCreator
    public static EvaluationState fromString(String name) {
        return fromString(name, EvaluationState.class);
    }

    /**
     * @return known EvaluationState values
     */
    public static Collection<EvaluationState> values() {
        return values(EvaluationState.class);
    }
}
