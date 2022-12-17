<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Admin</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Register an Account</div>
			<div class="card-body">
				<form action="RegisterServlate" method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Category</label> <select
									name="rname" class="form-control" id="examplerolename">
									<option>admin</option>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">First name</label> <input
									class="form-control" id="exampleInputName" type="text"
									aria-describedby="nameHelp" name="fname"
									placeholder="Enter first name" required="Required">
							</div>
							<div class="col-md-6">
								<label for="exampleInputLastName">Last name</label> <input
									class="form-control" id="exampleInputLastName" type="text"
									aria-describedby="nameHelp" name="lname"
									placeholder="Enter last name" required="Required">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Address</label> <input
									class="form-control" id="exampleInputAddress" type="text"
									aria-describedby="addressHelp" name="address"
									placeholder="Enter Your Address" required="Required">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputcity">City</label> <select name="city"
									class="form-control" id="examplerolecity">
									<option>Select</option>
									<option>Mumbai</option>
									<option>Aurangabad</option>
									<option>Nashik</option>
									<option>Thane</option>
									<option>Sangli</option>
									<option>Amaravati</option>
									<option>Chandrapur</option>
									<option>Pune</option>
									<option>Nagpur</option>
									<option>Solapur</option>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							class="form-control" id="exampleInputEmail1" type="email"
							aria-describedby="emailHelp" name="email"
							placeholder="Enter email" required="Required"
							pattern="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
							title="Example: arunpratap079@gmail.com">
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Password</label> <input
									class="form-control" id="exampleInputPassword1" type="password"
									name="password" placeholder="Password" required="Required">
							</div>
						</div>
						<div class="form-group">
							<div class="form-row">
								<div class="col-md-6">
									<label for="exampleInputMobileNo">Mobile No</label> <input
										class="form-control" id="exampleInputMobileNo" type="text"
										name="mobileno" placeholder="Mobile No" required="Required">
								</div>
							</div>
						</div>
					</div>
					<input type="submit" class="btn btn-primary btn-block"
						value="Register">
				</form>

			</div>
		</div>
	</div>


	<%@ include file="footer.jsp"%>

</body>
</html>