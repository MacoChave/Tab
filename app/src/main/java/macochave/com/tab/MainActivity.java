package macochave.com.tab;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("mitab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("", resources.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabHost.addTab(spec1);

        TabHost.TabSpec spec2 = tabHost.newTabSpec("mitab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("", resources.getDrawable(android.R.drawable.ic_dialog_info));
        tabHost.addTab(spec2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("mitab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("TAB3", resources.getDrawable(android.R.drawable.ic_media_play));
        tabHost.addTab(spec3);
        tabHost.setCurrentTab(0);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.i("AndroidTabDemo", "Pestaña pulsada " + tabId);
            }
        });
    }
}
