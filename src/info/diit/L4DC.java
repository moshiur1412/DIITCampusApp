package info.diit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class L4DC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_l4dc);
	}

	public void DDW(View v) {

		Toast.makeText(getApplicationContext(),
				"Designing and Developing a Website", Toast.LENGTH_SHORT)
				.show();
		setContentView(R.layout.l4dc_slide);
	}

	public void SDT(View v) {
		Toast.makeText(getApplicationContext(),
				"Software Development Techniques", Toast.LENGTH_SHORT).show();
		setContentView(R.layout.l4dc_slide);
	}

	public void OSD(View v) {
		Toast.makeText(getApplicationContext(), "Office Solutions Development",
				Toast.LENGTH_SHORT).show();
		setContentView(R.layout.l4dc_slide);

	}
	public void Logout(View v) {
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		startActivity(intent);

	}

}
