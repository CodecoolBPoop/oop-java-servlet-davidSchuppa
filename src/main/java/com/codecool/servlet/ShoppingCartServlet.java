package com.codecool.servlet;


/*
This should list the content of ItemStore's static list.
It should render a HTML list or a table with the items in it.
It should render a Sum of Price field as well.
 */

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cart", urlPatterns = {"/cart"}, loadOnStartup = 1)
public class ShoppingCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        String title = "Shopping Cart";

        StringBuffer buffer = new StringBuffer();


        out.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body>\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<ul>\n" +
                        "<li><b>Item: </b>: " + "\n" +
                        "<li><b>Item2: </b>: " + "\n" +
                        "</ul>\n" +
                        "<div>Visit another servlet: <a href=\"/\">Back to servlet example</a></div>" +
                        "<div>Back to webshop: <a href=\"/cart\">Back to webshop</a></div>" +
                        "</body></html>"
        );
    }

}
