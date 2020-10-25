package com.dicoding.qiraht.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    private void showSelectedItem(Item item) {
        Toast.makeText(this,"Kamu memilih" + item.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerList() {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        ListItemAdapter listItemAdapter = new ListItemAdapter(list);
        rvItem.setAdapter(listItemAdapter);

        listItemAdapter.setOnItemClickCallback(new ListItemAdapter.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(Item data) {
                showSelectedItem(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}