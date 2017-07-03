package dev.teerayut.demo.splashscreen;


import dev.teerayut.demo.base.BaseMvpInterface;

/**
 * Created by TheKhaeng on 9/20/2016.
 */

public class SplashScreenActivityInterface{


    public interface View extends BaseMvpInterface.View{
    }

    public interface Presenter extends  BaseMvpInterface.Presenter<SplashScreenActivityInterface.View>{
    }
}
