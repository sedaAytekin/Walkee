package com.eve.payall.walkee.Register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.eve.payall.walkee.Login.LoginActivity;
import com.eve.payall.walkee.R;
import com.eve.payall.walkee.Verify.VerifyActivity;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.registerTV)
    AppCompatTextView registerTV;
    @BindView(R.id.nameTL)
    TextInputLayout nameTL;
    @BindView(R.id.surnameTL)
    TextInputLayout surnameTL;
    @BindView(R.id.userNameTL)
    TextInputLayout userNameTL;
    @BindView(R.id.emailTL)
    TextInputLayout emailTL;
    @BindView(R.id.passwordTL)
    TextInputLayout passwordTL;
    @BindView(R.id.registerBT)
    AppCompatButton registerBT;
    @BindView(R.id.backLoginBT)
    AppCompatButton backLoginBT;
    @BindView(R.id.sendBT)
    AppCompatButton sendBT;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        ButterKnife.bind(this);




    }

    @OnClick({R.id.registerBT, R.id.backLoginBT, R.id.sendBT})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.registerBT:
                break;
            case R.id.backLoginBT:
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                break;
            case R.id.sendBT:
                // TODO: 2020-04-22 bu buton verify geçişi için denemelik eklendi. silinecek. api calldan sonra çağırılmalı normalde
                Intent intentVerify = new Intent(this, VerifyActivity.class);
                startActivity(intentVerify);
                break;
        }
    }
}
