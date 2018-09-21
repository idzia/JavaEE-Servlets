package com.codecool.java;

//import org.jtwig.JtwigModel;
//import org.jtwig.JtwigTemplate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.InputStream;


public class SecondServlet extends HttpServlet {

    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("resources/index.html");
        view.forward(request, response);
    }

    protected void doPost( HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("name");
        String passwordLength = request.getParameter("length");
        String color = request.getParameter("color");
        String number = request.getParameter("number");

        String answer = "generated password for you is: " + color + firstName + number + passwordLength ;


        response.getWriter().write(answer);

    }
}



//        JtwigTemplate template = JtwigTemplate.classpathTemplate("templates/index.twig");
//        JtwigModel model = JtwigModel.newModel();
//        String answer = template.render(model);



//String contentLength = request.getHeader("Content-Length");
//response.setHeader("Content-Type", "text/html");
//InputStream requestBodyInput = request.getInputStream();
//String contentLength = request.getHeader("firstname");


//    protected void doGet( HttpServletRequest request,
//                          HttpServletResponse response) throws ServletException, IOException {
//
//        String param = request.getParameter("param");
//
//        response.getWriter().write("<html><body>Welcome "+ param + " !!!!<button>click me</button></body></html>");
//    }
//    POST
//    String contentLength = request.getHeader("Content-Length");
//    System.out.println(contentLength);
//      InputStream requestBodyInput = request.getInputStream();


