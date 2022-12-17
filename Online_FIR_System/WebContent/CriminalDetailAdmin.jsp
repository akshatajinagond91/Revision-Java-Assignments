<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Criminal Detail</title>
</head>
<body>

<%@ include file="adminheader.jsp"%>

<div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Add Criminal Detail</div>
      <div class="card-body">
        <form action="SaveCriminalDetailAdmin" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputName">Criminal Name:</label>
                <input class="form-control" id="exampleInputEmail" type="text" aria-describedby="nameHelp" name="name" placeholder="Enter Criminal Name" required="Required">
              </div>
              </div>
              </div>
             
              <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputLastName">Criminal Address:</label>
                <input class="form-control" id="exampleInputLastthing" type="text" aria-describedby="addressthing" name="address" placeholder="Enter Criminal Address" required="Required">
              </div>
            </div>
          </div>
           <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
              <label for="exampleInputcity">Victim City:</label>
                <select name="city" class="form-control" id="examplerolecity">
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
                <label for="exampleInputPassword1">Mobile No.:</label>
                <input class="form-control" id="exampleInputInformation" type="text" name="mobileno" placeholder="Enter Information for Missing Things" required="Required">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="exampleInputPassword1">Information:</label>
                <input class="form-control" id="exampleInputInformation" type="text" name="information" placeholder="Enter Information for Missing Things" required="Required">
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