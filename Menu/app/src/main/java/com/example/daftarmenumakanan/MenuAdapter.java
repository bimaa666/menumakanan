package com.example.daftarmenumakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    public MenuAdapter(ArrayList<Makanan> daftar_makanan) {
        this.daftar_makanan = daftar_makanan;
    }

    private ArrayList<Makanan> daftar_makanan;

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        Makanan makanan = daftar_makanan.get(position);
        holder.txtmakanan.setText(makanan.getNama());
        holder.txtAlamat.setText(makanan.getAlamat());
        holder.imgFoto.setImageResource(makanan.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), makanan.getDeskripsi(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return daftar_makanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtmakanan, txtAlamat;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtmakanan = (TextView) itemView.findViewById(R.id.txtmakanan);
            txtAlamat = (TextView) itemView.findViewById(R.id.txtAlamat);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
