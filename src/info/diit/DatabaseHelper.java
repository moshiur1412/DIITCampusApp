package info.diit;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String DB_NAME = "diitdb";
	public static final int DB_VERSION = 1;

	public static final String STUDENT_TABLE = "student";

	public static final String ID_FIElD = "_id";
	public static final String NAME_FIELD = "name";
	public static final String NCC_ID = "nccid";
	public static final String NCC_PASS = "nccpass";

	public static final String STUDENT_TABLE_SQL = "CREATE TABLE "
			+ STUDENT_TABLE + " (" + ID_FIElD + " INTEGER PRIMARY KEY, "
			+ NAME_FIELD + " TEXT, " + NCC_ID + " TEXT, " + NCC_PASS + " TEXT)";

	public DatabaseHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		db.execSQL(STUDENT_TABLE_SQL);
		Log.e("TABLE CREATE", STUDENT_TABLE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

	public long insertStudent(Student stu) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();

		values.put(NAME_FIELD, stu.getStudentName());
		values.put(NCC_ID, stu.getNccID());
		values.put(NCC_PASS, stu.getNccPassword());

		Log.e(STUDENT_TABLE, NAME_FIELD);
		long inserted = db.insert(STUDENT_TABLE, null, values);

		db.close();
		return inserted;
	}

	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> allStudent = new ArrayList<Student>();
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(STUDENT_TABLE, null, null, null, null, null,
				null);
		if (cursor != null && cursor.getCount() > 0) {
			cursor.moveToFirst();
			for (int i = 0; i < cursor.getCount(); i++) {
				int id = cursor.getInt(cursor.getColumnIndex(ID_FIElD));
				String name = cursor.getString(cursor
						.getColumnIndex(NAME_FIELD));
				String nccid = cursor.getString(cursor.getColumnIndex(NCC_ID));
				String nccpass = cursor.getString(cursor
						.getColumnIndex(NCC_PASS));

				Student s = new Student(id, name, nccid, nccpass);

				allStudent.add(s);
				cursor.moveToNext();

			}
		}
		cursor.close();
		db.close();
		return allStudent;
	}

	public ArrayList<Student> searchStudent(String keyword, String nccid) {
		ArrayList<Student> student = new ArrayList<Student>();
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db
				.query(STUDENT_TABLE, null, "name LIKE '%" + keyword
						+ "%' and nccid LIKE '%" + nccid + "%'", null, null,
						null, null);

		if (cursor != null && cursor.getCount() > 0) {
			cursor.moveToFirst();
			for (int i = 0; i < cursor.getCount(); i++) {
				int id = cursor.getInt(cursor.getColumnIndex(ID_FIElD));
				String name = cursor.getString(cursor
						.getColumnIndex(NAME_FIELD));
				String ncc_id = cursor.getString(cursor.getColumnIndex(NCC_ID));
				String nccpass = cursor.getString(cursor
						.getColumnIndex(NCC_PASS));

				Student s = new Student(id, name, ncc_id, nccpass);
				student.add(s);
				cursor.moveToNext();
			}
		}
		cursor.close();
		db.close();
		return student;
	}

	public int updateStudent(String ncc_id, String newName, String nccPass) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(NAME_FIELD, newName);
		values.put(NCC_PASS, nccPass);
		int updated = db.update(STUDENT_TABLE, values, NCC_ID + "=?",
				new String[] { "" + ncc_id });

		db.close();
		return updated;
	}
	public int deleteStudent(String ncc_id, String newName, String nccPass) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(NAME_FIELD, newName);
		values.put(NCC_PASS, nccPass);
		int deleted = db.delete(STUDENT_TABLE, NCC_ID + "=?",
				new String[] { "" + ncc_id });

		db.close();
		return deleted;
	}

	public ArrayList<Student> studentAuthentication(String nccid, String nccpass) {
		ArrayList<Student> student = new ArrayList<Student>();
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(STUDENT_TABLE, null,
				"nccid =? AND nccpass =?", new String[] { nccid, nccpass },
				null, null, null);

		if (cursor != null && cursor.getCount() > 0) {
			cursor.moveToFirst();
			for (int i = 0; i < cursor.getCount(); i++) {
				int id = cursor.getInt(cursor.getColumnIndex(ID_FIElD));
				String name = cursor.getString(cursor
						.getColumnIndex(NAME_FIELD));
				String ncc_id = cursor.getString(cursor.getColumnIndex(NCC_ID));
				String ncc_pass = cursor.getString(cursor
						.getColumnIndex(NCC_PASS));

				Student s = new Student(id, name, ncc_id, ncc_pass);
				student.add(s);
				cursor.moveToNext();
			}
		}
		cursor.close();
		db.close();
		return student;
	}
}
