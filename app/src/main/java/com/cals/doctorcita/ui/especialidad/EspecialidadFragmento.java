package com.cals.doctorcita.ui.especialidad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cals.doctorcita.R;


public class EspecialidadFragmento extends Fragment {


    public EspecialidadFragmento() {

    }

    private Button bt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View root = inflater.inflate(R.layout.fragmento_especialidad, container, false);


        return  root;



    }

}
