package Habibi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student")
public class CreateTable {
	@Id
	int student_id;
	@Column(nullable=false,unique=false)
	String student_name;
	@Column(nullable=false,unique=true)
	String Student_eid;
	
	public int getStudent_id() {
		return student_id;
	}
		
	public void setStudent_id(int student_id)
	{
		this.student_id=student_id;
	}

	public String getStudent_name()
	{
		return student_name;
	}
	public void setStudent_name(String student_name) 
	{
		this.student_name=student_name;
	}
	
	public String getStudent_eid()
	{
		return Student_eid;
	}
	
	public void setStudent_eid(String student_eid) 
	{
		Student_eid=student_eid;
	}
	
}








