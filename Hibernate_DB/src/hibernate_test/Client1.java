package hibernate_test;

import org.hibernate.cfg.Configuration;

public class Client1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.buildSessionFactory();

	}

}
