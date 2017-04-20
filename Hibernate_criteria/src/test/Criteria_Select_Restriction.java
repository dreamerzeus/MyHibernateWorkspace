package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import bean.Company;

public class Criteria_Select_Restriction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
	      cfg.configure();
	      SessionFactory sf=cfg.buildSessionFactory();
	      Session s=sf.openSession();
	      
	      //where ,>,<,=,like condition
	     Criteria c= s.createCriteria(Company.class);
	      Criterion cr=Restrictions.eq("Cid", 1);
	      c.add(cr);
	      Company cm=(Company)c.uniqueResult();
	      System.out.println(cm.getCname());
	}

}
