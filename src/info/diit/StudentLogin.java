package info.diit;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StudentLogin extends Activity {
	EditText etNCCID, etNCCPassword;
	DatabaseHelper dbHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_login);
		etNCCID = (EditText) findViewById(R.id.etNCCID);
		etNCCPassword = (EditText) findViewById(R.id.etNCCPassword);
		dbHelper = new DatabaseHelper(this);
	}

	public void BtnStudentLogin(View v) {
		String nccid = etNCCID.getText().toString();
		String ncc_pass = etNCCPassword.getText().toString();
		ArrayList<Student> result = dbHelper.studentAuthentication(nccid,
				ncc_pass);

		if (result.size() > 0) {
			for (Student student : result) {

				if ((Integer.parseInt(student.getNccID()) >= 3000)
						&& (Integer.parseInt(student.getNccID()) < 4000)) {

					Toast.makeText(getApplicationContext(),
							"You are IFY Student", Toast.LENGTH_SHORT).show();

					Intent intent = new Intent(getApplicationContext(),
							IFY.class);
					startActivity(intent);

				} else if ((Integer.parseInt(student.getNccID()) >= 4000)
						&& (Integer.parseInt(student.getNccID()) < 5000)) {
					Toast.makeText(getApplicationContext(),
							"You are L4DC Student", Toast.LENGTH_SHORT).show();

					Intent intent = new Intent(getApplicationContext(),
							L4DC.class);
					startActivity(intent);

				} else if ((Integer.parseInt(student.getNccID()) >= 5000)
						&& (Integer.parseInt(student.getNccID()) < 6000)) {
					Toast.makeText(getApplicationContext(),
							"You are L5DC Student", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(getApplicationContext(),
							L5DC.class);
					startActivity(intent);

				} else {
					Toast.makeText(getApplicationContext(),
							"Sorry, No data found!!", Toast.LENGTH_SHORT)
							.show();
				}

			}

		} else if (result.size() == 0) {
			Toast.makeText(getApplicationContext(),
					"Sorry, You are not NCC Student!!!", Toast.LENGTH_SHORT)
					.show();
		}

	}
}