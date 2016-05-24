package info.diit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminActivity extends Activity {
	EditText etAdminID, etAdminPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin);
		etAdminID = (EditText) findViewById(R.id.etAdminID);
		etAdminPassword = (EditText) findViewById(R.id.etAdminPassword);
	}

	public void AdminLogin(View v) {

		if ((etAdminID.getText().toString().equals(""))
				|| (etAdminPassword.getText().toString().equals(""))) {
			Toast.makeText(getApplicationContext(), "Required both field",
					Toast.LENGTH_SHORT).show();
		} else if ((etAdminID.getText().toString().equals("admin"))
				&& (etAdminPassword.getText().toString().equals("123456"))) {
			Toast.makeText(getApplicationContext(), "Thank you for your login",
					Toast.LENGTH_SHORT).show();

			Intent intent = new Intent(this, StudentManagement.class);
			startActivity(intent);
		} else {
			Toast.makeText(getApplicationContext(), "Sorry, you are not admin",
					Toast.LENGTH_LONG).show();
		}
	}
}
