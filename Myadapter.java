package com.example.hovik.frag_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Myadapter extends BaseAdapter {

    Context context;
    String strings[];
    LayoutInflater inflater;

    public Myadapter(Context applicationContext,String[] animals) {
        this.context = applicationContext;
        this.strings = animals;
        inflater = (LayoutInflater.from(applicationContext));
    }



    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.fragment_activity1, viewGroup,false);
        TextView textView= (TextView) view.findViewById(R.id.textforfragment);
textView.setText(strings[i]);

        return view;
    }
}
