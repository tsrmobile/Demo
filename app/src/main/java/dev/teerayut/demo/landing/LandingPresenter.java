package dev.teerayut.demo.landing;

import dev.teerayut.demo.base.BaseMvpPresenter;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class LandingPresenter extends BaseMvpPresenter<LandingInterface.view>
        implements LandingInterface.presenter {

    public static LandingInterface.presenter create() {
        return new LandingPresenter();
    }
}
