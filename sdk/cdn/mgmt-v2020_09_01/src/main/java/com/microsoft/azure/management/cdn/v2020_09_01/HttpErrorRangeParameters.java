/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that represents the range for http status codes.
 */
public class HttpErrorRangeParameters {
    /**
     * The inclusive start of the http status code range.
     */
    @JsonProperty(value = "begin")
    private Integer begin;

    /**
     * The inclusive end of the http status code range.
     */
    @JsonProperty(value = "end")
    private Integer end;

    /**
     * Get the inclusive start of the http status code range.
     *
     * @return the begin value
     */
    public Integer begin() {
        return this.begin;
    }

    /**
     * Set the inclusive start of the http status code range.
     *
     * @param begin the begin value to set
     * @return the HttpErrorRangeParameters object itself.
     */
    public HttpErrorRangeParameters withBegin(Integer begin) {
        this.begin = begin;
        return this;
    }

    /**
     * Get the inclusive end of the http status code range.
     *
     * @return the end value
     */
    public Integer end() {
        return this.end;
    }

    /**
     * Set the inclusive end of the http status code range.
     *
     * @param end the end value to set
     * @return the HttpErrorRangeParameters object itself.
     */
    public HttpErrorRangeParameters withEnd(Integer end) {
        this.end = end;
        return this;
    }

}
