package dev.teerayut.demo.landing;

import dev.teerayut.demo.base.BaseMvpInterface;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class LandingInterface {

    public interface view extends BaseMvpInterface.View {

    }

    public interface presenter extends BaseMvpInterface.Presenter<LandingInterface.view> {

    }
}
