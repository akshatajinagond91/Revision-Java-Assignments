<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Criminal Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Update Criminal Detail</div>
			<div class="card-body">
				<form action="CiminalRecordUpdateAdminServlate" method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Criminal Name:</label> <input
									class="form-control" id="exampleInputEmail" type="text"
									aria-describedby="nameHelp" name="name" required="Required"
									value="${list.name}">
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Criminal Address:</label> <input
									class="form-control" id="exampleInputLastthing" type="text"
									aria-describedby="addressthing" name="address"
									value="${list.address}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Criminal City:</label> <input
									class="form-control" id="exampleInputLastaddress" type="text"
									aria-describedby="nameaddress" name="city" value="${list.city}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Mobile No.:</label> <input
									class="form-control" id="exampleInputInformation" type="text"
									name="mobileno" value="${list.mobileno}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Information:</label> <input
									class="form-control" id="exampleInputInformation" type="text"
									name="information" value="${list.information}">
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