package dev.teerayut.demo.forgetpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpActivity;

public class ForgetPasswordActivity extends BaseMvpActivity<ForgetPasswordInterface.presenter>
    implements ForgetPasswordInterface.view{

    @Override
    public ForgetPasswordInterface.presenter createPresenter() {
        return ForgetPasswordPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_forget_password;
    }

    @Bind(R.id.toolbar) Toolbar toolbar;
    @Override
    public void bindView() {
        ButterKnife.bind(this);
    }

    @Override
    public void setupInstance() {

    }

    @Override
    public void setupView() {
        setToolbar();
    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home :
                setResult(RESULT_CANCELED);
                finish();
                break;
            default: break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setToolbar() {
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
