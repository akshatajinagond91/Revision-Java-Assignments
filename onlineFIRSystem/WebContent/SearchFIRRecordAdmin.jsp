<%@page import="com.pojo.Firrecord"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManger"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View FIR Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<%
		BLManger bl = new BLManger();
		List<Firrecord> l = bl.firsearchlistforpiloce();
		session.setAttribute("li", l);
	%>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i>FIR Report Record
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>FIR Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Victim Name</th>
							<th>Victim Address</th>
							<th>Victim City</th>
							<th>Information for Victim</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>FIR Report No.</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile No</th>
							<th>Victim Name</th>
							<th>Victim Address</th>
							<th>Victim City</th>
							<th>Information for Victim</th>
							<th>Action</th>
							<th>Action</th>

						</tr>
					</tfoot>
					<tbody>

						<c:forEach items="${sessionScope.li}" var="l">
							<tr>
								<td>${l.firNo}</td>
								<td>${l.registration.fname} ${l.registration.lname}</td>
								<td>${l.registration.email}</td>
								<td>${l.registration.mobileno}</td>
								<td>${l.victimName}</td>
								<td>${l.victimAddress}</td>
								<td>${l.victimCity}</td>
								<td>${l.information}</td>
								<td><a href="FIRRecordUpdateAdmin?firNo=${l.firNo}">update</a></td>
								<td><a href="FIRRecordDeleteAdmin?firNo=${l.firNo}">delete</a></td>
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