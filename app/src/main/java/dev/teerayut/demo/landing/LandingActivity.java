package dev.teerayut.demo.landing;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.authentication.AuthenticationActivity;
import dev.teerayut.demo.base.BaseMvpActivity;
import dev.teerayut.demo.network.ConnectionDetector;
import dev.teerayut.demo.network.NetworkErrorActivity;
import dev.teerayut.demo.signup.SignUpActivity;
import dev.teerayut.demo.utils.Config;

public class LandingActivity extends BaseMvpActivity<LandingInterface.presenter>
        implements LandingInterface.view{

    @Override
    public LandingInterface.presenter createPresenter() {
        return LandingPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_landing;
    }

    @Bind(R.id.button_sign_in) Button sign_in;
    @Bind(R.id.button_sign_up) Button sign_up;
    @Override
    public void bindView() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        sign_in.setOnClickListener(onSignIn());
        sign_up.setOnClickListener(onSignUp());
    }

    @Override
    public void setupInstance() {
        onNetworkError();
    }

    @Override
    public void setupView() {

    }

    @Override
    public void initialize() {

    }

    public View.OnClickListener onSignIn() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), AuthenticationActivity.class), Config.REQUEST_SIGNIN);
            }
        };
    }

    public View.OnClickListener onSignUp() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(), SignUpActivity.class), Config.REQUEST_SIGNUP);
            }
        };
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case Config.REQUEST_SIGNIN :
                    break;
                case Config.REQUEST_SIGNUP :
                    break;
                case Config.REQUEST_NETWORK_SETTINGS :
                    break;
                default:break;
            }
        }
    }

    private void onNetworkError() {
        if (!ConnectionDetector.isConnectingToInternet(this)) {
            startActivityForResult(new Intent(getApplicationContext(), NetworkErrorActivity.class), Config.REQUEST_NETWORK_SETTINGS);
        }
    }
}
