// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedStorageAccountsResourceInner;
import java.util.List;

/** An immutable client-side representation of LinkedStorageAccountsResource. */
public interface LinkedStorageAccountsResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the dataSourceType property: Linked storage accounts type.
     *
     * @return the dataSourceType value.
     */
    DataSourceType dataSourceType();

    /**
     * Gets the storageAccountIds property: Linked storage accounts resources ids.
     *
     * @return the storageAccountIds value.
     */
    List<String> storageAccountIds();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.LinkedStorageAccountsResourceInner object.
     *
     * @return the inner object.
     */
    LinkedStorageAccountsResourceInner innerModel();

    /** The entirety of the LinkedStorageAccountsResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The LinkedStorageAccountsResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the LinkedStorageAccountsResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the LinkedStorageAccountsResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the LinkedStorageAccountsResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithStorageAccountIds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LinkedStorageAccountsResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LinkedStorageAccountsResource create(Context context);
        }
        /** The stage of the LinkedStorageAccountsResource definition allowing to specify storageAccountIds. */
        interface WithStorageAccountIds {
            /**
             * Specifies the storageAccountIds property: Linked storage accounts resources ids..
             *
             * @param storageAccountIds Linked storage accounts resources ids.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountIds(List<String> storageAccountIds);
        }
    }
    /**
     * Begins update for the LinkedStorageAccountsResource resource.
     *
     * @return the stage of resource update.
     */
    LinkedStorageAccountsResource.Update update();

    /** The template for LinkedStorageAccountsResource update. */
    interface Update extends UpdateStages.WithStorageAccountIds {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LinkedStorageAccountsResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LinkedStorageAccountsResource apply(Context context);
    }
    /** The LinkedStorageAccountsResource update stages. */
    interface UpdateStages {
        /** The stage of the LinkedStorageAccountsResource update allowing to specify storageAccountIds. */
        interface WithStorageAccountIds {
            /**
             * Specifies the storageAccountIds property: Linked storage accounts resources ids..
             *
             * @param storageAccountIds Linked storage accounts resources ids.
             * @return the next definition stage.
             */
            Update withStorageAccountIds(List<String> storageAccountIds);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LinkedStorageAccountsResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LinkedStorageAccountsResource refresh(Context context);
}
