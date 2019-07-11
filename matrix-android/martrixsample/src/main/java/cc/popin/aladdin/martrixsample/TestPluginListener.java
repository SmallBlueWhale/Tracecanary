package cc.popin.aladdin.martrixsample;

import android.content.Context;

import cc.tencent.matrix.plugin.DefaultPluginListener;
import cc.tencent.matrix.report.Issue;
import cc.tencent.matrix.util.MatrixLog;

public class TestPluginListener extends DefaultPluginListener {
    public static final String TAG = "Matrix.TestPluginListener";
    public TestPluginListener(Context context) {
        super(context);
        
    }

    @Override
    public void onReportIssue(Issue issue) {
        super.onReportIssue(issue);
        MatrixLog.e(TAG, issue.toString());
        
        //add your code to process data
    }
}