package com.example.shiru.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItemList = new ArrayList<>();


        for (int i =0; i<=10; i++)
        {

            ListItem listItem = new ListItem();
            listItem.setCountry("Kenya");
            listItem.setCapitalCity("Nairobi");

            listItemList.add(listItem);
        }

        adapter = new CountryAdapter(listItemList,this);

        recyclerView.setAdapter(adapter);


    }
}
