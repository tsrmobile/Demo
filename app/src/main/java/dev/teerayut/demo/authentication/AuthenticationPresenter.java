package dev.teerayut.demo.authentication;

import dev.teerayut.demo.base.BaseMvpPresenter;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class AuthenticationPresenter extends BaseMvpPresenter<AuthenticationInterface.view>
    implements AuthenticationInterface.presenter{

    public static AuthenticationInterface.presenter create() {
        return new AuthenticationPresenter();
    }
}
