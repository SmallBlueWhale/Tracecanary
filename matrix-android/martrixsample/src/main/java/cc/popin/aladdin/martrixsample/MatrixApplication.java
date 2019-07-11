package cc.popin.aladdin.martrixsample;

import android.app.Application;

import cc.tencent.matrix.Matrix;
import com.tencent.matrix.trace.TracePlugin;
import com.tencent.matrix.trace.config.TraceConfig;

public class MatrixApplication extends Application {


    public static MatrixApplication instance;


    public static MatrixApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Matrix.Builder builder = new Matrix.Builder(this); // build matrix
        builder.patchListener(new TestPluginListener(this)); // add general pluginListener
        // init plugin
        TracePlugin tracePlugin = new TracePlugin(
                new TraceConfig.Builder()
                        .enableAnrTrace(true)
                        .enableEvilMethodTrace(true)
                        .enableFPS(true)
                        .build());
        //add to matrix
        builder.plugin(tracePlugin);
        //init matrix
        Matrix.init(builder.build());
        // start plugin
        tracePlugin.start();
    }
}
