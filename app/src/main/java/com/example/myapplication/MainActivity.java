package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.connectors.ApiInterface;
import com.example.myapplication.connectors.RetroFitInstance;
import com.example.myapplication.model.DigimonModel;
import com.example.myapplication.view.DigimonAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    private List<DigimonModel> digimons;
    public String URL = "https://digimon-api.vercel.app/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = findViewById(R.id.rvMain);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        RetroFitInstance.getInstance().getApiInterface().getDigimon().enqueue(new Callback<List<DigimonModel>>() {
            @Override
            public void onResponse(Call<List<DigimonModel>> call, Response<List<DigimonModel>> response) {
                digimons = response.body();
                rvMain.setAdapter(new DigimonAdapter(getApplicationContext(),digimons));
            }

            @Override
            public void onFailure(Call<List<DigimonModel>> call, Throwable t) {
                Log.d("fallo","falló");
            }
        });


    }
}