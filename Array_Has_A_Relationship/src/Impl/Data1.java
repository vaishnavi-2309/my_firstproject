package Impl;

import Model.College;
import Model.State;
import Model.Student;
import Model.University;

public class Data1 {
	public void setData()
	{
		Student s=new Student();
		s.setId(1);
		s.setName("Anuj");
		s.setMarks(98.6f);
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Abc");
		s1.setMarks(76.7f);
		
		Student s2=new Student();
		s2.setId(3);
		s2.setName("Anil");
		s2.setMarks(56.98f);
		
//	Student[] stu= {s,s1,s2};
		
		College c=new College();
		c.setCid(1);
		c.setCname("Axt");
		c.setCaddress("pune");
		
		College c1=new College();
		c1.setCid(2);
		c1.setCname("Asd");
		c1.setCaddress("Nanded");
		
		College c2=new College();
		c2.setCid(3);
		c2.setCname("ERT");
		c2.setCaddress("KOLKATA");
		
	//	College[] clg= {c,c1,c2};
		
		University u=new University();
		u.setUid(1);
		u.setUname("PQW");
		u.setUaddress("ERT");
		
		University u1=new University();
		u1.setUid(2);
		u1.setUname("RTY");
		u1.setUaddress("GHY");
		
		University u2=new University();
		u2.setUid(3);
		u2.setUname("HFD");
		u2.setUaddress("MKH");
		
	//	University[] uni= {u,u1,u2};
		
		State st=new State();
		st.setSid(101);
		st.setSname("frtg");
		st.setStudent(s);
		st.setCollege(c);
		st.setUniversity(u);
		
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getStudent().getId());
		System.out.println(st.getStudent().getName());
		System.out.println(st.getStudent().getMarks());
		System.out.println(st.getCollege().getCid());
		System.out.println(st.getCollege().getCname());
		System.out.println(st.getUniversity().getUid());
		System.out.println(st.getUniversity().getUname());
		
		
		
		
		State st1=new State();
		st1.setSid(102);
		st1.setSname("CVBG");
		st1.setStudent(s1);
		st1.setCollege(c1);
		st1.setUniversity(u1);
		
		System.out.println(st1.getSid());
		System.out.println(st1.getSname());
		System.out.println(st1.getStudent().getId());
		System.out.println(st1.getStudent().getName());
		System.out.println(st1.getStudent().getMarks());
		System.out.println(st1.getCollege().getCid());
		System.out.println(st1.getCollege().getCname());
		System.out.println(st1.getUniversity().getUid());
		System.out.println(st1.getUniversity().getUname());
		
		
		State st2=new State();
		st2.setSid(103);
		st2.setSname("JYGIHK");
		st2.setStudent(s2);
		st2.setCollege(c2);
		st2.setUniversity(u2);		
		
		System.out.println(st2.getSid());
		System.out.println(st2.getSname());
		System.out.println(st2.getStudent().getId());
		System.out.println(st2.getStudent().getName());
		System.out.println(st2.getStudent().getMarks());
		System.out.println(st2.getCollege().getCid());
		System.out.println(st2.getCollege().getCname());
		System.out.println(st2.getUniversity().getUid());
		System.out.println(st2.getUniversity().getUname());
		
		
		
	}
	

	public void getData()
	{
		setData();
			
		
	}
}
