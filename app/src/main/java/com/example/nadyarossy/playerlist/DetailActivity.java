package com.example.nadyarossy.playerlist;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String EXTRA_NAMA = "extra_nama";
    public static String EXTRA_KEBANGSAAN = "extra_kebangsaan";
    public static String EXTRA_TTL = "extra_ttl";
    public static String EXTRA_PHOTO = "extra_photo";
    public static String EXTRA_DESC = "extra_desc";
    public static String EXTRA_TINGGI = "extra_tinggi";
    public static String EXTRA_BERAT = "extra_berat";
    public static String EXTRA_SIGNED = "extra_signed";
    public static String EXTRA_BAYARAN = "extra_bayaran";
    TextView tvNama, tvKebangsaan, tvTtl, tvDesc, tvTinggi, tvBerat, tvSigned, tvBayaran;
    ImageView imgPhotoDetail;
    Context context;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_player);
        tvNama = (TextView) findViewById(R.id.tv_nama_detail);
        tvKebangsaan = (TextView) findViewById(R.id.tv_kebangsaan);
        tvTtl = (TextView) findViewById(R.id.tv_born);
        tvDesc = (TextView) findViewById(R.id.tv_isi_desc);
        tvTinggi = (TextView) findViewById(R.id.tv_isi_tinggi);
        tvBerat = (TextView) findViewById(R.id.tv_isi_berat);
        tvSigned = (TextView) findViewById(R.id.tv_isi_signed);
        tvBayaran = (TextView) findViewById(R.id.tv_isi_wage);
        imgPhotoDetail = (ImageView) findViewById(R.id.img_photo_detail);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_PHOTO))
                .into(imgPhotoDetail);
        tvNama.setText(getIntent().getStringExtra(EXTRA_NAMA));
        tvKebangsaan.setText(getIntent().getStringExtra(EXTRA_KEBANGSAAN));
        tvTtl.setText(getIntent().getStringExtra(EXTRA_TTL));
        tvDesc.setText(getIntent().getStringExtra(EXTRA_DESC));
        tvTinggi.setText(getIntent().getStringExtra(EXTRA_TINGGI));
        tvBerat.setText(getIntent().getStringExtra(EXTRA_BERAT));
        tvSigned.setText(getIntent().getStringExtra(EXTRA_SIGNED));
        tvBayaran.setText(getIntent().getStringExtra(EXTRA_BAYARAN));
    }

}
