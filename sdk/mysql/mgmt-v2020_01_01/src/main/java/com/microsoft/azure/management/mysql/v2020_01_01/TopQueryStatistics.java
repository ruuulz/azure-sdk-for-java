/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import rx.Observable;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.TopQueryStatisticsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TopQueryStatistics.
 */
public interface TopQueryStatistics extends HasInner<TopQueryStatisticsInner> {
    /**
     * Retrieve the query statistic for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryStatisticId The Query Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryStatistic> getAsync(String resourceGroupName, String serverName, String queryStatisticId);

    /**
     * Retrieve the Query-Store top queries for specified metric and aggregation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving top query statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryStatistic> listByServerAsync(final String resourceGroupName, final String serverName, final TopQueryStatisticsInput parameters);

}
