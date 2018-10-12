package com.codecool.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "add", urlPatterns = {"/add"}, loadOnStartup = 1)
public class Add extends HttpServlet {

    public void init(){
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        WebShopServlet.setCounter();
        response.sendRedirect("/webshop");
        PrintWriter out = response.getWriter();
        String title = "Added one item";
        out.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body>\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "</body></html>"
        );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {


    }

}
