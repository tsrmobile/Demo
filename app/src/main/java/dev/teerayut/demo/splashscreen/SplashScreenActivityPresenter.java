package dev.teerayut.demo.splashscreen;


import dev.teerayut.demo.base.BaseMvpPresenter;

public class SplashScreenActivityPresenter extends BaseMvpPresenter<SplashScreenActivityInterface.View>
        implements SplashScreenActivityInterface.Presenter{

    public static SplashScreenActivityInterface.Presenter create(){
        return new SplashScreenActivityPresenter();
    }
}
