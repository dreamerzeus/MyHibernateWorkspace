package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.OldStudent;

public class Test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		OldStudent os=new OldStudent(1, "rahul", "male");
		OldStudent os1=new OldStudent(2, "pratap", "male");
		OldStudent os2=new OldStudent(3, "singh", "male");
		
		s.save(os);
		s.save(os1);
		s.save(os2);
		t.commit();
		s.close();
		sf.close();
	}
}
