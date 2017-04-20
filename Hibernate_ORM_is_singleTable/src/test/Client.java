package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.CivilStudent;
import bean.ElectStudent;
import bean.MechStudent;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();

MechStudent ms=new MechStudent(1, "rahul", "bput", "thermodynamics");
ElectStudent es=new ElectStudent(50, "pratap", "kbrc", "networking");
CivilStudent cs=new CivilStudent(100, "singh", "ket", "bridge");

s.save(ms);
s.save(cs);
s.save(es);

t.commit();
s.close();
sf.close();
	}

}
