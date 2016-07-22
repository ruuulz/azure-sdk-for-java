/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;

/**
 * Effective NetworkSecurityRules.
 */
public class EffectiveNetworkSecurityRules {
    /**
     * Gets the name of the security rule specified by the user (if created by
     * the user).
     */
    private String name;

    /**
     * Gets Network protocol this rule applies to. Possible values include:
     * 'Tcp', 'Udp', '*'.
     */
    private SecurityRuleProtocol protocol;

    /**
     * Gets source port or range.
     */
    private String sourcePortRange;

    /**
     * Gets destination port or range.
     */
    private String destinationPortRange;

    /**
     * Gets source address prefix.
     */
    private String sourceAddressPrefix;

    /**
     * Gets destination address prefix.
     */
    private String destinationAddressPrefix;

    /**
     * Gets expanded source address prefix.
     */
    private List<String> expandedSourceAddressPrefix;

    /**
     * Gets expanded destination address prefix.
     */
    private List<String> expandedDestinationAddressPrefix;

    /**
     * Gets network traffic is allowed or denied. Possible values include:
     * 'Allow', 'Deny'.
     */
    private SecurityRuleAccess access;

    /**
     * Gets the priority of the rule.
     */
    private Integer priority;

    /**
     * Gets the direction of the rule. Possible values include: 'Inbound',
     * 'Outbound'.
     */
    private SecurityRuleDirection direction;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public SecurityRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withProtocol(SecurityRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourcePortRange value.
     *
     * @return the sourcePortRange value
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the sourcePortRange value.
     *
     * @param sourcePortRange the sourcePortRange value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }

    /**
     * Get the destinationPortRange value.
     *
     * @return the destinationPortRange value
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange value.
     *
     * @param destinationPortRange the destinationPortRange value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the sourceAddressPrefix value.
     *
     * @return the sourceAddressPrefix value
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix value.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the destinationAddressPrefix value.
     *
     * @return the destinationAddressPrefix value
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destinationAddressPrefix value.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the expandedSourceAddressPrefix value.
     *
     * @return the expandedSourceAddressPrefix value
     */
    public List<String> expandedSourceAddressPrefix() {
        return this.expandedSourceAddressPrefix;
    }

    /**
     * Set the expandedSourceAddressPrefix value.
     *
     * @param expandedSourceAddressPrefix the expandedSourceAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withExpandedSourceAddressPrefix(List<String> expandedSourceAddressPrefix) {
        this.expandedSourceAddressPrefix = expandedSourceAddressPrefix;
        return this;
    }

    /**
     * Get the expandedDestinationAddressPrefix value.
     *
     * @return the expandedDestinationAddressPrefix value
     */
    public List<String> expandedDestinationAddressPrefix() {
        return this.expandedDestinationAddressPrefix;
    }

    /**
     * Set the expandedDestinationAddressPrefix value.
     *
     * @param expandedDestinationAddressPrefix the expandedDestinationAddressPrefix value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withExpandedDestinationAddressPrefix(List<String> expandedDestinationAddressPrefix) {
        this.expandedDestinationAddressPrefix = expandedDestinationAddressPrefix;
        return this;
    }

    /**
     * Get the access value.
     *
     * @return the access value
     */
    public SecurityRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access value.
     *
     * @param access the access value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withAccess(SecurityRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction value.
     *
     * @return the direction value
     */
    public SecurityRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction value.
     *
     * @param direction the direction value to set
     * @return the EffectiveNetworkSecurityRules object itself.
     */
    public EffectiveNetworkSecurityRules withDirection(SecurityRuleDirection direction) {
        this.direction = direction;
        return this;
    }

}
