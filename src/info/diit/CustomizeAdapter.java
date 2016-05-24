package info.diit;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomizeAdapter extends ArrayAdapter<Student> {

	Activity con;
	ArrayList<Student> studentList;

	public CustomizeAdapter(Context context, ArrayList<Student> students) {
		super(context, R.layout.list_item, students);
		this.con = (Activity) context;
		this.studentList = students;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View v = null;
		if (convertView == null) {

			LayoutInflater inflater = con.getLayoutInflater();
			v = inflater.inflate(R.layout.list_item, null);

			TextView txtName = (TextView) v.findViewById(R.id.txtName);
			TextView txtNCCID = (TextView) v.findViewById(R.id.txtNCCID);
			TextView txtNCCPass = (TextView) v.findViewById(R.id.txtNCCPass);

			Student s = studentList.get(position);
			txtName.setText("Student Name: " + s.getStudentName());
			txtNCCID.setText("NCC ID: "+s.getNccID());
			txtNCCPass.setText("NCC Password: "+s.getNccPassword());

		} else {
			v = convertView;
		}
		return v;
	}
}
