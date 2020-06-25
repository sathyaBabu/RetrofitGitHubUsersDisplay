package com.sathya.retrofitgithubusersdisplay.rest_api;


import com.sathya.retrofitgithubusersdisplay.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:android+location:bangalore")
    Call<ItemResponse> getItems();
}
