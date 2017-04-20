package client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_INSERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String query="insert into NewStudent(id,name,gender) select s.id,s.name,s.gender from OldStudent s";
		Query q=s.createQuery(query);
		int i=q.executeUpdate();
		System.out.println("no of row affected "+i);
		
		t.commit();
		s.close();
		sf.close();
	}

}
