package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String airportDep = request.getParameter("airportDep");
        String airportAri = request.getParameter("airportAri");
        String timeDep = request.getParameter("timeDep");
        String timeAri = request.getParameter("timeAri");
        String timeFlight = request.getParameter("timeFlight");
        String price = request.getParameter("price");

        response.getWriter().append("airport departure: ").append(airportDep).append("<br>");
        response.getWriter().append("airport arrival:   ").append(airportAri).append("<br>");
        response.getWriter().append("departure time:    ").append(timeDep).append("<br>");
        response.getWriter().append("arrival time:      ").append(timeAri).append("<br>");
        response.getWriter().append("flight time:       ").append(timeFlight).append("<br>");
        response.getWriter().append("price:             ").append(price).append("<br>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        List<Airport> airports = AirportDao.getList();

        request.setAttribute("airports", airports);
        getServletContext().getRequestDispatcher("/index5.jsp").forward(request, response);

    }
}
