<<<<<<< HEAD
package servlet;

import dao.BookDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.JSONObject;

@WebServlet("/chatbot-webhook")
public class ChatbotWebhookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }

        JSONObject jsonRequest = new JSONObject(requestBody.toString());
        String userQuery = jsonRequest.getJSONObject("queryResult").getString("queryText");

        String bookInfo = BookDAO.findBookByTitle(userQuery);

        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("fulfillmentText", bookInfo);

        response.setContentType("application/json");
        response.getWriter().write(jsonResponse.toString());
    }
}
=======
package servlet;

import dao.BookDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.JSONObject;

@WebServlet("/chatbot-webhook")
public class ChatbotWebhookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }

        JSONObject jsonRequest = new JSONObject(requestBody.toString());
        String userQuery = jsonRequest.getJSONObject("queryResult").getString("queryText");

        String bookInfo = BookDAO.findBookByTitle(userQuery);

        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("fulfillmentText", bookInfo);

        response.setContentType("application/json");
        response.getWriter().write(jsonResponse.toString());
    }
}
>>>>>>> c95924d (Moved Dockerfile to root directory)
