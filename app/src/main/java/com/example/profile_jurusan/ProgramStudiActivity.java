package com.example.profile_jurusan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProgramStudiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pogram_studi_page);

        // Listener untuk navigasi navbar
        ImageView prodiIcon = findViewById(R.id.icon_program_studi);
        prodiIcon.setOnClickListener(v -> {
            // Sudah berada di halaman Dashboard, tidak perlu pindah
        });

        ImageView spmbIcon = findViewById(R.id.icon_spmb);
        spmbIcon.setOnClickListener(v -> {
            Intent intent = new Intent(ProgramStudiActivity.this, SpmbActivity.class);
            startActivity(intent);
        });

        ImageView dosentendikIcon = findViewById(R.id.icon_dosen_tendik);
        dosentendikIcon.setOnClickListener(v -> {
            Intent intent = new Intent(ProgramStudiActivity.this, DosenTendikActivity.class);
            startActivity(intent);
        });

        ImageView fasilitasIcon = findViewById(R.id.icon_fasilitas);
        fasilitasIcon.setOnClickListener(v -> {
            Intent intent = new Intent(ProgramStudiActivity.this, FasilitasActivity.class);
            startActivity(intent);
        });

    }
}
