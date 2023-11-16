package com.example.myapplication.connectors;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetroFitInstance {

    public static RetroFitInstance instance;
    public ApiInterface apiInterface;

    RetroFitInstance(){
        Retrofit retroFit = new Retrofit.Builder().baseUrl("https://digimon-api.vercel.app/api/").addConverterFactory(GsonConverterFactory.create()).build();
        apiInterface = retroFit.create(ApiInterface.class);
    }
    public static RetroFitInstance getInstance(){
        if(instance==null){
            instance= new RetroFitInstance();

        }
        return instance;
    }

    public ApiInterface getApiInterface(){
        return apiInterface;
    }
}
