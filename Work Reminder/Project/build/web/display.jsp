<%-- 
    Document   : display
    Created on : 20 Nov, 2022, 10:43:39 PM
    Author     : nisha
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Works</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="navbar.jsp" %>

        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dailyreminders", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from dailyreminders");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
             
        %>


        <br>
        <br>
        <br>
        <table class="table table-hover">
            
                <tr>
                    <th>No.</th>
                    <th>Work Name</th>
                    <th>Area of Work</th>
                    <th>Due Date</th>
                    <th>Actions</th>
                </tr>
                <tr>
                    <td><% out.println(rs.getInt(1)); %></td>
                    <td><% out.println(rs.getString(2)); %></td>
                    <td><% out.println(rs.getString(3)); %></td>
                    <td><% out.println(rs.getString(4)); %></td>
                    <% out.println("<td>"+ "<a href='Delete?id="+ rs.getInt(1)+ "'>Delete</a>" +"</td>"); %>
                </tr>
            
        </table>
        <%
            }
        %>


    </body>
</html>
