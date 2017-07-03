package dev.teerayut.demo.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpActivity;
import dev.teerayut.demo.landing.LandingActivity;

public class SplashScreenActivity extends BaseMvpActivity<SplashScreenActivityInterface.Presenter>
        implements SplashScreenActivityInterface.View {

    private static final long SPLASH_DELAY = 1000;

    @Override
    public SplashScreenActivityInterface.Presenter createPresenter() {
        return SplashScreenActivityPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_splashscreen;
    }

    @Override
    public void bindView() {

    }

    @Override
    public void setupInstance() {
        goToMainActivity();
    }

    @Override
    public void setupView() {

    }

    @Override
    public void initialize() {

    }

    private void delaySplashScreen( Runnable runnable ){
        final Handler handler = new Handler();
        handler.postDelayed( runnable, SPLASH_DELAY );
    }

    private void goToMainActivity(){
        delaySplashScreen( new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent( SplashScreenActivity.this, LandingActivity.class);
                startActivity( intent );
                finish();
                overridePendingTransition( R.anim.fadein, R.anim.fadeout );
            }
        } );
    }
}
