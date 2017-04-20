package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Worker;

public class Client_load {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Object o=s.load(Worker.class, 1);
		Worker w=(Worker)o;
		System.out.println(w.getId());
		System.out.println(w.getName());
		System.out.println(w.getSal());
		s.close();
		sf.close();
	}
}
