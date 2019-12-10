package com.f19.fragmentintrodemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {

//    private int id;
//    private int pos;

    public void displayDetails(int id) {
        View view = getView();
        if (view != null) {
            TextView title_text = view.findViewById(R.id.title_position);
            TextView description_text = view.findViewById(R.id.description_position);
            Position position = Position.positions[id];
            title_text.setText(position.getTitle());
            description_text.setText(position.getDescription());
            Log.i("TAG", "displayDetails: " + id);
        }
    }

    /*
    public void setPos(int pos) {
        this.pos = pos;
    }


    public void setPosition_id(int position_id) {
        this.id = position_id;
    }
     */
    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        View view = getView();
//        if (view != null) {
//            TextView title_text = view.findViewById(R.id.title_position);
//            TextView description_text = view.findViewById(R.id.description_position);
////            Position position = Position.positions[(int) position_id];
//            Position position = Position.positions[pos];
//            title_text.setText(position.getTitle());
//            description_text.setText(position.getDescription());
//
//        }
//    }


}
