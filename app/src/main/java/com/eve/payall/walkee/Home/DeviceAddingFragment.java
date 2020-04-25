package com.eve.payall.walkee.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.eve.payall.walkee.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceAddingFragment extends Fragment {


    @BindView(R.id.setupBT)
    AppCompatButton setupBT;
    @BindView(R.id.macAdressET)
    EditText macAdressET;
    @BindView(R.id.addDeviceBT)
    AppCompatButton addDeviceBT;
    @BindView(R.id.deviceIV)
    AppCompatImageView deviceIV;
    @BindView(R.id.backTV)
    AppCompatTextView backTV;
    @BindView(R.id.backCL)
    ConstraintLayout backCL;
    @BindView(R.id.backHomeIV)
    AppCompatImageView backHomeIV;
    @BindView(R.id.backHomeTV)
    AppCompatTextView backHomeTV;
    @BindView(R.id.backHomeCL)
    ConstraintLayout backHomeCL;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_device_fragment, container, false);
        ButterKnife.bind(this, view);


        return view;
    }

    @OnClick({R.id.setupBT, R.id.addDeviceBT, R.id.backCL, R.id.backHomeCL})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.setupBT:
                DeviceSetupFragment deviceSetupFragment = new DeviceSetupFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.homeFrame, deviceSetupFragment, "DeviceSetupFragment")
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.addDeviceBT:
                break;
            case R.id.backCL:
                break;
            case R.id.backHomeCL:
                break;
        }
    }
}
