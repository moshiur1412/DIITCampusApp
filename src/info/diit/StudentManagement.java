package info.diit;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class StudentManagement extends Activity {
	EditText etStudentName, etStudentNccID, etStudentPassword;

	DatabaseHelper dbHelper;

	ListView lvStudents;

	CustomizeAdapter adapter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_management);

		etStudentName = (EditText) findViewById(R.id.etStudentName);
		etStudentNccID = (EditText) findViewById(R.id.etStudentNccID);
		etStudentPassword = (EditText) findViewById(R.id.etStudentNccPassword);

		lvStudents = (ListView) findViewById(R.id.lvStudents);
		dbHelper = new DatabaseHelper(this);
	}

	// Save Button OnClick -->
	public void SaveStudent(View v) {

		String name = etStudentName.getText().toString();
		String nccid = etStudentNccID.getText().toString();
		String nccpass = etStudentPassword.getText().toString();

		if ((name.equals("")) || (nccid.equals("")) || (nccpass.equals(""))) {
			Toast.makeText(getApplicationContext(), "Required All Field!!",
					Toast.LENGTH_SHORT).show();

		} else {
			Student studentdata = new Student(name, nccid, nccpass);
			long insertData = dbHelper.insertStudent(studentdata);
			if (insertData >= 0) {
				Toast.makeText(getApplicationContext(), "Data Inserted",
						Toast.LENGTH_LONG).show();
			} else {
				Toast.makeText(getApplicationContext(), "Data not inserted",
						Toast.LENGTH_LONG).show();
			}
		}
	}

	// View Button OnClick -->
	public void ViewStudent(View v) {
		ArrayList<Student> students = dbHelper.getAllStudents();
		if (students != null && students.size() > 0) {

			adapter = new CustomizeAdapter(this, students);
			lvStudents.setAdapter(adapter);

		} else {
			Toast.makeText(getBaseContext(), "No Data Found!!",
					Toast.LENGTH_LONG).show();
		}

	}

	// Search Button OnClick -->
	public void Search(View v) {
		String name = etStudentName.getText().toString();
		String ncc_id = etStudentNccID.getText().toString();

		if ((name.equals("")) && (ncc_id.equals(""))) {
			Toast.makeText(getApplicationContext(),
					"Required Name/NCC ID Field!! ", Toast.LENGTH_SHORT).show();

		} else {

			ArrayList<Student> students = dbHelper.searchStudent(name, ncc_id);
			if (students != null && students.size() > 0) {
				for (Student student : students) {
					Toast.makeText(getApplicationContext(), student.toString(),
							Toast.LENGTH_LONG).show();
					etStudentName.setText(student.getStudentName());
					etStudentNccID.setText(student.getNccID());
					etStudentPassword.setText(student.getNccPassword());
				}

			} else if (students.size() == 0) {
				Toast.makeText(getBaseContext(), "No Data Found!!",
						Toast.LENGTH_LONG).show();
			}
		}

	}

	// Edit Button OnClick -->
	public void EditStudent(View v) {

		String ncc_id = etStudentNccID.getText().toString();
		String newName = etStudentName.getText().toString();
		String newPass = etStudentPassword.getText().toString();

		if ((newName.equals("")) && (ncc_id.equals(""))) {
			Toast.makeText(getApplicationContext(),
					"Required Name/NCC ID Field!! ", Toast.LENGTH_SHORT).show();

		} else {
			int updated = dbHelper.updateStudent(ncc_id, newName, newPass);
			if (updated > 0) {
				Toast.makeText(getApplicationContext(),
						"Data updatd successfully!!", Toast.LENGTH_SHORT)
						.show();
			} else {
				Toast.makeText(getApplicationContext(), "Sorry, Not updated!!",
						Toast.LENGTH_SHORT).show();
			}
		}
	}

	public void Delete(View v) {
		Toast.makeText(getApplicationContext(), "Delete Button!!",
				Toast.LENGTH_SHORT).show();

		String ncc_id = etStudentNccID.getText().toString();
		String newName = etStudentName.getText().toString();
		String newPass = etStudentPassword.getText().toString();

		if ((newName.equals("")) && (ncc_id.equals(""))) {
			Toast.makeText(getApplicationContext(),
					"Required Name/NCC ID Field!! ", Toast.LENGTH_SHORT).show();

		} else {
			int updated = dbHelper.deleteStudent(ncc_id, newName, newPass);
			if (updated > 0) {
				Toast.makeText(getApplicationContext(),
						"Data delete successfully!!", Toast.LENGTH_SHORT)
						.show();
				etStudentName.setText("");
				etStudentNccID.setText("");
				etStudentPassword.setText("");
			} else {
				Toast.makeText(getApplicationContext(), "Sorry, Not updated!!",
						Toast.LENGTH_SHORT).show();
			}
		}

	}

	public void Logout(View v) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
