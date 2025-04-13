package com.example.profile_jurusan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DosenTendikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dosen_tendik_page);

        // Listener untuk navigasi navbar
        ImageView dosentendikIcon = findViewById(R.id.icon_dosen_tendik);
        dosentendikIcon.setOnClickListener(v -> {
            // Sudah berada di halaman Dashboard, tidak perlu pindah
        });
        ImageView dashboardIcon = findViewById(R.id.dashboard_icon);
        dashboardIcon.setOnClickListener(v -> {
            Intent intent = new Intent(DosenTendikActivity.this, BerandaActivity.class);
            startActivity(intent);
        });
        ImageView spmbIcon = findViewById(R.id.icon_spmb);
        spmbIcon.setOnClickListener(v -> {
            Intent intent = new Intent(DosenTendikActivity.this, SpmbActivity.class);
            startActivity(intent);
        });

        ImageView prodiIcon = findViewById(R.id.icon_program_studi);
        prodiIcon.setOnClickListener(v -> {
            Intent intent = new Intent(DosenTendikActivity.this, ProgramStudiActivity.class);
            startActivity(intent);
        });

        ImageView fasilitasIcon = findViewById(R.id.icon_fasilitas);
        fasilitasIcon.setOnClickListener(v -> {
            Intent intent = new Intent(DosenTendikActivity.this, FasilitasActivity.class);
            startActivity(intent);
        });

    }
}