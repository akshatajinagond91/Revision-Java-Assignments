<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FIR Record Update Delete</title>
</head>
<body>

	<%@ include file="userheader.jsp"%>
<body>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">FIR Report Record</div>
			<div class="card-body">
				<form action="FIRRecordSearchUpdate" method="post">

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">FIR Report No.</label> <input
									class="form-control" id="exampleInputName" type="text"
									aria-describedby="noHelp" name="firNo" value="${list.firNo}"
									readonly="readonly">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Victim Name</label> <input
									class="form-control" id="exampleInputLastName" type="text"
									aria-describedby="nameHelp" name="victimName"
									value="${list.victimName}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputEmail1">Victim Address</label> <input
									class="form-control" id="exampleInputEmail1" type="text"
									aria-describedby="addressHelp" name="victimAddress"
									value="${list.victimAddress}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastCity">Victim City</label> <input
									class="form-control" id="exampleInputLastcity" type="text"
									aria-describedby="namecity" name="victimCity"
									value="${list.victimCity}">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputMobileNo">Information for Victim</label>
								<input class="form-control" id="exampleInputMobileNo"
									type="text" name="information" value="${list.information}">
							</div>
						</div>
					</div>

					<input type="submit" class="btn btn-primary btn-block"
						value="Update"> <a
						href="FIRRecordDelete?firNo=${list.firNo}"
						class="btn btn-primary btn-block">Delete</a>
				</form>

			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>