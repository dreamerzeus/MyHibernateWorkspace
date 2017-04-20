package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Worker;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Worker w=new Worker();
		w.setId(1);
		w.setName("sudhir");
		w.setSal(100);
			
		int i=(Integer)s.save(w);
		System.out.println("the id is "+i);
		t.commit();
		s.close();
		sf.close();
		System.out.println("sucessful transtraction");
	}
}