package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import bean.Company;

public class Agrregated_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
	      cfg.configure();
	      SessionFactory sf=cfg.buildSessionFactory();
	      Session s=sf.openSession();
	      
	      Criteria c=s.createCriteria(Company.class);
	      Projection p=Projections.max("cemp");
	      c.setProjection(p);
	      int emp=(int)c.uniqueResult();
	      System.out.println("the max emp are "+emp);
	}

}
