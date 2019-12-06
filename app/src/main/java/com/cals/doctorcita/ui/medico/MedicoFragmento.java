package com.cals.doctorcita.ui.medico;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cals.doctorcita.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MedicoFragmento extends Fragment {


    public MedicoFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento_medico, container, false);
    }

}
