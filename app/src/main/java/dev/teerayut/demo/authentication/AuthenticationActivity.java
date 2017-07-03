package dev.teerayut.demo.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpActivity;
import dev.teerayut.demo.forgetpassword.ForgetPasswordActivity;
import dev.teerayut.demo.utils.Config;

public class AuthenticationActivity extends BaseMvpActivity<AuthenticationInterface.presenter>
    implements AuthenticationInterface.view{

    @Override
    public AuthenticationInterface.presenter createPresenter() {
        return AuthenticationPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_authentication;
    }

    @Bind(R.id.userName) EditText username;
    @Bind(R.id.userPwd) EditText password;
    @Bind(R.id.forgetPassword) TextView forget;
    @Bind(R.id.button_sign_in) Button signIn;
    @Bind(R.id.toolbar) Toolbar toolbar;
    @Override
    public void bindView() {
        ButterKnife.bind(this);
        setToolbar();
    }

    @Override
    public void setupInstance() {

    }

    @Override
    public void setupView() {
        signIn.setOnClickListener(onSignIn());
        forget.setOnClickListener(onForgetPassword());
    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home :
                setResult(RESULT_OK);
                finish();
                break;
            default: break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setToolbar() {
        toolbar.setTitle("");
        toolbar.setBackgroundColor(getResources().getColor(R.color.White));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_colordark_36dp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public View.OnClickListener onSignIn() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    public View.OnClickListener onForgetPassword() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), ForgetPasswordActivity.class), Config.REQUEST_FORGET);
            }
        };
    }
}
