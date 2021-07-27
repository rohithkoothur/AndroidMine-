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
        for (int i = 1; i <= 4; i++) {

            SectionDataModel dm = new SectionDataModel();
            if (i == 1) {
                dm.setHeaderTitle("Malayalam News");
            }
            if (i == 2) {
                dm.setHeaderTitle("Hindi News");
            }
            if (i == 3) {
                dm.setHeaderTitle("National News : ENGLISH");
            }
            if (i == 4) {
                dm.setHeaderTitle("Tamil News");
            }


            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
            for (int j = 0; j <= 5; j++) {

                if (i == 1 && j == 1) {
                    singleItem.add(new SingleItemModel("Mathruboomi", "MainActivity2", R.drawable.ic_mathruboomi));
                }
                if (i == 1 && j == 0) {
                    singleItem.add(new SingleItemModel("24News", "MainActivity2", R.drawable.ic_24));
                }
                if (i == 1 && j == 2) {
                    singleItem.add(new SingleItemModel("Janam", "MainActivity2", R.drawable.ic_ja));
                }
                if (i == 1 && j == 3) {
                    singleItem.add(new SingleItemModel("Asianet News", "MainActivity2", R.drawable.ic_asianet));
                }
                if (i == 1 && j == 4) {
                    singleItem.add(new SingleItemModel("Kairali News", "MainActivity2", R.drawable.ic_kairali));
                }
                if (i == 2 && j == 1) {
                    singleItem.add(new SingleItemModel("Republic", "MainActivity2", R.drawable.ic_republic));
                }
                if (i == 2 && j == 2) {
                    singleItem.add(new SingleItemModel("Aaj Tak", "MainActivity2", R.drawable.ic_aajtak));
                }
                if (i == 2 && j == 3) {
                    singleItem.add(new SingleItemModel("NDTV", "MainActivity2", R.drawable.ic_ndtv));
                }
                if (i == 2 && j == 4) {
                    singleItem.add(new SingleItemModel("India TV", "MainActivity2", R.drawable.ic_indiatv));
                }
                if (i == 2 && j == 5) {
                    singleItem.add(new SingleItemModel("India Today", "MainActivity2", R.drawable.ic_indiatoday));
                }
                if (i == 3 && j == 1) {
                    singleItem.add(new SingleItemModel("Republic ENG", "MainActivity2", R.drawable.ic_republic));
                }
                if (i == 3 && j == 2) {
                    singleItem.add(new SingleItemModel("CNN18", "MainActivity2", R.drawable.ic_cnn));
                }
                if (i == 3 && j == 3) {
                    singleItem.add(new SingleItemModel("NDTV 24x7", "MainActivity2", R.drawable.ic_ndtveng));
                }
                if (i == 3 && j == 4) {
                    singleItem.add(new SingleItemModel("News X", "MainActivity2", R.drawable.ic_newsx));
                }
                if (i == 4 && j == 1) {
                    singleItem.add(new SingleItemModel("Sun News", "MainActivity2", R.drawable.ic_sunnews));
                }
                if (i == 4 && j == 2) {
                    singleItem.add(new SingleItemModel("Puthiyathalaimurai", "MainActivity2", R.drawable.ic_puthiya));
                }
                if (i == 4 && j == 3) {
                    singleItem.add(new SingleItemModel("Polimer News", "MainActivity2", R.drawable.ic_polimer));
                }
                if (i == 4 && j == 4) {
                    singleItem.add(new SingleItemModel("News18 Tamil", "MainActivity2", R.drawable.ic_news18tamil));
                }
                if (i == 4 && j == 5) {
                    singleItem.add(new SingleItemModel("Jaya Plus", "MainActivity2", R.drawable.ic_jayaplus));
                }



            }

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);

        }
    }
}