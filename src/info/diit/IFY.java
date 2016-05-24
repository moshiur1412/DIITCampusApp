package info.diit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IFY extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ify);
	}

	public void AELS(View v) {
		setContentView(R.layout.ify_slide);

	}

	public void IP(View v) {
		setContentView(R.layout.ify_slide);

	}

	public void FM(View v) {
		setContentView(R.layout.ify_slide);

	}

	public void Logout(View v) {
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		startActivity(intent);

	}
}
