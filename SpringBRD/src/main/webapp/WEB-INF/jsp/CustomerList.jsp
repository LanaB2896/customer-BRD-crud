
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import = "java.text.SimpleDateFormat" %>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html>
<html>
<head>
 <%
  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
  String date = dateFormat.format(new Date());
%>




<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="customerDetails"  action="add"  method="post">
Customer Code<br><br>
<form:input path="customerCode"/>
<form:errors path="customerCode" cssClass="error" /><br><br>

Customer Name<br><br>
<form:input path="customerName"/>
<form:errors path="customerName" cssClass="error" /><br><br>

Customer Address<br><br>
<form:input path="customerAddress"/><br><br>
<form:errors path="customerAddress" cssClass="error" /><br><br>

Customer Pincode<br><br>
<form:input path="customerPincode"/><br><br>
<form:errors path="customerPincode" cssClass="error" /><br><br>

Customer Email<br><br>
<form:input path="customerEmail"/><br><br>
<form:errors path="customerEmail" cssClass="error" /><br><br>

Customer Number<br><br>
<form:input path="customerNumber"/><br><br>

<!-- Registration Date<br><br> -->

<form:input path="registrationDate" type="hidden" value="<%=date%>" />

<form:errors path="registrationDate" cssClass="error" /><br><br>


Created By<br><br>
<form:input path="createdBy"/><br><br>
<form:errors path="createdBy" cssClass="error" /><br><br>

Modefied Date<br><br>
<form:input path="modifiedDate"/><br><br>
<form:errors path="modifiedDate" cssClass="error" /><br><br>

<input type = submit class="btn btn-info" value="Add Customer"/>
</form:form>
</body>
</html>

