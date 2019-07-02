package com.example.mehran.task.utils;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface RetrofitMaps {


    @GET("api/directions/json?key=AIzaSyAqXlBp6zYMOumUffHhoPby5HvF0nKckSE")
    Call<Example> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}
