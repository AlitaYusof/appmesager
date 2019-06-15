package com.example.ttx.appmessagerme.Home;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ttx.appmessagerme.R;
import com.example.ttx.appmessagerme.databinding.FragmentHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);

        binding.move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.move.setText("ชื่อสถานที่");
            }
        });
        return binding.getRoot();
    }

}
