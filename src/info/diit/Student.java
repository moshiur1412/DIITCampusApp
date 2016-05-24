package info.diit;

public class Student {
	private int studentID;
	private String studentName;
	private String nccID;
	private String nccPassword;

	public Student(int studentID, String studentName, String nccID,
			String nccPassword) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.nccID = nccID;
		this.nccPassword = nccPassword;
	}
	
	public Student(String studentName, String nccID, String nccPassword) {
		this.studentName = studentName;
		this.nccID = nccID;
		this.nccPassword = nccPassword;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName="
				+ studentName + ", nccID=" + nccID + ", nccPassword="
				+ nccPassword + "]";
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getNccID() {
		return nccID;
	}

	public void setNccID(String nccID) {
		this.nccID = nccID;
	}

	public String getNccPassword() {
		return nccPassword;
	}

	public void setNccPassword(String nccPassword) {
		this.nccPassword = nccPassword;
	}



}
