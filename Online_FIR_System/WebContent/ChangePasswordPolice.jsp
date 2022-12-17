<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>

	<%@ include file="policestationheader.jsp"%>
<body>
	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Reset Password</div>
			<div class="card-body">
				<div class="text-center mt-4 mb-5">
					<h4>Change your password?</h4>
					<p>Enter your email address and we will send you instructions
						on how to Change your password.</p>
				</div>
				<form action="ChangePasswordPoliceServlate" method="get">
					<div class="form-group">
						<input class="form-control" type="text" name="email"
							placeholder="Enter Your Email" required="Required"
							pattern="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
							title="Example: arunpratap079@gmail.com">
					</div>
					<input type="submit" class="btn btn-primary btn-block"
						value="Search">
				</form>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>