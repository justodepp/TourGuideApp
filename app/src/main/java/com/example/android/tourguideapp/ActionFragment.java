package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class ActionFragment extends Fragment {

    public ActionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_aero_gravity, R.string.desc_aero_gravity,
                R.drawable.aero_gravity));
        places.add(new Place(R.string.name_apokas, R.string.desc_apokas,
                R.drawable.apokas));
        places.add(new Place(R.string.name_escape, R.string.desc_escape,
                R.drawable.escape_room));

        PlaceRecyclerViewAdapter adapter = new PlaceRecyclerViewAdapter(places);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
