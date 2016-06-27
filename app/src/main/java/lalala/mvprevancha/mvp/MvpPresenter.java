package lalala.mvprevancha.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by lgarbarini on 27/6/16.
 */
public class MvpPresenter<T extends MvpView> {

    private WeakReference<T> viewRef;

    public void linkView(T view) {
        viewRef = new WeakReference<T>(view);
    }

    public void unlinkView(T view) {
        if (viewRef != null && viewRef.get() == view) {
            viewRef.clear();
        }
    }
}
