package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AroundFragment extends Fragment {

    public AroundFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_milano, R.string.desc_milano,
                R.drawable.milano));
        places.add(new Place(R.string.name_eataly, R.string.desc_eataly,
                R.drawable.eataly));
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
