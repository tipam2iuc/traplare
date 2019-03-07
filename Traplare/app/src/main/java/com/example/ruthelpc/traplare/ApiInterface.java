package com.example.ruthelpc.traplare;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("inscription.php")
    Call<users> inscription(
            @Field("username") String username,
            @Field("firstname") String firstname,
            @Field("cni") String cni,
            @Field("password") String password,
            @Field("lastname") String lastname,
            @Field("email") String email,
            @Field("phone") String phone
    );

    @FormUrlEncoded
    @POST("login.php")
    Call<users> login(
            @Field("username") String username,
            @Field("password") String password
    );

    //@FormUrlEncoded
    @POST("display_voyages.php")
    Call<List<Voyage>>getVoyage2();
}
