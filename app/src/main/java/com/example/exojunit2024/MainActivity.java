package com.example.exojunit2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Modele.init();

        for(Plat unPlat : Modele.lesPlats){
            Log.d("testAffichage",unPlat.getNomP()+" "+unPlat.getLeType().getLibelleType());

        }
    }
}