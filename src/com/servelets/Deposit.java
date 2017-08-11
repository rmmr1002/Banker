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

/**
 * Servlet implementation class Deposit
 */
@WebServlet("/Deposit")
public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deposit() {
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
		int id=Integer.parseInt(request.getParameter("customerid"));
		int amount=Integer.parseInt(request.getParameter("customeramount"));
		EntityManagerFactory emfactory2 = Persistence.createEntityManagerFactory("AmsJPA");
    	
    	EntityManager entitymanager2 = emfactory2.createEntityManager();
    	
    	entitymanager2.getTransaction().begin();
    	//Query q2=entitymanager2.createQuery("select * from Customer a where a.id='"+id+"'");
    	Customer obj=entitymanager2.find(Customer.class, 3050);
    	float bal=obj.returnbal();
    	Query q=entitymanager2.createQuery("Update Customer set opbal="+bal+"+"+amount+" where id="+id+"");
    	 int x=q.executeUpdate();
    	 System.out.println(x);
    	 
    	 entitymanager2.getTransaction().commit();
    	 
    	 entitymanager2.close();
    	 emfactory2.close();
    	 
    	 response.sendRedirect("DisplayUsers.jsp");
    	
		
		
	}

}
