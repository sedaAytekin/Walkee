package com.eve.payall.walkee.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.eve.payall.walkee.Home.HomeActivity;
import com.eve.payall.walkee.R;
import com.eve.payall.walkee.Register.RegisterActivity;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.textfield.TextInputLayout;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.userNameTL)
    TextInputLayout userNameTL;
    @BindView(R.id.passwordTL)
    TextInputLayout passwordTL;
    @BindView(R.id.loginBT)
    AppCompatButton loginBT;
    @BindView(R.id.forgotPsBT)
    AppCompatButton forgotPsBT;
    @BindView(R.id.registerBT)
    AppCompatButton registerBT;
    @BindView(R.id.appCompatTextView)
    AppCompatTextView appCompatTextView;
    @BindView(R.id.loginFacebookBT)
    LoginButton loginFacebookBT;
    @BindView(R.id.twitterLoginBT)
    TwitterLoginButton twitterLoginBT;
    @BindView(R.id.googleLoginBT)
    SignInButton googleLoginBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.loginBT, R.id.forgotPsBT, R.id.registerBT, R.id.loginFacebookBT, R.id.twitterLoginBT, R.id.googleLoginBT})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.loginBT:
                // TODO: 2020-04-24 buraya login için api istek atılmalı
                Intent intentHome = new Intent(this, HomeActivity.class);
                startActivity(intentHome);
                break;
            case R.id.forgotPsBT:
                break;
            case R.id.registerBT:
                Intent intentRegister = new Intent(this, RegisterActivity.class);
                startActivity(intentRegister);
                break;
            case R.id.loginFacebookBT:
                break;
            case R.id.twitterLoginBT:
                break;
            case R.id.googleLoginBT:
                break;
        }
    }
}
