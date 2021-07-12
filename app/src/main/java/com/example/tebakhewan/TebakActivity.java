package com.example.tebakhewan;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import android.os.Bundle;

public class TebakActivity extends AppCompatActivity {

    //Deklarasi variabel ImageView, EditText, Button
    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    //Deklarasi variabel untuk menyimpan jawaban
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClick();
    }

    private void onClick() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,"Yee Benar!",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this,"ups Salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_hewan = cek.getStringExtra("nama_hewan");

        if (nama_hewan.equals("singa")){
            imageView_tebak.setImageResource(R.drawable.singa);
            jawaban = "singa";

        } else if (nama_hewan.equals("zebra")){
            imageView_tebak.setImageResource(R.drawable.zebra);
            jawaban = "zebra";
        } else if (nama_hewan.equals("angsa")){
            imageView_tebak.setImageResource(R.drawable.angsa);
            jawaban = "angsa";
        } else if (nama_hewan.equals("unta")){
            imageView_tebak.setImageResource(R.drawable.unta);
            jawaban = "unta";
        } else if (nama_hewan.equals("badak")){
            imageView_tebak.setImageResource(R.drawable.badak);
            jawaban = "badak";
        } else if (nama_hewan.equals("gajah")){
            imageView_tebak.setImageResource(R.drawable.gajah);
            jawaban = "gajah";
        } else if (nama_hewan.equals("ayam")){
            imageView_tebak.setImageResource(R.drawable.ayam);
            jawaban = "ayam";
        } else if (nama_hewan.equals("kelinci")){
            imageView_tebak.setImageResource(R.drawable.kelinci);
            jawaban = "kelinci";
        } else if (nama_hewan.equals("koala")){
            imageView_tebak.setImageResource(R.drawable.koala);
            jawaban = "koala";
        } else if (nama_hewan.equals("panda")){
            imageView_tebak.setImageResource(R.drawable.panda);
            jawaban = "panda";
        }
    }

    private void setInitalisasi() {
        //Menghubungkan variabel pada Layout
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }
}