<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message Missing Complain</title>
</head>
<body>

	<%@ include file="policestationheader.jsp"%>

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Missing Complain Status</div>
			<div class="card-body">
				<form action="MissingComplainStatusServlate" method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputcity">Enter User Type</label> <select
									name="usertype" class="form-control" id="examplerolecity">
									<option>Officer</option>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">Missing Complain No.:</label> <input
									class="form-control" id="exampleInputNo" type="text"
									aria-describedby="noHelp" name="missingNo"
									placeholder="Enter Missing Complain No." required="Required">
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Enter Complain Status:</label>

								<textarea rows="10" cols="30" class="form-control" name="status"
									placeholder="Enter Complain Status Here" required="Required"></textarea>
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