package Model;

public class State {
	
	private int sid;
	private String sname;
	private Student student;
	private College college;
	private University university;
	
	
	public void setSid(int sid)
	   {
			this.sid = sid;
		}
	
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	
	public void setStudent(Student stu) 
	{
		this.student = stu;
	}
	
	public void setCollege(College college) 
	{
		this.college = college;
	}
	
	public void setUniversity(University university) 
	{
		this.university = university;
	}
	
	public int getSid() 
	{
		return sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public Student getStudent() 
	{
		return student;
	}
	
	public College getCollege() 
	{
		return college;
	}
	
	public University getUniversity() 
	{
		return university;
	}
	
	

}
