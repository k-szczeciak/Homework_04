package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
    List<Airport> airports;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String airportDep = request.getParameter("airportDep");
        String airportAri = request.getParameter("airportAri");
        String timeDep = request.getParameter("timeDep");
        String timeAri = request.getParameter("timeAri");
        String timeFlight = request.getParameter("timeFlight");
        String price = request.getParameter("price");
        boolean isDataValid = true;

        // checking values
        if (airportDep.equals(airportAri)){
            response.getWriter().append("wybrano te same lotniska").append("<br>");
            isDataValid = false;
        }
        if ((timeAri.isEmpty() || timeAri.isBlank()) || (timeDep.isBlank() || timeDep.isEmpty())){
            response.getWriter().append("brak daty").append("<br>");
            isDataValid = false;
        }
        if (Integer.parseInt(timeFlight) == 0){
            response.getWriter().append("niewłaściwa wartość długości lotu").append("<br>");
            isDataValid = false;
        }

        //displaying recieved informations
        if (isDataValid == true){
            response.getWriter().append("airport departure: ").append(airportDep).append("<br>");
            response.getWriter().append("airport arrival:   ").append(airportAri).append("<br>");
            response.getWriter().append("departure time:    ").append(timeDep).append("<br>");
            response.getWriter().append("arrival time:      ").append(timeAri).append("<br>");
            response.getWriter().append("flight time:       ").append(timeFlight).append("<br>");
            response.getWriter().append("price:             ").append(price).append("<br>");
        }else{
            response.getWriter().append("<br>").append("Podane dane są niewłaściwe");
        }


        //calculating time
        LocalDateTime localDateTime = LocalDateTime.parse(timeDep);
        response.getWriter().append("<br><br>");
        response.getWriter().append(String.valueOf(localDateTime)).append("<br>");
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Chicago"));
        response.getWriter().append(String.valueOf(zonedDateTime)).append("<br>");

        //creating Flight classes


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        airports  = AirportDao.getList();
        request.setAttribute("airports", airports);
        getServletContext().getRequestDispatcher("/index5.jsp").forward(request, response);

    }
}
