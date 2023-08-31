package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


public class video extends Fragment {
View view;
VideoView vView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_video, container, false);
        return view;

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        VideoView vView = view.findViewById(R.id.vView);
        vView.setVideoPath("android.resource://"+ getActivity().getPackageName()+"/"+R.raw.v1);
        MediaController mc = new MediaController(getActivity());
        mc.setAnchorView(vView);
        vView.setMediaController(mc);
        vView.start();

    }

    private String getPackageName() {
        return null;
    }

}