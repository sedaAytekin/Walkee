package com.eve.payall.walkee.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eve.payall.walkee.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceListFragment extends Fragment implements DeviceListAdapter.ItemClickListener{

    DeviceListAdapter adapter;

    @BindView(R.id.nameTV)
    AppCompatTextView nameTV;
    @BindView(R.id.recylerview)
    RecyclerView recylerview;
    @BindView(R.id.deviceIV)
    AppCompatImageView deviceIV;
    @BindView(R.id.deviceTV)
    AppCompatTextView deviceTV;
    @BindView(R.id.addDeviceCL)
    ConstraintLayout addDeviceCL;
    @BindView(R.id.backHomeIV)
    AppCompatImageView backHomeIV;
    @BindView(R.id.backHomeTV)
    AppCompatTextView backHomeTV;
    @BindView(R.id.backHomeCL)
    ConstraintLayout backHomeCL;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.device_list_fragment, container, false);
        try {
            ButterKnife.bind(this, view);
        } catch (Exception e) {
            // Log.e("Base Fragment", String.valueOf(e));
        }

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


    @OnClick({R.id.addDeviceCL, R.id.backHomeCL})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.addDeviceCL:
                DeviceAddingFragment deviceAddingFragment = new DeviceAddingFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.homeFrame, deviceAddingFragment, "DeviceAddingFragment")
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.backHomeCL:
                Intent backIntent = new Intent(getActivity(), HomeActivity.class);
                startActivity(backIntent);
                break;
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getContext(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

    }
}
