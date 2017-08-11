<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<body bgcolor="lavender">
<div class="topnav" id="myTopnav">
  <a href="index.html">Home</a>
  <a href="CreateCustomer.html">New Customer</a>
  <a href="DisplayUsers.jsp">View</a>
  <a href="Deposit.jsp">Deposit</a>
  <a href="Withdraw.jsp">Withdraw</a>
  <a href="Loan.jsp">Loan</a>
  
</div>
<style>

/* Add a black background color to the top navigation */
.topnav {
    background-color: #333;
    overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
    float: left;
    display: block;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
    background-color: #ddd;
    color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
    background-color: #4CAF50;
    color: white;
}
</style>

<h1> Customer table</h1>

<form method="post">

<h1> Loan table</h1>

<table border="2">
   <tr>
        <td>user ID</td>
        <td>Name</td>
        <td>DOB</td>
        <td>Balance</td>
        <td>Debt</td>
   </tr>
   <%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/a";
       String username="root";
       String password="Apple123";
       String query="select * from customer";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
   %>
       <tr><td><%out.println(rs.getInt("id")); %></td>
       <td><%out.println(rs.getString("name")); %></td>
       <td><%out.println(rs.getString("dob")); %></td>
       <td><%out.println(rs.getInt("opbal")); %></td>
       <td><%out.println(rs.getInt("debt")); %></td></tr>
     
       <!--  <tr><td><%=rs.getInt("id") %></td></tr>
       <tr><td><%=rs.getString("name") %></td></tr>
       <tr><td><%=rs.getString("dob") %></td></tr>
       <tr><td><%=rs.getInt("opbal") %></td></tr>
       <tr><td><%=rs.getInt("debt") %></td></tr>-->

   <%
       }
   %>
   </table>
   <%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
</form>`

<h1>Loan Table</h1>

<form method="post">

<table border="2">
   <tr>
        <td>user ID</td>
        <td>Name</td>
        <td>DOB</td>
        <td>Balance</td>
        <td>Debt</td>
        <td>Loan amount</td>
        <td>Interest Rate</td>
        <td>Type</td>
        <td>Time</td>
   </tr>
   <%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/a";
       String username="root";
       String password="Apple123";
       String query="select customer.id,name,dob,opbal,debt,loanamount,interest_rate,type,no_of_years from customer,loan where customer.id=loan.id;";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
   %>
       <tr><td><%out.println(rs.getInt("id")); %></td>
       <td><%out.println(rs.getString("name")); %></td>
       <td><%out.println(rs.getString("dob")); %></td>
       <td><%out.println(rs.getInt("opbal")); %></td>
       <td><%out.println(rs.getInt("debt")); %></td>
       <td><%out.println(rs.getFloat("loanamount")); %></td>
       <td><%out.println(rs.getFloat("interest_rate")); %></td>
       <td><%out.println(rs.getString("type")); %></td>
       <td><%out.println(rs.getFloat("no_of_years")); %></td></tr>
     
       <!--  <tr><td><%=rs.getInt("id") %></td></tr>
       <tr><td><%=rs.getString("name") %></td></tr>
       <tr><td><%=rs.getString("dob") %></td></tr>
       <tr><td><%=rs.getInt("opbal") %></td></tr>
       <tr><td><%=rs.getInt("debt") %></td></tr>-->

   <%
       }
   %>
   </table>
   <%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
</form>`