package dev.teerayut.demo.signup;

import dev.teerayut.demo.base.BaseMvpInterface;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class SignUpInterface {

    public interface view extends BaseMvpInterface.View{

    }

    public interface presenter extends BaseMvpInterface.Presenter<SignUpInterface.view> {

    }
}
