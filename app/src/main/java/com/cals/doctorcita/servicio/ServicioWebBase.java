package com.cals.doctorcita.servicio;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicioWebBase {


    private static Retrofit retrofit = null;
    public static Retrofit getClient(){

        HttpLoggingInterceptor interceptor =new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit = new Retrofit.Builder()
                //.baseUrl("https://citamedicautp.000webhostapp.com/")
                .baseUrl("https://citamedicautp.000webhostapp.com/CONTROLADOR/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;

    }



}
