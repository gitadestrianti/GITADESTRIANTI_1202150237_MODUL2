package com.gides.gita_destrianti_1202150237_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

import com.gides.gita_destrianti_1202150237_modul2.CustomAdapter;

public class DaftarMenu extends AppCompatActivity {

    private final LinkedList<String> namaMakanan = new LinkedList<>();
    private final LinkedList<Integer> hargaMakanan = new LinkedList<>();
    private final LinkedList<Integer> fotoMakanan = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new CustomAdapter(this, namaMakanan, hargaMakanan, fotoMakanan);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            namaMakanan.add("Banana Split");
            namaMakanan.add("Pancake");
            namaMakanan.add("Pudding");
            namaMakanan.add("Strawberry Smoothies");
            namaMakanan.add("Macaron");


            hargaMakanan.add(25000);
            hargaMakanan.add(20000);
            hargaMakanan.add(15000);
            hargaMakanan.add(20000);
            hargaMakanan.add(15000);


            fotoMakanan.add(R.drawable.bananasplit);
            fotoMakanan.add(R.drawable.pancake);
            fotoMakanan.add(R.drawable.pudding);
            fotoMakanan.add(R.drawable.smoothie);

        }
    }
}
