package com.eve.payall.walkee.Verify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.eve.payall.walkee.Login.LoginActivity;
import com.eve.payall.walkee.R;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VerifyActivity extends AppCompatActivity {


    @BindView(R.id.titleTV)
    AppCompatTextView titleTV;
    @BindView(R.id.verifyTL)
    TextInputLayout verifyTL;
    @BindView(R.id.sendBT)
    AppCompatButton sendBT;
    @BindView(R.id.backLoginBT)
    AppCompatButton backLoginBT;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify);
        ButterKnife.bind(this);


    }


    @OnClick({R.id.sendBT, R.id.backLoginBT})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.sendBT:
                break;
            case R.id.backLoginBT:
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                break;
        }
    }
}
