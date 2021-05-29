package com.rahul.blx.ApiCallInterfaces;

import com.rahul.blx.ElectronicsResponseClasses.ResponseElectronicClasses;
import com.rahul.blx.JobsReponseClasses.ResponseJobClasses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JobApiClient {

    @GET("relevance/v2/search?category=4&facet_limit=100&location=1000001&location_facet_limit=20&platform=web-desktop&user=177617c8e60x2ac165fa&lang=en")
    Call<ResponseJobClasses> getApit();
}
