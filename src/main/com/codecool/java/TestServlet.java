package com.codecool.java;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        JtwigTemplate template = JtwigTemplate.classpathTemplate("index.twig");
        JtwigModel model = JtwigModel.newModel();
        String answer = template.render(model);

        response.getWriter().write(answer);
    }

    protected void doPost( HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("name");
        String passLength = request.getParameter("len");
        String color = request.getParameter("color");
        String number = request.getParameter("number");

        String string = number + firstName + "&" + color;

        String pass = generatePassword(string, passLength);
        //String pass = "&6Aniared*";

        JtwigTemplate template = JtwigTemplate.classpathTemplate("index.twig");
        JtwigModel model = JtwigModel.newModel();
        model.with("password", pass);


        String answer = template.render(model);
        response.getWriter().write(answer);

    }

    private String generatePassword(String string, String passLength) {

        int len = Integer.valueOf(passLength);
        StringBuilder pass = new StringBuilder();

        while (pass.length()<len) {
            pass.append("&" + string + "*");
        }
        return pass.substring(0,len);
    }
}