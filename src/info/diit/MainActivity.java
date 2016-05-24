package info.diit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void About(View v) {
		Intent intent = new Intent(this, AboutActivity.class);
		startActivity(intent);
	}

	public void Program(View v) {
		Intent intent = new Intent(this, ProgramActivity.class);
		startActivity(intent);

	}

	public void Admission(View v) {
		Intent intent = new Intent(this, AdmissionActivity.class);
		startActivity(intent);
	}

	public void ClassSchedule(View v) {
		Intent intent = new Intent(this, ClassScheduleActivity.class);
		startActivity(intent);
	}

	public void Student(View v) {
		Intent intent = new Intent(MainActivity.this, StudentLogin.class);
		startActivity(intent);
	}

	public void Admin(View v) {
		Intent intent = new Intent(MainActivity.this, AdminActivity.class);
		startActivity(intent);
	}

	// Footer Menu-->
	public void Contact(View v) {
		Toast.makeText(
				getApplicationContext(),
				"Contact US: \n Mobile: +8801711 000 000 \n Phone: +02 000 000 \n Address: Panthopath, Dhaka.",
				Toast.LENGTH_LONG).show();
	}

	public void Event(View v) {
		Toast.makeText(
				getApplicationContext(),
				"Event Title: Android Application\n Date: 01/01/2016\n Venue: DIIT Auditorium",
				Toast.LENGTH_LONG).show();
	}

	public void Location(View v) {
		Intent intent = new Intent(this, LocationActivity.class);
		startActivity(intent);

	}

	public void Website(View v) {
		Toast.makeText(getApplicationContext(), "www.diit.info",
				Toast.LENGTH_LONG).show();
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.google.com"));
		startActivity(intent);
	}
}
