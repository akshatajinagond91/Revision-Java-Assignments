<%@page import="com.pojo.Missingrecord"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Missing Record</title>
</head>
<body>



	<%@ include file="userheader.jsp"%>

	<%
		BLManger bl = new BLManger();
		List<Missingrecord> l = bl.missingsearchlist();
		session.setAttribute("li", l);
	%>


	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i>Missing Report Record
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Missing Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Missing Things</th>
							<th>Missing Things Address</th>
							<th>Missing Things City</th>
							<th>Information for Missing Things</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Missing Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Missing Things</th>
							<th>Missing Things Address</th>
							<th>Missing Things City</th>
							<th>Information for Missing Things</th>
						</tr>
					</tfoot>
					<tbody>

						<c:forEach items="${sessionScope.li}" var="l">
							<tr>
								<td>${l.missingNo}</td>
								<td>${l.registration.fname} ${l.registration.lname}</td>
								<td>${l.registration.email}</td>
								<td>${l.registration.mobileno}</td>
								<td>${l.missingthing}</td>
								<td>${l.missingthingaddress}</td>
								<td>${l.missingthingcity}</td>
								<td>${l.information}</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<div class="card-footer small text-muted">Record</div>
	</div>


	<%@ include file="footer.jsp"%>

</body>
</html>