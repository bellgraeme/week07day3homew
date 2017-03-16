package com.codeclan.quotelist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Quote> {


    public ListAdapter(Context context, ArrayList<Quote> movies) {
        super(context, 0, movies);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Quote currentQuote = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.list);
        ranking.setText(currentQuote.getQuote().toString());

        return listItemView;
    }
}
