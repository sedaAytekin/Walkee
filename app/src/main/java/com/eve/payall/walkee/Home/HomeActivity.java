package com.eve.payall.walkee.Home;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.eve.payall.walkee.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        DeviceListFragment deviceListFragment = new DeviceListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.homeFrame, deviceListFragment, "DeviceListFragment")
                .addToBackStack(null)
                .commit();


    }


}
