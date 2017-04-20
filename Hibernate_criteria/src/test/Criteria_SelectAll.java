package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Company;

public class Criteria_SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();
	      cfg.configure();
	      SessionFactory sf=cfg.buildSessionFactory();
	      Session s=sf.openSession();
	      
	      Criteria c=s.createCriteria(Company.class);
	      List<Company> l=c.list();
	      for(Company c1:l)
	      {
	    	  System.out.println(c1.getCemail());
	    	  System.out.println(c1.getCemp());
	    	  System.out.println(c1.getCid());
	    	  System.out.println(c1.getCname());
	      }
	}

}
