package session;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.samples.webservices.UserControllerWS;

import controllers.UserController;
import entities.User;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public Inicio() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	
	protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	
    	System.out.println("entro al servlet Inicio");
//    	System.out.println(request.getSession().getAttribute("username"));
    	
//    	List<String> usuarios = new ArrayList<String>();
//    	usuarios.add("usuario 1");
//    	usuarios.add("usuario 2");
    	
    	
    	
//    	UserControllerWS service = new org.jboss.samples.webservices.UserControllerWS();
//        UserControllerWS port = service.UserControllerWSPort();
        
//        int id = port.asignarID();
//        request.getSession().setAttribute("id",id);
            
    	
    	
//    	List<String> usuarios = new ArrayList<String>();
//    	
//    	request.getSession().setAttribute("usuarios",usuarios);
//    	
    	
    	UserController uc = UserController.getInstance();
	    List<User> users = uc.getUsers();
    	System.out.println(users);
	    
    	request.getSession().setAttribute("usuarios",users);
    	
    	request.getRequestDispatcher("/Componentes/Inicio.jsp").forward(request, response);

    } 
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
