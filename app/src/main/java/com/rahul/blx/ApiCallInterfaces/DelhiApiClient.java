package com.rahul.blx.ApiCallInterfaces;

import com.rahul.blx.DelhiResponseClasses.ResponseDelhiClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DelhiApiClient {
    @GET("relevance/feed?location=4058659&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseDelhiClasses> getApit();
}
