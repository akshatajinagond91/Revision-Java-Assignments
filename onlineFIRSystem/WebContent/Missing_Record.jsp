<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Missing Record</title>
</head>
<body>

	<%@ include file="userheader.jsp"%>
<body>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">MISSING RECORD</div>
			<div class="card-body">
				<form action="MissingServlate" method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Email:</label> <input
									class="form-control" id="exampleInputEmail" type="text"
									aria-describedby="emailHelp" name="email"
									placeholder="Enter email" required="Required"
									pattern="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
									title="Example: arunpratap079@gmail.com">
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Missing Things:</label> <input
									class="form-control" id="exampleInputLastthing" type="text"
									aria-describedby="namething" name="missingthing"
									placeholder="Enter Missing Things" required="Required">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Missing Things
									Address:</label> <input class="form-control"
									id="exampleInputLastaddress" type="text"
									aria-describedby="nameaddress" name="missingthingaddress"
									placeholder="Enter Missing Things Address" required="Required">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputcity">Missing Things City:</label> <select
									name="missingthingcity" class="form-control"
									id="examplerolecity">
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
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Information for
									Missing Things:</label> <input class="form-control"
									id="exampleInputInformation" type="text" name="information"
									placeholder="Enter Information for Missing Things"
									required="Required">
							</div>
						</div>
					</div>
					<input type="submit" class="btn btn-primary btn-block" value="Save">
				</form>

			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>