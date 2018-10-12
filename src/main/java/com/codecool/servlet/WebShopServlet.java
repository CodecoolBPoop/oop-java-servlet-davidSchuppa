package com.codecool.servlet;

/*
This should list at least 3-5 different available Items with different properties
(eg. [0, "Asus Laptop", 1600.0], [1, "Harry Potter Ebook", 50.0], etc.).

Generate these Items in the init() method , for example. Render every Item's name and price on the screen,
with an Add and a Remove button OR link (if it's easier for you). When these buttons are pressed, the content of

ItemStore's static list should be modified with the belonging item.

You shouldn't give any feedback on the screen
from the modifications (yet)!
 */


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "webshop", urlPatterns = {"/webshop"}, loadOnStartup = 1)
public class WebShopServlet extends HttpServlet {

    private ArrayList<Item> products = new ArrayList<>();
    public static int counter = 0;


    @Override
    public void init(){
        products.add(new Item("Lenovo", 350));
        products.add(new Item("Harry Potter novel", 20.4));
        products.add(new Item("Csattogós lepke", 0.15));
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        String title = "Fantastic Webshop For Your Service";
        StringBuffer buffer = new StringBuffer();
        for (Item product : products) {
            buffer.append("<tr>");
            buffer.append("<td>" + product.getId() + "</td>");
            buffer.append("<td>" + product.getName() + "</td>");
            buffer.append("<td>" + product.getPrice() + " USD</td>");
            buffer.append("<td><form action=\"add\" method=\"get\" <button type=\"submit\" action=\"/add\"><a href=\"add\" style=\"text-decoration: none\">Add</a></button></td></form>");
            buffer.append("<td><button><a href=\"remove\" style=\"text-decoration: none\">Remove</a></button></td>");
            buffer.append("</tr>\n");
        }

        out.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body>\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<h1 align = \"center\">" + counter + "</h1>\n" +
                        (buffer.toString().equals("") ? "No item to show" :
                        "<table border=\"1\">\n" +
                        "<tr>" + "<th>Id</th>" + "<th>Product Name</th>" + "<th>Price</th>" + "<th></th>" + "<th></th>" + "</tr>" +
                        buffer) +
                        "</table>\n" +
                        "<div>Visit another servlet: <a href=\"/\">Back to servlet example</a></div>" +
                        "<div>Go to cart: <a href=\"/cart\">Go to cart</a></div>" +
                        "</body></html>"
        );
    }

    public static void setCounter() {
        WebShopServlet.counter++;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {


    }
}
