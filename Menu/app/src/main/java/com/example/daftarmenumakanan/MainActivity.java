package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView daftar_makanan;
    private ArrayList<Makanan> LisMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftar_makanan = findViewById(R.id.daftar_makanan);
        initData();

        daftar_makanan.setAdapter(new MenuAdapter(LisMenu));
        daftar_makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private  void  initData(){
        this.LisMenu = new ArrayList<>();
        LisMenu.add(new Makanan("Warung Podo Moro",
                "Jl.Koebangsaan No 8",
                "Warung Paling Enjoy di Pare",
                R.drawable.semuamakanan));

        LisMenu.add(new Makanan("Soto Ayam",
                "Jl.Koebangsaan No 8",
                "Makanan yang memiliki rasa yang unik dikarenakan banyaknya kontimen yang ada",
                R.drawable.soto));

        LisMenu.add(new Makanan("Nasi Pecel",
                "Jl.Koebangsaan No 8",
                "Nasi yang dikombinasi dengan sambal kacang dengan lauk tempe, serta terdapat beberapa sayuran, dan tambahan rempeyek",
                R.drawable.nasi_pecel));

        LisMenu.add(new Makanan("Nasi Tumpang",
                "Jl.Koebangsaan No 8",
                "sambal tumpang khas Kediri, yang memiliki cita rasa unik",
                R.drawable.sambal_tumpang));

        LisMenu.add(new Makanan("Tahu Tek",
                "Jl.Koebangsaan No 8",
                "Percampuran kontimen dari sayuran, sambal kacang, tahu, lontong, dan masih banyak lagi",
                R.drawable.tahu_tek));
    }
}