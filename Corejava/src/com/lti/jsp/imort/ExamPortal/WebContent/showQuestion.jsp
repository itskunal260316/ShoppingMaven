<%@page import="com.lti.questions.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.lti.questions.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "CalculateScoreServlet" method="post">
<%

	Question q= (Question) session.getAttribute("currentQs");
	Integer i=(Integer)session.getAttribute("qNo");
	
%>
<h3>Q No.<%= i + 1 %> <%= q.getQuestion() %></h3>

<% 
int j=1;
	List<Option> options=q.getOption();
	for(Option op : options)		{
		
		
%>

<%=j++ %><input type="radio" name="op" value=<%=j %>>
<%= op.getOption() %><br/>
<%
	}
%>



</form>
</body>
</html>