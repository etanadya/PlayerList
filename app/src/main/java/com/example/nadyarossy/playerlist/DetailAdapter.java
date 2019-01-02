package com.example.nadyarossy.playerlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {
    private ArrayList<Soccer>listSoccer;
    private Context context;

    public DetailAdapter(Context context) {this.context=context;}
    public ArrayList<Soccer> getListSoccer(){return listSoccer;}
    public void setListSoccer(ArrayList<Soccer>listSoccer){this.listSoccer=listSoccer;}

    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DetailAdapter.DetailViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_player, viewGroup,false);
        DetailViewHolder detailViewHolder = new DetailViewHolder(view);
        return detailViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder viewHolder, int i) {
        viewHolder.nama.setText(getListSoccer().get(i).getNama());
        viewHolder.kebangsaan.setText(getListSoccer().get(i).getKebangsaan());
        viewHolder.born.setText(getListSoccer().get(i).getTtl());
        viewHolder.deskripsi.setText(getListSoccer().get(i).getDeskripsi());
        viewHolder.tinggi.setText(getListSoccer().get(i).getTinggi());
        viewHolder.berat.setText(getListSoccer().get(i).getBerat());
        viewHolder.signed.setText(getListSoccer().get(i).getSigned());
        viewHolder.bayaran.setText(getListSoccer().get(i).getBayaran());
        Glide.with(context)
                .load(getListSoccer().get(i).getThumb())
                .into(viewHolder.imgPoster);
    }

    @Override
    public int getItemCount() {
        return getListSoccer().size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_photo_detail)
                ImageView imgPoster;
        @BindView(R.id.tv_nama_detail)
                TextView nama;
        @BindView(R.id.tv_kebangsaan)
                TextView kebangsaan;
        @BindView(R.id.tv_born)
                TextView born;
        @BindView(R.id.tv_isi_desc)
                TextView deskripsi;
        @BindView(R.id.tv_isi_tinggi)
                TextView tinggi;
        @BindView(R.id.tv_isi_berat)
                TextView berat;
        @BindView(R.id.tv_isi_signed)
                TextView signed;
        @BindView(R.id.tv_isi_wage)
                TextView bayaran;

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
