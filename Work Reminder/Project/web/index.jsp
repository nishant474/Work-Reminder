<%-- 
    Document   : index
    Created on : 20 Nov, 2022, 8:26:58 PM
    Author     : nisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="css/mystyle.css">
    </head>
    <body>

        <%@include file="navbar.jsp" %>     

        <div id="demo" class="carousel slide" data-ride="carousel">

            <!-- Indicators -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/1.jpg" alt="Los Angeles" width="1100" height="500">
                </div>
                <div class="carousel-item">
                    <img src="img/2.jpg" alt="Chicago" width="1100" height="500">
                </div>
                <div class="carousel-item">
                    <img src="img/3.png" alt="New York" width="1100" height="500">
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>

        <br>
        <br>
        <br>
    <center>
        <div id="div1" style="background-color: orange">
            <h1>Add Your Reminders</h1>
            <br>
            <br>
            <form  name="form1" method="POST" action="insert">

                <div class="form-group">
                    <label>Work Name :- </label>
                    <input type="text"  name="workname" placeholder="WORK NAME" required="">
                </div>
                <div>
                    <label>Area of Work</label>
                    <select name="areaofwork" required="">
                        <option selected="" disabled="">Select</option>
                        <option value="College Work">College Work</option>
                        <option value="Self Work">Self Work</option>
                        <option value="Company Work">Company Work</option>
                        <option value="Side Work">Side Work</option>
                    </select>
                </div>
                <div class="form-group"><br>
                    <label>Due Date</label>
                    <input type="date" name="workdate"required="">
                </div>

                <button type="submit" id="submit" value="submit" class="btn btn-primary">Save</button><br>
                <br>
                <br>
                <br>
            </form>
        </div>
        
        
        

        <div class="footer">
            <p>Thankyou For Visiting Daily Reminders Site  @ Nishant Trivedi</p>
        </div>

    </center>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    
    
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
    <script src="css/home.js"></script>
</body>
</html>
