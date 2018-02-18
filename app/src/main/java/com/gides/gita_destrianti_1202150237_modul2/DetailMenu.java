package com.gides.gita_destrianti_1202150237_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailMenu extends AppCompatActivity {
    ImageView ivFoto;
    TextView tvNamaMakanan, tvHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);


        Intent intent = getIntent();
        String makanan = intent.getStringExtra("Makanan");
        Integer harga = intent.getIntExtra("Harga",0);
        Integer foto = intent.getIntExtra("Foto",0);

        Log.d("getIntExtra", ""+harga+foto);

        tvNamaMakanan = (TextView)findViewById(R.id.tvNamaMakanan);
        tvHarga = (TextView)findViewById(R.id.tvHarga);
        ivFoto = (ImageView)findViewById(R.id.ivFoto);

        tvNamaMakanan.setText(makanan);
        tvHarga.setText("Rp. "+harga);
        ivFoto.setImageResource(foto);

    }


}
