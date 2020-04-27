package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Client;

/**
 * Servlet implementation class InfoClient
 */
@WebServlet("/InfoClient")
public class InfoClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				Client c = new Client();
				c.setNom(request.getParameter("nom"));
				c.setPrenom(request.getParameter("prenom"));
				c.setAdresse(request.getParameter("adress"));
				c.setNum(Integer.parseInt(request.getParameter("num")));
				c.setAdressem(request.getParameter("mail"));
				
				HttpSession HS = request.getSession(true);
				HS.setAttribute("client", c);
				/*RequestDispatcher r = request.getRequestDispatcher("AfficheClient.jsp");
				r.forward(request, response); */
				this.getServletContext().getRequestDispatcher("/InfoClient.jsp").forward(request,response);
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
