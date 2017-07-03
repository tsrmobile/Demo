package dev.teerayut.demo.network;

import dev.teerayut.demo.base.BaseMvpInterface;

/**
 * Created by teerayut.k on 7/3/2017.
 */

public class NetworkErrorInterface {

    public interface view extends BaseMvpInterface.View {

    }

    public interface presenter extends BaseMvpInterface.Presenter<NetworkErrorInterface.view> {

    }
}
