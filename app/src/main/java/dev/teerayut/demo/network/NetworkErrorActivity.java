package dev.teerayut.demo.network;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpInterface;
import dev.teerayut.demo.utils.Config;

public class NetworkErrorActivity extends AppCompatActivity {

    @Bind(R.id.btn_error) Button networkError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_error);
        ButterKnife.bind(this);
        networkError.setOnClickListener( onSettings() );
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Config.REQUEST_NETWORK_SETTINGS) {
            setResult(RESULT_OK);
            finish();
        }
    }

    public View.OnClickListener onSettings() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setClassName("com.android.settings", "com.android.settings.wifi.WifiSettings");
                startActivityForResult(intent, Config.REQUEST_NETWORK_SETTINGS);
            }
        };
    }
}
