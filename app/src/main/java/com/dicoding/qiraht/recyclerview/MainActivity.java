package com.dicoding.qiraht.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvItem;
    private ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItem = findViewById(R.id.rv_main);
        rvItem.setHasFixedSize(true);

        list.addAll(ItemsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        ListItemAdapter listItemAdapter = new ListItemAdapter(list);
        rvItem.setAdapter(listItemAdapter);
    }
}