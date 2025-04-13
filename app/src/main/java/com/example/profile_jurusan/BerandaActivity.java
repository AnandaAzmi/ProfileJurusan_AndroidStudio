package com.example.profile_jurusan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.beranda);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.beranda_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tambahkan Listener untuk setiap item di navbar
        setupNavbarListeners();
    }

    private void setupNavbarListeners() {
        // Home (Beranda) - Tidak perlu berpindah activity
        ImageView dashboardIcon = findViewById(R.id.dashboard_icon);
        dashboardIcon.setOnClickListener(v -> {
            // Sudah di halaman beranda, tidak ada aksi
        });

        // SPMB
        ImageView spmbIcon = findViewById(R.id.icon_spmb);
        spmbIcon.setOnClickListener(v -> {
            Intent intent = new Intent(BerandaActivity.this, SpmbActivity.class);
            startActivity(intent);
        });

        // Program Studi
        ImageView prodiIcon = findViewById(R.id.icon_program_studi);
        prodiIcon.setOnClickListener(v -> {
            Intent intent = new Intent(BerandaActivity.this, ProgramStudiActivity.class);
            startActivity(intent);
        });

        // Fasilitas
        ImageView fasilitasIcon = findViewById(R.id.icon_fasilitas);
        fasilitasIcon.setOnClickListener(v -> {
            Intent intent = new Intent(BerandaActivity.this, FasilitasActivity.class);
            startActivity(intent);
        });

        // Dosen dan Tendik
        ImageView dosenIcon = findViewById(R.id.icon_dosen_tendik);
        dosenIcon.setOnClickListener(v -> {
            Intent intent = new Intent(BerandaActivity.this, DosenTendikActivity.class);
            startActivity(intent);
        });
    }
}