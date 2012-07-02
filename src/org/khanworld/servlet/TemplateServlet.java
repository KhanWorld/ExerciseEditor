package org.khanworld.servlet;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles requests to all "static" templates.
 */
@SuppressWarnings("serial")
public class TemplateServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		Templater templater = new Templater();
		templater.render("homepage.html", req, resp);
	}

}
