package bazu.bwei.www.one_quarter_our.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @作者 任百慧
 * @时间 2018/1/9 15:56
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
