<%@page import="com.pojo.Registration"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Register Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<%
		BLManger bl = new BLManger();
		List<Registration> l = bl.registrationsearchlist();
		session.setAttribute("li", l);
	%>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i>Register Record
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Register No.</th>
							<th>User Type</th>
							<th>Police Station Name</th>
							<th>Name</th>
							<th>Address</th>
							<th>City</th>
							<th>Email</th>
							<th>Mobile No.</th>
							<th>Action</th>
							<th>Action</th>

						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Register No.</th>
							<th>User Type</th>
							<th>Police Station Name</th>
							<th>Name</th>
							<th>Address</th>
							<th>City</th>
							<th>Email</th>
							<th>Mobile No.</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</tfoot>
					<tbody>

						<c:forEach items="${sessionScope.li}" var="l">
							<tr>
								<td>${l.regNo}</td>
								<td>${l.role.rname}</td>
								<td>${l.stationname}</td>
								<td>${l.fname}${l.lname}</td>
								<td>${l.address}</td>
								<td>${l.city}</td>
								<td>${l.email}</td>
								<td>${l.mobileno}</td>
								<td><a href="RagisterRecordUpdateServlate?regNo=${l.regNo}">update</a></td>
								<td><a href="RagisterRecordDeleteServlate?regNo=${l.regNo}">delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<div class="card-footer small text-muted">Record</div>
	</div>


	<%@ include file="footer.jsp"%>

	<%@ include file="footer.jsp"%>

</body>
</html>