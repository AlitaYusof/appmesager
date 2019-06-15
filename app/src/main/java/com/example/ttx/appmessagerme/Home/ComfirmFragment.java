package com.example.ttx.appmessagerme.Home;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ttx.appmessagerme.R;
import com.example.ttx.appmessagerme.databinding.FragmentComfirmBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComfirmFragment extends Fragment {
private FragmentComfirmBinding binding;

    public ComfirmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil. inflate(inflater,R.layout.fragment_comfirm, container, false);
        return binding.getRoot();
    }

}
