# Banker

#Requirement Page

Purpose:
The purpose of this web application is to provide a system to manage and store the details of typical customers of a bank. It is intended 
to be used by the administrators of the mentioned bank. 

Project Components:
HTML pages and JSP where user can create new customer records or access existing ones by submitting data through a form.
Servelets that process the data submitted through these forms.
A JPA Application that manages the classes and entities and persists them to the SQL database.

Development Components:
Eclipse IDE: Used for majority of development of application. 
Java Persistence API used to persist data to database. 
j2EE also used to handle servelets and Java Server Pages. 
MySQL database to store customer data.
Apache Tomcat Web Server to manage JSP.

Features:
    Each customer is assigned a random customer ID number.
    Users can deposit money into a customer's account.
    Users can withdraw money from a customer's account.
    Users can set up loans for specific customers.
    Users can view the complete status of any customer 

Example use cases:
An admin of a bank needs to create an account for a customer. He selects the option to do so from the homepage and is redirected to a 
register webpage, where he enters customer details. He is then redirected back to the homepage, from where he can then deposit money to the
customer from the deposit page.
 
An admin can set up a loan for a customer by selecting the relevant link from homepage and then enter details needed. 
Based on preset conditions, the debt, amount and rate of interest are calculated and added to the user's account.
