package info.diit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class L5DC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_l5dc);
	}

	public void DDD(View v) {

		Toast.makeText(getApplicationContext(),
				"Database Design and Development", Toast.LENGTH_SHORT).show();
		setContentView(R.layout.l5dc_slide);

	}

	public void ADI(View v) {
		Toast.makeText(getApplicationContext(),
				"Analysis, Design and Implementation", Toast.LENGTH_SHORT)
				.show();
		setContentView(R.layout.l5dc_slide);
	}

	public void NSC(View v) {
		Toast.makeText(getApplicationContext(),
				"Network, Security and Cryptography", Toast.LENGTH_SHORT)
				.show();
		setContentView(R.layout.l5dc_slide);

	}
	
	public void Logout(View v) {
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		startActivity(intent);

	}
}
