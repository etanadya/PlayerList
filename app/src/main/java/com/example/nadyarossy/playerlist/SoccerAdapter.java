package com.example.nadyarossy.playerlist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SoccerAdapter extends RecyclerView.Adapter<SoccerAdapter.ViewHolder> {
    ArrayList<Soccer> listSoccer;
    Context context;

    SoccerAdapter(Context context){
        this.context = context;
    }
    public ArrayList<Soccer> getListSoccer(){
        return listSoccer;
    }
    public void setListSoccer(ArrayList<Soccer> listSoccer){
        this.listSoccer = listSoccer;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.soccer_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.nama.setText(getListSoccer().get(i).getNama());
        viewHolder.team.setText(getListSoccer().get(i).getTeam());
        viewHolder.posisi.setText(getListSoccer().get(i).getPosisi());
        Glide.with(context)
                .load(getListSoccer().get(i).getCutout())
                .into(viewHolder.imgPoster);
        viewHolder.btnDetail.setOnClickListener(new ClickListener(i, new ClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(view.getContext(),DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_NAMA, getListSoccer().get(position).getNama());
                intent.putExtra(DetailActivity.EXTRA_KEBANGSAAN, getListSoccer().get(position).getKebangsaan());
                intent.putExtra(DetailActivity.EXTRA_TTL, getListSoccer().get(position).getTtl());
                intent.putExtra(DetailActivity.EXTRA_PHOTO, getListSoccer().get(position).getThumb());
                intent.putExtra(DetailActivity.EXTRA_DESC, getListSoccer().get(position).getDeskripsi());
                intent.putExtra(DetailActivity.EXTRA_TINGGI, getListSoccer().get(position).getTinggi());
                intent.putExtra(DetailActivity.EXTRA_BERAT, getListSoccer().get(position).getBerat());
                intent.putExtra(DetailActivity.EXTRA_SIGNED, getListSoccer().get(position).getSigned());
                intent.putExtra(DetailActivity.EXTRA_BAYARAN, getListSoccer().get(position).getBayaran());
                view.getContext().startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListSoccer().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_photo)
        ImageView imgPoster;
        @BindView(R.id.tv_nama)
        TextView nama;
        @BindView(R.id.tv_team)
        TextView team;
        @BindView(R.id.tv_posisi)
        TextView posisi;
        @BindView(R.id.btn_detail)
        Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
