package com.thepranami.newretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("android/jsonandroid")
    Call<JsonResponse> getJSON();
}
