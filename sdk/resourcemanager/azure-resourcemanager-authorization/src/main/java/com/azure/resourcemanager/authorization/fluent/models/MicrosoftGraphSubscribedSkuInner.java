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
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** subscribedSku. */
@Fluent
public final class MicrosoftGraphSubscribedSkuInner extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphSubscribedSkuInner.class);

    /*
     * For example, 'User' or 'Company'.
     */
    @JsonProperty(value = "appliesTo")
    private String appliesTo;

    /*
     * Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     */
    @JsonProperty(value = "capabilityStatus")
    private String capabilityStatus;

    /*
     * The number of licenses that have been assigned.
     */
    @JsonProperty(value = "consumedUnits")
    private Integer consumedUnits;

    /*
     * licenseUnitsDetail
     */
    @JsonProperty(value = "prepaidUnits")
    private MicrosoftGraphLicenseUnitsDetail prepaidUnits;

    /*
     * Information about the service plans that are available with the SKU. Not
     * nullable
     */
    @JsonProperty(value = "servicePlans")
    private List<MicrosoftGraphServicePlanInfo> servicePlans;

    /*
     * The unique identifier (GUID) for the service SKU.
     */
    @JsonProperty(value = "skuId")
    private UUID skuId;

    /*
     * The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a
     * list of commercial subscriptions that an organization has acquired, see
     * List subscribedSkus.
     */
    @JsonProperty(value = "skuPartNumber")
    private String skuPartNumber;

    /*
     * subscribedSku
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the appliesTo property: For example, 'User' or 'Company'.
     *
     * @return the appliesTo value.
     */
    public String appliesTo() {
        return this.appliesTo;
    }

    /**
     * Set the appliesTo property: For example, 'User' or 'Company'.
     *
     * @param appliesTo the appliesTo value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withAppliesTo(String appliesTo) {
        this.appliesTo = appliesTo;
        return this;
    }

    /**
     * Get the capabilityStatus property: Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     *
     * @return the capabilityStatus value.
     */
    public String capabilityStatus() {
        return this.capabilityStatus;
    }

    /**
     * Set the capabilityStatus property: Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     *
     * @param capabilityStatus the capabilityStatus value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withCapabilityStatus(String capabilityStatus) {
        this.capabilityStatus = capabilityStatus;
        return this;
    }

    /**
     * Get the consumedUnits property: The number of licenses that have been assigned.
     *
     * @return the consumedUnits value.
     */
    public Integer consumedUnits() {
        return this.consumedUnits;
    }

    /**
     * Set the consumedUnits property: The number of licenses that have been assigned.
     *
     * @param consumedUnits the consumedUnits value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withConsumedUnits(Integer consumedUnits) {
        this.consumedUnits = consumedUnits;
        return this;
    }

    /**
     * Get the prepaidUnits property: licenseUnitsDetail.
     *
     * @return the prepaidUnits value.
     */
    public MicrosoftGraphLicenseUnitsDetail prepaidUnits() {
        return this.prepaidUnits;
    }

    /**
     * Set the prepaidUnits property: licenseUnitsDetail.
     *
     * @param prepaidUnits the prepaidUnits value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withPrepaidUnits(MicrosoftGraphLicenseUnitsDetail prepaidUnits) {
        this.prepaidUnits = prepaidUnits;
        return this;
    }

    /**
     * Get the servicePlans property: Information about the service plans that are available with the SKU. Not nullable.
     *
     * @return the servicePlans value.
     */
    public List<MicrosoftGraphServicePlanInfo> servicePlans() {
        return this.servicePlans;
    }

    /**
     * Set the servicePlans property: Information about the service plans that are available with the SKU. Not nullable.
     *
     * @param servicePlans the servicePlans value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withServicePlans(List<MicrosoftGraphServicePlanInfo> servicePlans) {
        this.servicePlans = servicePlans;
        return this;
    }

    /**
     * Get the skuId property: The unique identifier (GUID) for the service SKU.
     *
     * @return the skuId value.
     */
    public UUID skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: The unique identifier (GUID) for the service SKU.
     *
     * @param skuId the skuId value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withSkuId(UUID skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuPartNumber property: The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of
     * commercial subscriptions that an organization has acquired, see List subscribedSkus.
     *
     * @return the skuPartNumber value.
     */
    public String skuPartNumber() {
        return this.skuPartNumber;
    }

    /**
     * Set the skuPartNumber property: The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of
     * commercial subscriptions that an organization has acquired, see List subscribedSkus.
     *
     * @param skuPartNumber the skuPartNumber value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withSkuPartNumber(String skuPartNumber) {
        this.skuPartNumber = skuPartNumber;
        return this;
    }

    /**
     * Get the additionalProperties property: subscribedSku.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: subscribedSku.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSubscribedSkuInner object itself.
     */
    public MicrosoftGraphSubscribedSkuInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSubscribedSkuInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (prepaidUnits() != null) {
            prepaidUnits().validate();
        }
        if (servicePlans() != null) {
            servicePlans().forEach(e -> e.validate());
        }
    }
}
