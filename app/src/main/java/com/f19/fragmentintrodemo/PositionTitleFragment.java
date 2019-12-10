package com.f19.fragmentintrodemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PositionTitleFragment extends ListFragment {


    public PositionTitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] titles = new String[Position.positions.length];
        for (int i=0; i<titles.length; i++)
            titles[i] = Position.positions[i].getTitle();
        ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(), android.R.layout.simple_list_item_1, titles);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
