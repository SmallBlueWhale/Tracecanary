package cc.popin.aladdin.martrixsample;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testMatrix();
    }


    public void testMatrix(){
        SystemClock.sleep(5000);
    }
}
