package controller;

import model.service.CalculationLog;
import model.service.CalculationLogService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by vladimir on 09.02.2018.
 */
@WebServlet(name = "HistoryServlet", urlPatterns = "/history")
public class HistoryServlet extends HttpServlet {

    @Inject
    CalculationLogService service;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        List<CalculationLog> logList = service.getCalculationLog();
        request.setAttribute("list", logList);
        request.getRequestDispatcher("/view/history.jsp").include(request, response);
    }
}
