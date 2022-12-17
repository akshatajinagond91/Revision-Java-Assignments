<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Missing Report Search By ID</title>
</head>
<body>

	<%@ include file="userheader.jsp"%>
<body>
	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Search Your Record</div>
			<div class="card-body">
				<div class="text-center mt-4 mb-5">
					<h4>Enter Your Missing Report No.</h4>
					<p>Enter your Missing Report No. and we will show your record.</p>
				</div>




				<form action="MissingRecordSearchUpdate" method="get">
					<div class="form-group">
						<input class="form-control" type="text" name="missingNo"
							placeholder="Enter Your Missing Record No." required="Required">
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