package dev.teerayut.demo.network;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpActivity;
import dev.teerayut.demo.utils.Config;

public class NetworkErrorActivity extends BaseMvpActivity<NetworkErrorInterface.presenter> implements NetworkErrorInterface.view {
    @Override
    public NetworkErrorInterface.presenter createPresenter() {
        return NetworkErrorPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_network_error;
    }

    @Bind(R.id.btn_error) Button networkError;
    @Override
    public void bindView() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        networkError.setOnClickListener( onSettings() );
    }

    @Override
    public void setupInstance() {

    }

    @Override
    public void setupView() {

    }

    @Override
    public void initialize() {

    }

    public static NetworkErrorActivity getInstance() {
        return new NetworkErrorActivity();
    }

    public void detectWifiConnected(final String state) {
        this.runOnUiThread(new Runnable() {
            public void run() {
                if (state.equals("connect")){
                    setResult(RESULT_OK);
                    finish();
                }
            }
        });
    }

    public View.OnClickListener onSettings() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.provider.Settings.ACTION_SETTINGS);
                //intent.setClassName("com.android.settings", "com.android.settings.wifi.WifiSettings");
                startActivityForResult(intent, Config.REQUEST_NETWORK_SETTINGS);
            }
        };
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Config.REQUEST_NETWORK_SETTINGS) {
            if (resultCode == RESULT_OK) {
                setResult(RESULT_OK);
                finish();
            }
        }
    }
}
