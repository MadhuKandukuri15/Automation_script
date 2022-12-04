package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestName")
public class OCTJAXBDemo {
	private String studentname, studentaddress;
	private int studentID, studentphone;
	@XmlElement
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@XmlElement
	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	@XmlElement
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@XmlElement
	public int getStudentphone() {
		return studentphone;
	}

	public void setStudentphone(int studentphone) {
		this.studentphone = studentphone;
	}

	public OCTJAXBDemo(String studentname, String studentaddress, int studentID, int studentphone) {
		super();
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.studentID = studentID;
		this.studentphone = studentphone;
	}

	public OCTJAXBDemo() {
		super();
	}

}