package dev.teerayut.demo.forgetpassword;

import dev.teerayut.demo.base.BaseMvpPresenter;

/**
 * Created by teerayut.k on 6/30/2017.
 */

public class ForgetPasswordPresenter extends BaseMvpPresenter<ForgetPasswordInterface.view>
    implements ForgetPasswordInterface.presenter {

    public static ForgetPasswordInterface.presenter create() {
        return new ForgetPasswordPresenter();
    }
}
