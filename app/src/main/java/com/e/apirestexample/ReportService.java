package com.e.apirestexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ReportService <call, path> {

    @GET("denuncias")
    Call<List<Report>> getReports();

    @POST("denuncias/")
    Call<Report> addReport(@Body Report report);

    @GET("denuncias/{id}")
    Call<Report> getByIdReport(@Path("id") int id);

    @PUT("denuncias/{id}")
    Call<Report> updateReport(@Path("id") int id, @Body Report report);

    @DELETE("denuncias/{id}")
    Call<Report> deleteReport(@Path("id") int id);

}
