package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Worker;

public class Client_Update_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.get(Worker.class, 5);
		
		Worker w=new Worker();
		w.setId(5);
		w.setName("SUMIT");
		w.setSal(100);
		
		s.merge(w);
		t.commit();
		s.close();
		sf.close();
		System.out.println("sucessful update");
	}

}
