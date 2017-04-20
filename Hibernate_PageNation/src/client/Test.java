package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Student_pageNation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=s.beginTransaction();
Student_pageNation s1=new Student_pageNation(1, "rahul", "rahul@gmail.com", "male");
Student_pageNation s2=new Student_pageNation(2, "pratap", "pratap@gmail.com", "male");
Student_pageNation s3=new Student_pageNation(3, "singh", "singh@gmail.com", "male");
Student_pageNation s4=new Student_pageNation(4, "jay", "jay@gmail.com", "male");
Student_pageNation s5=new Student_pageNation(5, "hema", "hema@gmail.com", "female");
Student_pageNation s6=new Student_pageNation(6, "jaya", "jaya@gmail.com", "female");
Student_pageNation s7=new Student_pageNation(7, "sushma", "sushma@gmail.com", "female");
Student_pageNation s8=new Student_pageNation(8, "shoheb", "shoheb@gmail.com", "male");
Student_pageNation s9=new Student_pageNation(9, "malika", "malika@gmail.com", "female");
Student_pageNation s10=new Student_pageNation(10, "aishwariya", "aishwariya@gmail.com", "female");
Student_pageNation s11=new Student_pageNation(11, "jay", "jay@gmail.com", "male");
Student_pageNation s12=new Student_pageNation(12, "harshit", "harshit@gmail.com", "male");
Student_pageNation s13=new Student_pageNation(13, "arpit", "arpit@gmail.com", "male");
Student_pageNation s14=new Student_pageNation(14, "gogo", "gogo@gmail.com", "male");
Student_pageNation s15=new Student_pageNation(15, "popo", "popo@gmail.com", "male");

s.save(s1);
s.save(s2);
s.save(s3);
s.save(s4);
s.save(s5);
s.save(s6);
s.save(s7);
s.save(s8);
s.save(s9);
s.save(s10);
s.save(s11);
s.save(s12);
s.save(s13);
s.save(s14);
s.save(s15);
t.commit();
s.close();
sf.close();
	}

}
