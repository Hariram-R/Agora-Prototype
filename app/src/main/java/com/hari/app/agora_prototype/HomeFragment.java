package com.hari.app.agora_prototype;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    Button castVote;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_home, container, false);
       castVote=view.findViewById(R.id.voteBtn);

       castVote.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent elections = new Intent(getContext(),ElectionsActivity.class);
               getActivity().startActivity(elections);
           }
       });
       return view;
    }

}
