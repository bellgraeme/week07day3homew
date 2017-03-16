package com.codeclan.quotelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.codeclan.quotelist.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List list = new List();
        ArrayList<Quote> quoteList = list.getList();

        ListAdapter listAdapter = new ListAdapter(this, quoteList);

        ListView listView =  (ListView)findViewById(R.id.list);
        listView.setAdapter(listAdapter);
    }

    public void quouteClicked(View textView){
        TextView title = (TextView) textView;
    }

    public void itemClicked(View item){
        Log.d("Item clicked", "Yay");
    }
}
