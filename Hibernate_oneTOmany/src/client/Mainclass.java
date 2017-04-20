package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movie;

public class Mainclass {

	public static void main(String[] args) {
		Configuration cfg=new  Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Actor a=new Actor();
		a.setAid(1);
		a.setName("rahul");
		
		Movie m=new Movie();
		m.setMid(1);
		m.setMoviename("don");
        m.setActor(a);
        
    	Movie m1=new Movie();
		m1.setMid(2);
		m1.setMoviename("don2");
        m1.setActor(a);
       
    	Movie m3=new Movie();
		m.setMid(3);
		m.setMoviename("don3");
        m.setActor(a);
        
        s.save(m);
        s.save(m1);
        s.save(m3);
        s.save(a);
        t.commit();
        System.out.println("insertion commited");
	}
}
