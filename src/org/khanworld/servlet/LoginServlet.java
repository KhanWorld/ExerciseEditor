package org.khanworld.servlet;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.khanworld.DAO;
import org.khanworld.model.AppUser;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

/**
 * Login via OpenId
 */
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		UserService userService = UserServiceFactory.getUserService();
		Templater templater = new Templater();
		if(userService.isUserLoggedIn()){
			DAO dao = new DAO();
			AppUser appUser = dao.loginAppUser(userService.getCurrentUser());
			HttpSession session = req.getSession(true);
			session.setAttribute("AppUser", appUser);
			resp.sendRedirect("/");
		}
		else{
			templater.put("openidGoogle", userService.createLoginURL(req.getRequestURI(), null, "gmail.com", null));
			templater.render("login.html", req, resp);
		}
	}

}
