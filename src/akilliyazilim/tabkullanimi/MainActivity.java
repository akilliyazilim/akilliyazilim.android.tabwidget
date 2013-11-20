package akilliyazilim.tabkullanimi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabHost tabs = (TabHost) findViewById(R.id.tabhost);

		tabs.setup();
		TabHost.TabSpec spec;

		spec = tabs.newTabSpec("tag1");
		spec.setContent(R.id.Akilli);
		spec.setIndicator("Ak�ll�");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag1");
		spec.setContent(R.id.Yazilim);
		spec.setIndicator("Yaz�l�m");
		tabs.addTab(spec);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
