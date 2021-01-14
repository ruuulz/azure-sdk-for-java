/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AvailableServiceAliases.
 */
public class AvailableServiceAliasesInner {
    /** The Retrofit service to perform REST calls. */
    private AvailableServiceAliasesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailableServiceAliasesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailableServiceAliasesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(AvailableServiceAliasesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailableServiceAliases to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailableServiceAliasesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.AvailableServiceAliases list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/availableServiceAliases")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.AvailableServiceAliases listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/locations/{location}/availableServiceAliases")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.AvailableServiceAliases listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.AvailableServiceAliases listByResourceGroupNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceGroupNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object if successful.
     */
    public PagedList<AvailableServiceAliasInner> list(final String location) {
        ServiceResponse<Page<AvailableServiceAliasInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<AvailableServiceAliasInner>(response.body()) {
            @Override
            public Page<AvailableServiceAliasInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param location The location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableServiceAliasInner>> listAsync(final String location, final ListOperationCallback<AvailableServiceAliasInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<Page<AvailableServiceAliasInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Page<AvailableServiceAliasInner>>() {
                @Override
                public Page<AvailableServiceAliasInner> call(ServiceResponse<Page<AvailableServiceAliasInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(ServiceResponse<Page<AvailableServiceAliasInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailableServiceAliasInner>> * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-07-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableServiceAliasInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableServiceAliasInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableServiceAliasInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableServiceAliasInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableServiceAliasInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object if successful.
     */
    public PagedList<AvailableServiceAliasInner> listByResourceGroup(final String resourceGroupName, final String location) {
        ServiceResponse<Page<AvailableServiceAliasInner>> response = listByResourceGroupSinglePageAsync(resourceGroupName, location).toBlocking().single();
        return new PagedList<AvailableServiceAliasInner>(response.body()) {
            @Override
            public Page<AvailableServiceAliasInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableServiceAliasInner>> listByResourceGroupAsync(final String resourceGroupName, final String location, final ListOperationCallback<AvailableServiceAliasInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(resourceGroupName, location),
            new Func1<String, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<Page<AvailableServiceAliasInner>> listByResourceGroupAsync(final String resourceGroupName, final String location) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName, location)
            .map(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Page<AvailableServiceAliasInner>>() {
                @Override
                public Page<AvailableServiceAliasInner> call(ServiceResponse<Page<AvailableServiceAliasInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName, final String location) {
        return listByResourceGroupSinglePageAsync(resourceGroupName, location)
            .concatMap(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(ServiceResponse<Page<AvailableServiceAliasInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
    ServiceResponse<PageImpl<AvailableServiceAliasInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<AvailableServiceAliasInner>> * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listByResourceGroupSinglePageAsync(final String resourceGroupName, final String location) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-07-01";
        return service.listByResourceGroup(resourceGroupName, location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableServiceAliasInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableServiceAliasInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableServiceAliasInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableServiceAliasInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableServiceAliasInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object if successful.
     */
    public PagedList<AvailableServiceAliasInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<AvailableServiceAliasInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AvailableServiceAliasInner>(response.body()) {
            @Override
            public Page<AvailableServiceAliasInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableServiceAliasInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<AvailableServiceAliasInner>> serviceFuture, final ListOperationCallback<AvailableServiceAliasInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<Page<AvailableServiceAliasInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Page<AvailableServiceAliasInner>>() {
                @Override
                public Page<AvailableServiceAliasInner> call(ServiceResponse<Page<AvailableServiceAliasInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(ServiceResponse<Page<AvailableServiceAliasInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all available service aliases for this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailableServiceAliasInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableServiceAliasInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableServiceAliasInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableServiceAliasInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableServiceAliasInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableServiceAliasInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object if successful.
     */
    public PagedList<AvailableServiceAliasInner> listByResourceGroupNext(final String nextPageLink) {
        ServiceResponse<Page<AvailableServiceAliasInner>> response = listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AvailableServiceAliasInner>(response.body()) {
            @Override
            public Page<AvailableServiceAliasInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableServiceAliasInner>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<AvailableServiceAliasInner>> serviceFuture, final ListOperationCallback<AvailableServiceAliasInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<Page<AvailableServiceAliasInner>> listByResourceGroupNextAsync(final String nextPageLink) {
        return listByResourceGroupNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Page<AvailableServiceAliasInner>>() {
                @Override
                public Page<AvailableServiceAliasInner> call(ServiceResponse<Page<AvailableServiceAliasInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableServiceAliasInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AvailableServiceAliasInner>>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(ServiceResponse<Page<AvailableServiceAliasInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all available service aliases for this resource group in this region.
     *
    ServiceResponse<PageImpl<AvailableServiceAliasInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableServiceAliasInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> listByResourceGroupNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableServiceAliasInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableServiceAliasInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableServiceAliasInner>> result = listByResourceGroupNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableServiceAliasInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableServiceAliasInner>> listByResourceGroupNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableServiceAliasInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableServiceAliasInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
