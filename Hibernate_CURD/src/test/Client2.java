package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Worker;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Worker w=new Worker();
		w.setId(5);
		w.setName("sumit");
		w.setSal(100);
			
		s.saveOrUpdate(w);
		t.commit();
		s.close();
		sf.close();
		System.out.println("sucessful transtraction");
	}

}
