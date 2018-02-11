package controller;

import model.MathOperation;
import model.Operation;
import model.service.CalculationLog;
import model.service.CalculationLogService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vladimir on 06.02.2018.
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {

    @Inject
    MathOperation mathOperation;

    @Inject
    CalculationLogService service;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Double val1 = Double.parseDouble(request.getParameter("val1"));
            Double val2 = Double.parseDouble(request.getParameter("val2"));
            Operation operator = Operation.valueOf(request.getParameter("operator").toUpperCase());
            Double result = mathOperation.calculate(val1, val2, operator);
            service.insertCalculationLog(new CalculationLog(val1, val2, operator.getMathValue(), result));
            request.setAttribute("result", result);
            request.setAttribute("val1", val1);
            request.setAttribute("val2", val2);
            request.setAttribute("operator", operator.getMathValue());
            response.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("/view/result.jsp").include(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Введите цифровое значение");
            doGet(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("/view/calculator.jsp").include(request, response);
    }
}
