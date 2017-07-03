package dev.teerayut.demo.signup;

import dev.teerayut.demo.base.BaseMvpInterface;
import dev.teerayut.demo.base.BaseMvpPresenter;

/**
 * Created by teerayut.k on 6/29/2017.
 */

public class SignUpPresenter extends BaseMvpPresenter<SignUpInterface.view> implements SignUpInterface.presenter {

    public static SignUpInterface.presenter create(){
        return new SignUpPresenter();
    }
}
