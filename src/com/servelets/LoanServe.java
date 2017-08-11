package com.servelets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.Loan;

/**
 * Servlet implementation class Loan
 */
@WebServlet("/LoanServe")
public class LoanServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int id=Integer.parseInt(request.getParameter("lcustomerid"));
		int amount=Integer.parseInt(request.getParameter("lcustomeramount"));
		int years=Integer.parseInt(request.getParameter("lcustomeryears"));
		String type=request.getParameter("lcustomertype");
		
	    Loan ob1=new Loan();
	    ob1.setID(id);
	    ob1.settype(type);
	    ob1.setyear(years);
        ob1.setamount(amount);
        
EntityManagerFactory emfactory2 = Persistence.createEntityManagerFactory("AmsJPA");
    	
    	EntityManager entitymanager2 = emfactory2.createEntityManager();
    	
    	entitymanager2.getTransaction().begin();
    	Query q2=entitymanager2.createQuery("Update Customer set debt="+amount+" where id="+id+"");
    	int a=q2.executeUpdate();
    	Customer obj=entitymanager2.find(Customer.class, id);
    	float bal=obj.returnbal();
    	float debt=obj.returndebt();
    	ob1.Setup(bal, debt);
    	entitymanager2.persist(ob1);
    	 
    	 entitymanager2.getTransaction().commit();
    	 
    	 entitymanager2.close();
    	 emfactory2.close();
    	 
    	 
    	 
    	 response.sendRedirect("DisplayUsers.jsp");

	    
	    
	}

}
