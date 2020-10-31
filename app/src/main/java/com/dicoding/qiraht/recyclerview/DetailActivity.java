package com.dicoding.qiraht.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final String name = getIntent().getExtras().getString("name");
        final String detail = getIntent().getExtras().getString("detail");
        final String link = getIntent().getExtras().getString("repo");
        // final String img = getIntent().getExtras().getString("photo");

        TextView tv_detailName = findViewById(R.id.tv_detail_name);
        TextView tv_detailDetail = findViewById(R.id.tv_detail_detail);
        TextView tv_detailRepo = findViewById(R.id.tv_detail_repo);
        ImageView detailPhoto = findViewById(R.id.img_detail_photo);


        Glide.with(this).load(getIntent().getExtras().getInt("photo")).into(detailPhoto);
        tv_detailName.setText(name);
        tv_detailDetail.setText(detail);
        tv_detailRepo.setText(link);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(name);
        }
    }
}