package com.eve.payall.walkee.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eve.payall.walkee.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceSetupFragment extends Fragment implements DeviceListAdapter.ItemClickListener{


    @BindView(R.id.recylerview)
    RecyclerView recylerview;
    @BindView(R.id.ssidET)
    EditText ssidET;
    @BindView(R.id.ssidPasswordET)
    EditText ssidPasswordET;
    @BindView(R.id.completeBT)
    AppCompatButton completeBT;
    @BindView(R.id.backCL)
    ConstraintLayout backCL;
    @BindView(R.id.backHomeCL)
    ConstraintLayout backHomeCL;

    DeviceListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setup_device_fragment, container, false);
        ButterKnife.bind(this, view);
        // TODO: 2020-04-24 buraya gelen liste olarak değişecek
        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        // set up the RecyclerView
        recylerview.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new DeviceListAdapter(getContext(), animalNames);
        adapter.setClickListener(this);
        recylerview.setAdapter(adapter);

        return view;
    }


    @OnClick({R.id.completeBT, R.id.backCL, R.id.backHomeCL})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.completeBT:
                Toast.makeText(getContext(), "Başarılı", Toast.LENGTH_SHORT).show();
                break;
            case R.id.backCL:
                break;
            case R.id.backHomeCL:
                break;
        }
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
