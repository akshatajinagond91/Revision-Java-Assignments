<%@page import="com.pojo.Status"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Complain Status</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<%
		BLManger bl = new BLManger();
		List<Status> l = bl.viewmissingsatuslist();
		session.setAttribute("li", l);
	%>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i>Complain Status
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>User Type</th>
							<th>Missing Complain No.</th>
							<th>Theft Complain No.</th>
							<th>FIR Complain No.</th>

							<th>Complain Status</th>
							<th>Action</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>User Type</th>
							<th>Missing Complain No.</th>
							<th>Theft Complain No.</th>
							<th>FIR Complain No.</th>
							<th>Complain Status</th>

							<th>Action</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</tfoot>
					<tbody>

						<c:forEach items="${sessionScope.li}" var="l">
							<tr>
								<td>${l.usertype}</td>
								<td>${l.missingrecord.missingNo}</td>
								<td>${l.theftrecord.theftNo}</td>
								<td>${l.firrecord.firNo}</td>
								<td>${l.status}</td>
								<td><a href="MissingComplainStatusAdmin.jsp">Message</a></td>
								<td><a
									href="MissingStatusAdminUpdate?statusNo=${l.statusNo}">update</a></td>
								<td><a
									href="DeleteMissingStatusAdmin?statusNo=${l.statusNo}">delete</a></td>
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