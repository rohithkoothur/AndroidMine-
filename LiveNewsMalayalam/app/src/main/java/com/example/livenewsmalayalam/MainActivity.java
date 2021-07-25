package com.example.livenewsmalayalam;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.livenewsmalayalam.adapters.RecyclerViewDataAdapter;
import com.example.livenewsmalayalam.adapters.SectionListDataAdapter;
import com.example.livenewsmalayalam.models.SectionDataModel;
import com.example.livenewsmalayalam.models.SingleItemModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;


    ArrayList<SectionDataModel> allSampleData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        allSampleData = new ArrayList<SectionDataModel>();




        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this, allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);


    }

    public void createDummyData() {
        for (int i = 1; i <= 2; i++) {

            SectionDataModel dm = new SectionDataModel();
            if(i==1){
                dm.setHeaderTitle("Malayalam News");
            }
            if(i==2){
                dm.setHeaderTitle("Hindi News");
            }



            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
            for (int j = 0; j <= 5; j++) {

                if(i==1 && j==1){
                    singleItem.add(new SingleItemModel("Mathruboomi" , "MainActivity2",R.drawable.ic_mathruboomi));
                }
                if(i==1 && j==0){
                    singleItem.add(new SingleItemModel("24News" , "MainActivity2",R.drawable.ic_24));
                }
                if(i==1 && j==2){
                    singleItem.add(new SingleItemModel("Janam" , "MainActivity2",R.drawable.ic_ja));
                }
                if(i==1 && j==3){
                    singleItem.add(new SingleItemModel("Asianet News" , "MainActivity2",R.drawable.ic_asianet));
                }
                if(i==1 && j==4){
                    singleItem.add(new SingleItemModel("Kairali News" , "MainActivity2",R.drawable.ic_kairali));
                }



            }

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);

        }
    }
}