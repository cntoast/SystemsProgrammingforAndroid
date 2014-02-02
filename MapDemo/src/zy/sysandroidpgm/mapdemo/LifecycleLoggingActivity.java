package zy.sysandroidpgm.mapdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleLoggingActivity extends Activity {
	private final static String TAG ="D/MapDemo(3323)";
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG,"onCreate()");
		super.onCreate(savedInstanceState);
	}

	protected void onRestart() {
		Log.d(TAG,"onRestart()");
		super.onRestart();
	}

	protected void onStart() { 
		Log.d(TAG,"onStart()");
		super.onStart();
	}

	protected void onResume() { /* you fill in here. */
		Log.d(TAG,"onResume()");
		super.onResume();
	}

	protected void onPause() { /* you fill in here. */
		Log.d(TAG,"onPause()");
		super.onPause();
	}

	protected void onStop() { /* you fill in here. */
		Log.d(TAG,"onStop()");
		super.onStop();
	}

	public void onDestroy() { /* you fill in here. */
		Log.d(TAG,"onDestroy()");
		super.onDestroy();
	}
}
