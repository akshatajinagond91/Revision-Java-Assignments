<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Theft Record</title>
</head>
<body>

	<%@ include file="adminheader.jsp"%>
<body>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Theft Report Record</div>
			<div class="card-body">
				<form action="TheftRecordUpdateAdmin" method="post">

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Theft Report No.</label> <input
									class="form-control" id="exampleInputName" type="text"
									aria-describedby="noHelp" name="theftNo"
									value="${list.theftNo}" readonly="readonly">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Theft Things</label> <input
									class="form-control" id="exampleInputLastName" type="text"
									aria-describedby="thingsHelp" name="theftthing"
									value="${list.theftthing}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputEmail1">Theft Things Address</label> <input
									class="form-control" id="exampleInputEmail1" type="text"
									aria-describedby="addressHelp" name="theftthingaddress"
									value="${list.theftthingaddress}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Theft Things City</label> <input
									class="form-control" id="exampleInputLastcity" type="text"
									aria-describedby="namecity" name="theftthingcity"
									value="${list.theftthingcity}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputMobileNo">Information For Theft
									Things</label> <input class="form-control" id="exampleInputMobileNo"
									type="text" name="information" value="${list.information}">
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