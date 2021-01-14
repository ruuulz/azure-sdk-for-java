// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** teamFunSettings. */
@Fluent
public final class MicrosoftGraphTeamFunSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTeamFunSettings.class);

    /*
     * If set to true, enables users to include custom memes.
     */
    @JsonProperty(value = "allowCustomMemes")
    private Boolean allowCustomMemes;

    /*
     * If set to true, enables Giphy use.
     */
    @JsonProperty(value = "allowGiphy")
    private Boolean allowGiphy;

    /*
     * If set to true, enables users to include stickers and memes.
     */
    @JsonProperty(value = "allowStickersAndMemes")
    private Boolean allowStickersAndMemes;

    /*
     * The giphyContentRating property.
     */
    @JsonProperty(value = "giphyContentRating")
    private MicrosoftGraphGiphyRatingType giphyContentRating;

    /*
     * teamFunSettings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowCustomMemes property: If set to true, enables users to include custom memes.
     *
     * @return the allowCustomMemes value.
     */
    public Boolean allowCustomMemes() {
        return this.allowCustomMemes;
    }

    /**
     * Set the allowCustomMemes property: If set to true, enables users to include custom memes.
     *
     * @param allowCustomMemes the allowCustomMemes value to set.
     * @return the MicrosoftGraphTeamFunSettings object itself.
     */
    public MicrosoftGraphTeamFunSettings withAllowCustomMemes(Boolean allowCustomMemes) {
        this.allowCustomMemes = allowCustomMemes;
        return this;
    }

    /**
     * Get the allowGiphy property: If set to true, enables Giphy use.
     *
     * @return the allowGiphy value.
     */
    public Boolean allowGiphy() {
        return this.allowGiphy;
    }

    /**
     * Set the allowGiphy property: If set to true, enables Giphy use.
     *
     * @param allowGiphy the allowGiphy value to set.
     * @return the MicrosoftGraphTeamFunSettings object itself.
     */
    public MicrosoftGraphTeamFunSettings withAllowGiphy(Boolean allowGiphy) {
        this.allowGiphy = allowGiphy;
        return this;
    }

    /**
     * Get the allowStickersAndMemes property: If set to true, enables users to include stickers and memes.
     *
     * @return the allowStickersAndMemes value.
     */
    public Boolean allowStickersAndMemes() {
        return this.allowStickersAndMemes;
    }

    /**
     * Set the allowStickersAndMemes property: If set to true, enables users to include stickers and memes.
     *
     * @param allowStickersAndMemes the allowStickersAndMemes value to set.
     * @return the MicrosoftGraphTeamFunSettings object itself.
     */
    public MicrosoftGraphTeamFunSettings withAllowStickersAndMemes(Boolean allowStickersAndMemes) {
        this.allowStickersAndMemes = allowStickersAndMemes;
        return this;
    }

    /**
     * Get the giphyContentRating property: The giphyContentRating property.
     *
     * @return the giphyContentRating value.
     */
    public MicrosoftGraphGiphyRatingType giphyContentRating() {
        return this.giphyContentRating;
    }

    /**
     * Set the giphyContentRating property: The giphyContentRating property.
     *
     * @param giphyContentRating the giphyContentRating value to set.
     * @return the MicrosoftGraphTeamFunSettings object itself.
     */
    public MicrosoftGraphTeamFunSettings withGiphyContentRating(MicrosoftGraphGiphyRatingType giphyContentRating) {
        this.giphyContentRating = giphyContentRating;
        return this;
    }

    /**
     * Get the additionalProperties property: teamFunSettings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamFunSettings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamFunSettings object itself.
     */
    public MicrosoftGraphTeamFunSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
