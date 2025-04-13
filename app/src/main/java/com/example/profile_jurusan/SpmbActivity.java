package com.example.profile_jurusan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SpmbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spmb_page);

        // Listener untuk navigasi navbar
        ImageView spmbIcon = findViewById(R.id.icon_spmb);
        spmbIcon.setOnClickListener(v -> {
            // Sudah berada di halaman Dashboard, tidak perlu pindah
        });

        ImageView dashboardIcon = findViewById(R.id.dashboard_icon);
        dashboardIcon.setOnClickListener(v -> {
            Intent intent = new Intent(SpmbActivity.this, BerandaActivity.class);
            startActivity(intent);
        });

        ImageView prodiIcon = findViewById(R.id.icon_program_studi);
        prodiIcon.setOnClickListener(v -> {
            Intent intent = new Intent(SpmbActivity.this, ProgramStudiActivity.class);
            startActivity(intent);
        });

        ImageView fasilitasIcon = findViewById(R.id.icon_fasilitas);
        fasilitasIcon.setOnClickListener(v -> {
            Intent intent = new Intent(SpmbActivity.this, FasilitasActivity.class);
            startActivity(intent);
        });
        ImageView dosentendikIcon = findViewById(R.id.icon_dosen_tendik);
        fasilitasIcon.setOnClickListener(v -> {
            Intent intent = new Intent(SpmbActivity.this, DosenTendikActivity.class);
            startActivity(intent);
        });
    }
}