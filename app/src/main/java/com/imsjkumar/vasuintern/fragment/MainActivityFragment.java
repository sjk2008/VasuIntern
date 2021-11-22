package com.imsjkumar.vasuintern.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imsjkumar.vasuintern.R;


public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main_activity, container, false);

        //on click listener , find view by id
        // jo bhi call krwane hai wo hm yahi code likh ke call  krenge


        return view;
    }
}