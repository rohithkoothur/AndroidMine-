package com.example.livenewsmalayalam;


import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.livenewsmalayalam.adapters.RecyclerViewDataAdapter;
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
                    singleItem.add(new SingleItemModel("Mathruboomi" , "URL " + j,R.drawable.ic_ac1));
                }


                singleItem.add(new SingleItemModel("Item " + j, "URL " + j,R.drawable.ic_ac));
            }

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);

        }
    }
}