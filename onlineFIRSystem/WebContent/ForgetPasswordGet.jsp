<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Get Password</title>
<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom fonts for this template-->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">
</head>

<body style="background: url(img/15.jpg)">
	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Password</div>
			<div class="card-body">
				<div class="text-center mt-4 mb-5">
					<h4>your password</h4>
					<p>This is your password you can login your acount.</p>
				</div>
				<div class="form-group">


					<input class="form-control" id="exampleInputEmail" type="text"
						aria-describedby="passHelp" name="password"
						value="${list.password}" readonly="readonly">
				</div>


				<a class="btn btn-primary btn-block" href="login.html">Login</a>

			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
