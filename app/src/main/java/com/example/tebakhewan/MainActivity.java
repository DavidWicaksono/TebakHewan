package com.example.tebakhewan;

import android.content.Intent;
import android.media.Image;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk ImageView
    ImageView imageView_zebra, imageView_angsa, imageView_unta, imageView_singa, imageView_badak, imageView_gajah, imageView_ayam, imageView_kelinci, imageView_koala, imageView_panda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {

        //Membuat fungsi OnClick
        imageView_angsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Membuat objek intent berpindah activity dari MainActivity ke TebakActivity
                Intent an = new Intent(MainActivity.this,TebakActivity.class);
                an.putExtra("nama_hewan","angsa");
                startActivity(an);
            }
        });

        imageView_unta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(MainActivity.this,TebakActivity.class);
                u.putExtra("nama_hewan","unta");
                startActivity(u);
            }
        });

        imageView_zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity.this, TebakActivity.class);
                z.putExtra("nama_hewan","zebra");
                startActivity(z);
            }
        });

        imageView_singa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,TebakActivity.class);
                s.putExtra("nama_hewan","singa");
                startActivity(s);
            }
        });

        imageView_badak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ba = new Intent(MainActivity.this,TebakActivity.class);
                ba.putExtra("nama_hewan","badak");
                startActivity(ba);
            }
        });

        imageView_gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(MainActivity.this,TebakActivity.class);
                g.putExtra("nama_hewan","gajah");
                startActivity(g);
            }
        });

        imageView_ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ay = new Intent(MainActivity.this,TebakActivity.class);
                ay.putExtra("nama_hewan","ayam");
                startActivity(ay);
            }
        });

        imageView_kelinci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this,TebakActivity.class);
                k.putExtra("nama_hewan","kelinci");
                startActivity(k);
            }
        });

        imageView_koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ko = new Intent(MainActivity.this,TebakActivity.class);
                ko.putExtra("nama_hewan","koala");
                startActivity(ko);
            }
        });

        imageView_panda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this,TebakActivity.class);
                p.putExtra("nama_hewan","panda");
                startActivity(p);
            }
        });
    }

    private void setInisialisasi() {
        //Menghubungkan variabel ImageView dengan komponen ImageView pada Layout
        imageView_singa = (ImageView)findViewById(R.id.imageView_singa);
        imageView_zebra = (ImageView)findViewById(R.id.imageView_zebra);
        imageView_unta = (ImageView)findViewById(R.id.imageView_unta);
        imageView_angsa = (ImageView)findViewById(R.id.imageView_angsa);
        imageView_badak = (ImageView)findViewById(R.id.imageView_badak);
        imageView_gajah = (ImageView)findViewById(R.id.imageView_gajah);
        imageView_ayam = (ImageView)findViewById(R.id.imageView_ayam);
        imageView_kelinci = (ImageView)findViewById(R.id.imageView_kelinci);
        imageView_koala = (ImageView)findViewById(R.id.imageView_koala);
        imageView_panda = (ImageView)findViewById(R.id.imageView_panda);
    }
}