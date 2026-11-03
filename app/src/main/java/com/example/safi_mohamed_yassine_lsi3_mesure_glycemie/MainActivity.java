package com.example.safi_mohamed_yassine_lsi3_mesure_glycemie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView msg;
    private Button btnConsulter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=findViewById(R.id.msg);
        btnConsulter=findViewById(R.id.btnConsulter);
        btnConsulter.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                msg.setText("hello it's me félicitation");
            }
        });
    }
    /*public void calculer(View view){
        Toast.makeText(this,"le bouton consulter a ete clique",Toast.LENGTH_SHORT).show();
    }*/
}