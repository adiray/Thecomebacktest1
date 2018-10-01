package com.example.dell.thecomebacktest1.utility;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitClient {


    @GET("PRODUCTS")
    Call<ArrayList<Response>> getallProducts();


    @GET("PRODUCTS?where=FEATURED%3Dtrue")
    Call<ArrayList<Response>> getallFeaturedProducts();




}
