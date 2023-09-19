

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>Dashboard</title>
        <link rel="stylesheet" href="Style/Dashboard.css"   type="text/css"/>




    </head>
    <body>
        <div class="container" >
            <nav>
                <ul>
                    <li><a href="#" class="logo">
                            <img src="Images/logo.webp" alt="">
                            <span class="nav-item">Home</span>
                        </a></li>
                    <li><a href="Dashboard.html">
                            <i class="fas fa-home"></i>
                            <span class="nav-item">Dashboard</span>
                        </a></li>
                    

                    <li><a href="Registration.html" class="logout">
                            <i class="fas fa-sign-out-alt"></i>
                            <span class="nav-item">Logout</span>
                        </a></li>
                </ul>
            </nav>
            <div class="card">
                <i class="fas fa-laptop-code"></i>

                <section class="main">
                    <div class="main-top">
                        <h1></h1>

                        <i class="fas fa-user-cog"></i>
                    </div>
                    <div class="main-skills">

                        <div class="card">
                            <i class="fas fa-laptop-code"></i>

                            <h3>BMI Calculator</h3>
                            <p></p>
                            <form action="http://localhost:8080/CE21project/bmihtml.html" method="get">
                                        <button>Know More</button>
                                    </form>
                        </div>
                        <div class="card">
                            <i class="fab fa-wordpress"></i>
                            <h3>Calorific Calculator</h3>
                            <form action="http://localhost:8080/CE21project/caloriecalculator.html" method="get">
                                        <button>Know More</button>
                                    </form>

                        </div>
                    </div>
                    <section class="main-course">
                        <h1>BMI Range and It's Diet</h1>
                        <div class="course-box">

                            <div class="course">
                                <div class="box">
                                    <h3>UnderWeight</h3>
                                    <p>BMI:<18</p>
                                    <form action="http://localhost:8080/CE21project/underweight.jsp" method="get">
                                        <button>Know More</button>
                                    </form>

                                    <i class="fab fa-html5 html"></i>
                                </div>
                                <div class="box">
                                    <h3>  Healthy   </h3>
                                    <p>BMI:18.5-24.9</p>
                                    <form action="http://localhost:8080/CE21project/normal.jsp" method="get">
                                        <button>Know More</button>
                                    </form>
                                    <i class="fab fa-css3-alt css"></i>
                                </div>
                                <div class="box">
                                    <h3>OverWeight</h3>
                                    <p>BMI:25-29.5</p>
                                    <form action="http://localhost:8080/CE21project/overweight.jsp" method="get">
                                        <button>Know More</button>
                                    </form>
                                    <i class="fab fa-js-square js"></i>
                                </div>
                                <div class="box">
                                    <h3>  Obese  </h3>
                                    <p>BMI:<30</p>
                                    <form action="http://localhost:8080/CE21project/obese.jsp" method="get">
                                        <button>Know More</button>
                                    </form>
                                    <i class="fab fa-js-square js"></i>
                                </div>
                            </div>
                        </div>
                    </section>


                </section>

            </div>
    </body>
</html>

