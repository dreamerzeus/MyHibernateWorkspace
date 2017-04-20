package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Student_PageNation;

public class GetDataServlet extends HttpServlet {
	SessionFactory sf;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure();
		sf=cf.buildSessionFactory();
		super.init(config);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		Session s=sf.openSession();
		int fr=Integer.parseInt(req.getParameter("fr"));
		int mr=Integer.parseInt(req.getParameter("mr"));
		
		Query q=s.createQuery(" from Student_pageNation ");
		q.setFirstResult(fr);
		q.setMaxResults(mr);
		List<Student_PageNation> list=q.list();
		for(Student_PageNation sp:list)
		{
			out.println("id is :"+sp.getId());
			out.println("the name is "+sp.getName());
			out.println("the gender is "+sp.getGender());
			out.println("the email is "+sp.getEmail());
		}
		
		s.close();
		super.doGet(req, resp);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		sf.close();
	}
}
