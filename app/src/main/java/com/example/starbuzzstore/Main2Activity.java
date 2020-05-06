package com.example.starbuzzstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
     ListView listView1;
     Intent intent;
     public static final String EXTRA_MESSAGE = "com.example.starbuzzstore.EXTRA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView1 = (ListView) findViewById(R.id.listView1);

        Intent intent = getIntent();
       String categoryItems[] = intent.getStringArrayExtra("EXTRA_MESSAGE");
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,categoryItems);
       listView1.setAdapter(adapter);
       listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String positionItem = listView1.getItemAtPosition(position).toString();
               if(positionItem.equals("Coca cola")) {
                   connectItemToAnotherActivity("Coca cola");
               }else if(positionItem.equals("Red Bull")) {
                   connectItemToAnotherActivity("Red Bull");
               }else  if(positionItem.equals("Appy Fizz")) {
                   connectItemToAnotherActivity("Appy Fizz");
               }else if(positionItem.equals("chocolate N' chips")) {
                   connectItemToAnotherActivity("chocolate N' chips");
               }else if(positionItem.equals("Vanilla")) {
                   connectItemToAnotherActivity("Vanilla");
               }else if(positionItem.equals("chocolate chip cookie")) {
                   connectItemToAnotherActivity("chocolate chip cookie");
               }else if(positionItem.equals("Miller")) {
                   connectItemToAnotherActivity("Miller");
               }else if(positionItem.equals("Corona")) {
                   connectItemToAnotherActivity("Corona");
               }else if(positionItem.equals("Fosters")) {
                   connectItemToAnotherActivity("Fosters");
               }

           }
       });

        
    }
    public void connectItemToAnotherActivity(String item) {
        String item1 = item;
        intent = new Intent(getApplicationContext(),Main3Activity.class);
        intent.putExtra("EXTRA_MESSAGE",item1);
        startActivity(intent);
    }

}
