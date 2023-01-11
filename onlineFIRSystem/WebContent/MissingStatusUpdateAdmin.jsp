<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Complain Status</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Missing Complain Status</div>
			<div class="card-body">
				<form action="MissingStatusAdminUpdate" method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Enter User Type:</label> <input
									class="form-control" id="exampleInputUser" type="text"
									aria-describedby="userHelp" name="usertype"
									value="${list.usertype}" readonly="readonly">
							</div>
						</div>
					</div>


					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Enter Complain Status:</label>
								<input class="form-control" id="exampleInputStatus" type="text"
									aria-describedby="statusHelp" name="status"
									value="${list.status}">

							</div>
						</div>
					</div>

					<input type="submit" class="btn btn-primary btn-block" value="Send">
				</form>

			</div>
		</div>
	</div>


	<%@ include file="footer.jsp"%>

</body>
</html>