package lalala.mvprevancha;

import android.os.Bundle;
import android.widget.TextView;

import lalala.mvprevancha.mvp.MvpActivity;
import lalala.mvprevancha.mvp.MvpPresenter;

public class MainActivity extends MvpActivity<MainView, MainPresenter> implements MainView {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textito);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected MainView getView() {
        return this;
    }

    @Override
    public void saySomething(String something) {
        textView.setText(something);
    }
}
