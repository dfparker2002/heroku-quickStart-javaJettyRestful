package com.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends HttpServlet {

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //ServletOutputStream out = resp.getOutputStream();
        
        //out.write("Hello Heroku! ".getBytes());
        //out.write("Deployed first change!".getBytes());
        //out.flush();
        //out.close();
        
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(req, resp);
    }
    
}
