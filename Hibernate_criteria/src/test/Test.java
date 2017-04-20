package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Company;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Configuration cfg=new Configuration();
      cfg.configure();
      SessionFactory sf=cfg.buildSessionFactory();
      Session s=sf.openSession();
      Transaction t=s.beginTransaction();
      
      Company c=new Company(1, "nokia", 2000, "nokia@gmail.com");
      Company c1=new Company(2, "samsung", 1000, "samsung@gmail.com");
      Company c2=new Company(3, "motorola", 3000, "motorlla@gmail.com");
      Company c3=new Company(4, "iphone", 5000, "iphone@gmail.com");
      
      s.save(c);
      s.save(c1);
      s.save(c2);
      s.save(c3);
      
      t.commit();
      s.close();
      sf.close();
      System.out.println("insertion done");
	}

}
