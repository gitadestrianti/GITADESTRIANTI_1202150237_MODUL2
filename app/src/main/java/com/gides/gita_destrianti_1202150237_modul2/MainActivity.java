package com.gides.gita_destrianti_1202150237_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Main activity adalah splash screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//mengambil layout dari activity_main

        final Toast toast = Toast.makeText(this, "Loading", Toast.LENGTH_LONG);
        toast.show();//menampilkan toast bertuliskan loading

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"GITADESTRIANTI_1202150237!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));//setelah splash dan masuk ke aplikasi, akan ditampilkan toast welcome
                Intent intent = new Intent(MainActivity.this, Menuutama.class);//dari MainActivity.java lalu ke MenuutamaActivity.java (aktivitas selanjutnya)
                startActivity(intent);
                finish();
            }
        },3000L);
    }
}
