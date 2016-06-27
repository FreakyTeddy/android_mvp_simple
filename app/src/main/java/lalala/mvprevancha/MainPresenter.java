package lalala.mvprevancha;

import lalala.mvprevancha.mvp.MvpPresenter;

/**
 * Created by lgarbarini on 27/6/16.
 */
public class MainPresenter extends MvpPresenter<MainView> {

    @Override
    public void linkView(MainView view) {
        super.linkView(view);
        view.saySomething("Hola soy Lu");
    }
}
