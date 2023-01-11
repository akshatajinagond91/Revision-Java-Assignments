<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Register Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>
<body>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Update Record</div>
			<div class="card-body">
				<form action="RagisterRecordUpdateServlate" method="post">

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Police Station Name</label> <input
									class="form-control" id="exampleInputPolice" type="text"
									aria-describedby="PoliceHelp" name="stationname"
									value="${list.stationname}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">First name</label> <input
									class="form-control" id="exampleInputName" type="text"
									aria-describedby="nameHelp" name="fname" value="${list.fname}">
							</div>
							<div class="col-md-6">
								<label for="exampleInputLastName">Last name</label> <input
									class="form-control" id="exampleInputLastName" type="text"
									aria-describedby="nameHelp" name="lname" value="${list.lname}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Address</label> <input
									class="form-control" id="exampleInputAdress" type="text"
									aria-describedby="addressHelp" name="address"
									value="${list.address}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">City</label> <input
									class="form-control" id="exampleInputCity" type="text"
									aria-describedby="cityHelp" name="city" value="${list.city}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							class="form-control" id="exampleInputEmail1" type="email"
							aria-describedby="emailHelp" name="email" value="${list.email}">
					</div>

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputMobileNo">Mobile No</label> <input
									class="form-control" id="exampleInputMobileNo" type="text"
									name="mobileno" value="${list.mobileno}">
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