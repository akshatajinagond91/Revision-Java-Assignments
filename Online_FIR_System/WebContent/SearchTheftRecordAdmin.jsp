<%@page import="com.pojo.Theftrecord"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Theft Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<%
		BLManger bl = new BLManger();
		List<Theftrecord> l = bl.theftsearchlistforpolice();
		session.setAttribute("li", l);
	%>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i>Theft Report Record
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Theft Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Theft Things</th>
							<th>Theft Things Address</th>
							<th>Theft Thing City</th>
							<th>Information for Theft Things</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Theft Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Theft Things</th>
							<th>Theft Things Address</th>
							<th>Theft Thing City</th>
							<th>Information for Theft Things</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</tfoot>
					<tbody>

						<c:forEach items="${sessionScope.li}" var="l">
							<tr>
								<td>${l.theftNo}</td>
								<td>${l.registration.fname} ${l.registration.lname}</td>
								<td>${l.registration.email}</td>
								<td>${l.registration.mobileno}</td>
								<td>${l.theftthing}</td>
								<td>${l.theftthingaddress}</td>
								<td>${l.theftthingcity}</td>
								<td>${l.information}</td>
								<td><a href="TheftRecordUpdateAdmin?theftNo=${l.theftNo}">update</a></td>
								<td><a href="TheftRecordDeleteAdmin?theftNo=${l.theftNo}">delete</a></td>
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