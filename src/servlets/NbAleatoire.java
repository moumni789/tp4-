package servlets;

import java.io.IOException;

import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.protocol.RequestDispatcherRegistryImpl;

import beans.NombreAleatoire;

/**
 * Servlet implementation class NbAleatoire
 */
@WebServlet("/NbAleatoire")
public class NbAleatoire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NbAleatoire() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NombreAleatoire r = new NombreAleatoire();
		request.setAttribute("randomNum", r.Frandom(Double.parseDouble(request.getParameter("nbal"))));
		
		
	  RequestDispatcher dsip = request.getRequestDispatcher("NombreAleatoire.jsp");
	  dsip.forward(request, response);
	  
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
