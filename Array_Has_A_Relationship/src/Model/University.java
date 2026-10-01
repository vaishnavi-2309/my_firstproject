package Model;

public class University {
	
	private int uid;
	private String uname;
	private String uaddress;
	
	
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	
	public void setUaddress(String uaddress)
	{
		this.uaddress = uaddress;
	}
	
	
	public int getUid() 
	{
		return uid;
	}
	
	public String getUname() 
	{
		return uname;
	}
	
	public String getUaddress() 
	{
		return uaddress;
	}
	

}
