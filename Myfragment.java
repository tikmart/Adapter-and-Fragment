package com.example.hovik.frag_list;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Myfragment extends Fragment {
    String[] strings = {"AAA", "BBB", "CCC", "DDD", "EEE"};

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity1, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list);
        Myadapter myadapter = new Myadapter(getActivity().getApplicationContext(),strings);
        listView.setAdapter(myadapter);
        return view;


    }




}
