package com.example.myapplication.connectors;

import com.example.myapplication.model.DigimonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("digimon")
    Call<List<DigimonModel>> getDigimon();

}
