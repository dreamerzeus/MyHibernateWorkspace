package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Admin;
import pojo.Developer;
import pojo.HardwareDeveloper;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Developer d=new Developer(1, 100000, "rahul", "rpsingh@gmail.com");
		HardwareDeveloper hd=new HardwareDeveloper(11, 20000, "pratap", "pratap@gmail.com");
		Admin ad=new Admin(101, 90000, "singh", "singh@gmail.com");
		s.save(ad);
		s.save(hd);
		s.save(d);
		t.commit();
		s.close();
		sf.close();
	}
}
