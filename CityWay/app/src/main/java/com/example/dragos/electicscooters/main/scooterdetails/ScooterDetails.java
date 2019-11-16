package com.example.dragos.electicscooters.main.scooterdetails;

import android.content.Context;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dragos.electicscooters.R;

public class ScooterDetails extends DialogFragment {

    private ScooterDetailsListener mListener;
    private Button ringBtn;
    private Button scanBtn;

    public ScooterDetails(){}

    public static ScooterDetails newInstance(String title) {
        ScooterDetails frag = new ScooterDetails();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.scooter_details_window,container);

        ringBtn=v.findViewById(R.id.ring_button);

        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onScanPressed();
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mListener = (ScooterDetailsListener) context;
    }

    public interface ScooterDetailsListener{
        void onCallPressed();
        void onScanPressed();
    }
}
