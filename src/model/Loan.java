package model;

import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.*;


/**
 * The persistent class for the loan database table.
 * 
 */
@Entity
@NamedQuery(name="Loan.findAll", query="SELECT l FROM Loan l")
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="interest_rate")
	private float interest_rate;

	private float loanamount;

	@Column(name="no_of_years")
	private int no_of_years;

	private String type;

	 public void Setup(float bal, float debt){
	    	
	    	/*if((type!="Simple")||(type!="Compound")||(type!="simple")||(type!="compound"))
	    		throw new RuntimeException("Wrong type of loan");*/
	    	if(debt>0){
	    		interest_rate=14;
	    	    no_of_years=1;}
	    	else if(loanamount>(1.5*bal))
	    		interest_rate=9;
	    	else if(loanamount<100000)
	    		interest_rate=4;
	    	else{
	    		interest_rate=6;
	    	}
	    	
	    			
	    	 }
	    
	  /*  public void Loaner(){
	    	System.out.println("Loan of Rs"+loanamount+" has been allocated to customer with name"+this.name+" and ID:"+this.id);
	    	opbal=opbal+loanamount;
	    	if((type=="Simple")||(type=="simple"))
	    	{
	    	  debt=(loanamount*interest_rate*no_of_years)/100;
	    	}
	    	else
	    		debt=(float) (loanamount*(Math.pow((1+(interest_rate/100)),(no_of_years)))-loanamount);
	    	
	    	
	    }*/
	    
	    public void setID(int id)
	    {
	    	this.id=id;
	    }
	    
	    public void settype(String type)
	    {
	    	this.setType(type);
	    }
	    
	    public void setyear(int years)
	    {
	    	this.no_of_years=years;
	    	
	    }

	    public void setamount(int am)
	    {
	    	this.loanamount=am;
	    	
	    }

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
}