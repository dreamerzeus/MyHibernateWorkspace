package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import bean.Company;

public class Select_Projection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
	      cfg.configure();
	      SessionFactory sf=cfg.buildSessionFactory();
	      Session s=sf.openSession();
	      
	      Criteria c=s.createCriteria(Company.class);
	      Projection p=Projections.property("cname");
	      c.setProjection(p);
	      List< String > l=c.list();
	      for(String c1:l)
	      {
	    	  System.out.println("name "+c1);
	      }
	}

}
