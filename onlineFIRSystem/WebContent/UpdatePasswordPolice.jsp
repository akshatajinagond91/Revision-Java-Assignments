<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Password</title>
</head>
<body>

	<%
		session.getAttribute("list");
	%>
	<%@ include file="policestationheader.jsp"%>



	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Change Password</div>
			<div class="card-body">
				<form action="ChangePasswordPoliceServlate" method="post">

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Enter Your New Password</label> <input
									class="form-control" id="exampleInputEmail" type="text"
									aria-describedby="passHelp" name="password">
							</div>
						</div>
					</div>


					<input type="submit" class="btn btn-primary btn-block"
						value="Update">


				</form>

			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>