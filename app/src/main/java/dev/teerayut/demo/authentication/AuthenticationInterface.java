package dev.teerayut.demo.authentication;

import dev.teerayut.demo.base.BaseMvpInterface;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class AuthenticationInterface {

    public interface view extends BaseMvpInterface.View {

    }

    public interface presenter extends BaseMvpInterface.Presenter<AuthenticationInterface.view> {

    }
}
