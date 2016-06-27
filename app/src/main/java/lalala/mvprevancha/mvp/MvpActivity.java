package lalala.mvprevancha.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lgarbarini on 27/6/16.
 */
public abstract class MvpActivity<V extends MvpView, T extends MvpPresenter<V>> extends AppCompatActivity {

    private T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // noinspection unchecked
        presenter = (T) getLastCustomNonConfigurationInstance();

        if (presenter == null) {
            presenter = createPresenter();
        }
    }

    protected abstract T createPresenter();

    protected abstract V getView();

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return presenter;
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.linkView(getView());
    }

    @Override
    protected void onPause() {
        presenter.unlinkView(getView());
        super.onPause();
    }
}
