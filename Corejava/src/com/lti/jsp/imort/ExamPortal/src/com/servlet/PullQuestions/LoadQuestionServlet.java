
package com.servlet.PullQuestions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.questions.Question;
import com.lti.questions.QuestionBankLoader;

/**
 * Servlet implementation class LoadQuestionServlet
 */
@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 //  private int questionNo;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QuestionBankLoader loader=new QuestionBankLoader();
		List<Question> questions=loader.loadQuestionsOnJava();
		
	HttpSession session =request.getSession();
	
		//checking if the question is already in the session
	Integer questionNo=(Integer) session.getAttribute("qNo");
		 if(questionNo == null)
			 	questionNo=0;
		 else if(++questionNo == questions.size()) {
			 response.sendRedirect("displayScore.jsp");
			 	return;
		 }
			 
		 
		session.setAttribute("qNo",questionNo);
		Question question=questions.get(questionNo);
		session.setAttribute("currentQs",question);
		
		response.sendRedirect("showQuestion.jsp");
	}

}
