package com.gides.gita_destrianti_1202150237_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.LinkedList;

/**
 * Created by ASUS on 18/02/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter {


    private LinkedList<String> daftarMakanan;
    private LinkedList<Integer> daftarHarga;
    private LinkedList<Integer> daftarFoto;
    private LayoutInflater mInflater;

    public CustomAdapter(DaftarMenu daftarMenu, LinkedList<String> namaMakanan, LinkedList<Integer> hargaMakanan, LinkedList<Integer> fotoMakanan) {
        mInflater = LayoutInflater.from(daftarMenu);
        this.daftarMakanan = namaMakanan;
        this.daftarHarga= hargaMakanan;
        this.daftarFoto = fotoMakanan;
    }

    /**
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
    */
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View mItemView = mInflater.inflate(R.layout.listmenu, parent,false);
        return new MenuViewHolder(mItemView,this);

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String makanan = daftarMakanan.get(position);
        Integer harga = daftarHarga.get(position);
        Integer foto = daftarFoto.get(position);
        /**
        holder.foodItemView.setText(makanan);
        holder.priceItemView.setText("Rp."+harga.toString());
        holder.photoItemView.setImageResource(foto);*/

    }



    @Override
    public int getItemCount() {
        return daftarMakanan.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView foodItemView;
        public final TextView priceItemView;
        public final ImageView photoItemView;

        final CustomAdapter mAdapter;
        public MenuViewHolder(final View itemView, CustomAdapter adapter) {
            super(itemView);
            foodItemView = (TextView)itemView.findViewById(R.id.judulMakanan1);
            priceItemView = (TextView)itemView.findViewById(R.id.deskripsiMakanan1);
            photoItemView = (ImageView)itemView.findViewById(R.id.makanan1);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String food = daftarMakanan.get(mPosition);
                    Integer price = daftarHarga.get(mPosition);
                    Integer photo = daftarFoto.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),DetailMenu.class);
                    intent.putExtra("food",food);
                    intent.putExtra("price",price);
                    intent.putExtra("photo",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }
}
