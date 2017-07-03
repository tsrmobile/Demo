package dev.teerayut.demo.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.Bind;
import butterknife.ButterKnife;
import dev.teerayut.demo.R;
import dev.teerayut.demo.base.BaseMvpActivity;

public class SignUpActivity extends BaseMvpActivity<SignUpInterface.presenter>
    implements SignUpInterface.view{


    @Override
    public SignUpInterface.presenter createPresenter() {
        return SignUpPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_sign_up;
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
                setResult(RESULT_OK);
                finish();
                break;
            default: break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setToolbar() {
        toolbar.setTitle("");
        toolbar.setBackgroundColor(getResources().getColor(R.color.White));
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_colordark_36dp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
