<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
<form method="post" action="Deposit">
<table>
<tr><td>Enter Customer id</td><td><input type="text"  name="customerid"></tr>
<tr><td>Enter Amount</td><td><input type="text" name="customeramount"></tr>
<tr><td><button type="submit">Submit Button</button></td>
</tr>
</table>
</form>
</body>
</html>