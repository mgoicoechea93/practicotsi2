package org.jboss.samples.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import entities.User;
import controllers.UserController;

@WebService()
public class UserControllerWS {

	@WebMethod()
	public List<User> getUsers() {
	    UserController uc = UserController.getInstance();
	    return uc.getUsers();
	}
}
