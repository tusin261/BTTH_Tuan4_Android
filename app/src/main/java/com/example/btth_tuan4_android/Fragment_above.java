package com.example.btth_tuan4_android;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_above extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int n;
    private SendingData sendingData;
    public Fragment_above() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_above.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_above newInstance(String param1, String param2) {
        Fragment_above fragment = new Fragment_above();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData = (SendingData) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_above, container, false);
        ImageButton btnAdd = view.findViewById(R.id.imgBtnAdd);
        ImageButton btnMinus = view.findViewById(R.id.imgBtnMinus);
        TextView tvSl = view.findViewById(R.id.tvSl);
        n = Integer.parseInt(tvSl.getText().toString());
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                tvSl.setText(String.valueOf(n));
                sendingData.send(String.valueOf(n*141.800));
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n--;
                tvSl.setText(String.valueOf(n));
                sendingData.send(String.valueOf(n*141.800));
            }
        });
        return view;
    }
}