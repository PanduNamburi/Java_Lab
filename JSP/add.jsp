<html>
<head>
	<title>Addition</title>
</head>
<body>
	<h2>addition result</h2>
<% 
	String n=request.getParameter("num1");
	String m=request.getParameter("num2");
	int a=Integer.parseInt(n);
	int b=Integer.parseInt(m);
	int sum=a+b;
	int difference =a-b;
	%>
<p> The sum of <b> <%=a%> and <%=b%> is : <%=sum%> </p>
<p> The difference of <%=a%> and <%=b%> is : <%=difference%> </p>