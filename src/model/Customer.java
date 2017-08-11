package model;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.*;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	protected float debt;

	protected String dob;

	protected String name;

	protected float opbal;

	public void withdraw(int x){
		   if(opbal==0)
			   System.out.println("No balance left");
		   else if(x>opbal)
			   System.out.println("Balance insufficient");
		   else
			   opbal=opbal-x;
		   System.out.println("You have withdrawn"+" "+x+"/-");
	   }

	public void deposit(int a){
		   opbal=opbal+a;
		   System.out.println("You have deposited"+" "+a+"/-");
	   }
	
	 public void input(String a, String b)
	   {
		   //System.out.println("Customer name");
		   //Scanner ob=new Scanner(System.in);
		   //name=ob.next();
		    name=a;
		   //System.out.println("Custome id");//Make this random
		   Random r=new Random();
		   id=r.nextInt(20000);
		   //(System.out.println("Enter dob");
		   //dob=ob.next();
		   dob=b;
		   
		   opbal=0;
		   debt=0;
	   }
	 
	 public void output(){
			System.out.println("Customer name: "+name);
			 System.out.println("Custome id: "+id);
			 System.out.println("Dob: "+dob);
			 System.out.println("Balance: "+opbal);
			 System.out.println("Debts: "+debt);
			 
			}

		public int returnid(){
			return id;
		}
		
		public float returnbal() {
			return opbal;
		}
		
		public float returndebt() {
			return debt;
		}

}