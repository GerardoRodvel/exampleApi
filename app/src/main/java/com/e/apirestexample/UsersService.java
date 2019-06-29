package com.e.apirestexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UsersService <call, path> {

    @GET("users/")
    Call<List<Report>> getReports();

    @POST("users/")
    Call<Report> addReport(@Body Report report);

    @GET("users/{id}")
    Call<Report> getByIdReport(@Path("id") int id);

    @PUT("users/{id}")
    Call<Report> updateReport(@Path("id") int id, @Body Report report);

    @DELETE("users/{id}")
    Call<Report> deleteReport(@Path("id") int id);

}
