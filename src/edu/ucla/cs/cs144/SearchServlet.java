package edu.ucla.cs.cs144;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucla.cs.cs144.AuctionSearchClient;


public class SearchServlet extends HttpServlet implements Servlet {
       
    public SearchServlet() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
          String query = request.getParameter("q");
          request.setAttribute("q", query); 
          request.getRequestDispatcher("/keywordSearch.jsp").forward(request,response); 

          SearchResult[] basicResults = AuctionSearchClient.basicSearch(query, 0, 20);
    }
}
