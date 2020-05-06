package com.example.starbuzzstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    Intent intent;
    public  static  final String EXTRA_MESSAGE = "com.example.starbuzzstore.EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = (ListView) findViewById(R.id.listView1);

        String storeitemsArray[] = {"Cold drinks","Ice Creams","Beers"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,storeitemsArray);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String positionItem = listView1.getItemAtPosition(position).toString();
                if(positionItem.equals("Cold drinks")) {
                  String categoryColdDrinks[] = {"Coca cola","Red Bull","Appy Fizz"};
                  passItemtoAnotherActivity(categoryColdDrinks);
                }
                else if(positionItem.equals("Ice Creams")) {
                  String categoryIceCreams [] = {"chocolate N' chips","Vanilla","chocolate chip cookie"};
                  passItemtoAnotherActivity(categoryIceCreams);
                }else if(positionItem.equals("Beers")) {
                    String categoryBeers[] = {"Miller","Corona","Fosters"};
                    passItemtoAnotherActivity(categoryBeers);
                }

            }
        });
    }
    public void passItemtoAnotherActivity(String categoryItems[]) {
        String categoryItemsPass[] = categoryItems;
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("EXTRA_MESSAGE",categoryItemsPass);
        startActivity(intent);
    }

}
