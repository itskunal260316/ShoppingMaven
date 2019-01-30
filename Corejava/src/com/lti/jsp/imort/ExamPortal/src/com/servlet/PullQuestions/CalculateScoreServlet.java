package com.servlet.PullQuestions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.questions.Option;
import com.lti.questions.Question;

/**
 * Servlet implementation class CalculateScoreServlet
 */
@WebServlet("/CalculateScoreServlet")
public class CalculateScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		Question q=(Question)session.getAttribute("currentQs");
		
		int selectionOptionNo=Integer.parseInt(request.getParameter("op"));
		Integer score=(Integer) session.getAttribute("score");
		if(score==null)
			score=0;
		
		Option selectedOption=q.getOption().get(selectionOptionNo);
		if(selectedOption.isRightAnswer())
			score++;
		
		session.setAttribute("score", score);
		response.sendRedirect("LoadQuestionServlet");
	}

}
