package com.example.laykodri.payonontonbioskop.rest;

import com.example.laykodri.payonontonbioskop.entity.MovieResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Achmad on 23-08-2018
 **/

public interface MovieInterface {
    @GET("movie/now_playing")
    Call<com.example.laykodri.payonontonbioskop.entity.Movie> getNowPlayingMovie(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<com.example.laykodri.payonontonbioskop.entity.Movie> getUpcomingMovie(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResult> getMovieById(@Path("id") String id, @Query("api_key") String apiKey);

    @GET("search/movie/")
    Call<com.example.laykodri.payonontonbioskop.entity.Movie> getMovieBySearch(@Query("query") String q, @Query("api_key") String apiKey);

}
