package com.codecool.java;

//import org.jtwig.JtwigModel;
//import org.jtwig.JtwigTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.InputStream;


public class SecondServlet extends HttpServlet {

    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String answer = getHTML();

        response.getWriter().write(answer);
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

    private String getHTML() {
        String contentHtml = "<!DOCTYPE html>\n" +
                "<html lang='en'>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <title>Servlet World</title>\n" +
                "    <link rel='stylesheet' href='../resources/style.css'>\n" +
                "    <link href='https://fonts.googleapis.com/css?family=Nunito' rel='stylesheet'>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "\n" +
                "    </header>\n" +
                "\n" +
                "    <div class='content'>\n" +
                "        <div class='intro'>\n" +
                "            <h2>WELCOME TO THE PASSWORD GENERATOR</h2>\n" +
                "        </div>\n" +
                "\n" +
                "        <div>\n" +
                "            <form id='generator' action='' method='post'>\n" +
                "\n" +
                "                <label for='name'>Enter your name:</label>\n" +
                "                <input type='text' name='name' id='name'  placeholder='Your name'>\n" +
                "\n" +
                "\n" +
                "                <label for='length'>Select the length of your password: </label>\n" +
                "                <select id='length' class='input_text' name='length'>\n" +
                "                    <option value='5'>5*</option>\n" +
                "                    <option value='10'>10*</option>\n" +
                "                    <option value='15'>15*</option>\n" +
                "                    <option value='20'>20*</option>\n" +
                "                </select>\n" +
                "\n" +
                "                <label for='color'>Favourite color</label>\n" +
                "                <input type='text' name='color' id='color' placeholder='Favourite color'>\n" +
                "\n" +
                "                <label for='number'>Favourite number</label>\n" +
                "                <input type='text' id='number' name='number' placeholder='Favourite number'>\n" +
                "\n" +
                "\n" +
                "                <button type='submit' id='send'>Generate</button>\n" +
                "\n" +
                "\n" +
                "            </form>\n" +
                "        </div>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        return contentHtml;
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


