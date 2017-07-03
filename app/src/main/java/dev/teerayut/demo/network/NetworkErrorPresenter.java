package dev.teerayut.demo.network;

import dev.teerayut.demo.base.BaseMvpPresenter;

/**
 * Created by teerayut.k on 7/3/2017.
 */

public class NetworkErrorPresenter extends BaseMvpPresenter<NetworkErrorInterface.view>
    implements NetworkErrorInterface.presenter {

    public static NetworkErrorInterface.presenter create() {
        return new NetworkErrorPresenter();
    }
}
