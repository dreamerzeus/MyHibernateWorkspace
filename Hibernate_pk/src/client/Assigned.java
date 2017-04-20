package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Movie;

public class Assigned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();

Movie m=new Movie();

m.setMname("jhoda akbar");
m.setMticket(111);
m.setSeatNos(3);

s.save(m);

t.commit();
s.close();
sf.close();
System.out.println("sucessful insertion");

	}
}