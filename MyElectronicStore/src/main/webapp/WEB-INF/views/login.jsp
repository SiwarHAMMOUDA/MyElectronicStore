<html>
<head>
<meta  http-equiv="Content-Type" content="text/html" charset=ISO-8859-1>
   <link rel="styleSheet" type="text/css" href="<%= request.getContextPath()%>/resources/css/style1.css">
 <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="<%= request.getContextPath()%>https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<%= request.getContextPath()%>/resources/template/AdminLTE-3.1.0/plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="<%= request.getContextPath()%>/resources/template/AdminLTE-3.1.0/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%= request.getContextPath()%>/resources/template/AdminLTE-3.1.0/dist/css/adminlte.min.css">
<title> MyBoutique</title>
</head>
<body class="hold-transition login-page" >

<form action="j_spring_security_check" method="post">
<div class="login-box">
  <div class="login-logo">
    <a href="<%= request.getContextPath()%>/resources/template/AdminLTE-3.1.0/index2.html">WELCOME TO EBOUTIQUE!</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>
        <div class="input-group mb-3">
          <input type="text" name="j_username" class="form-control" placeholder="Login">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" name="j_password" class="form-control" placeholder="Password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <input type="submit" value="Login"  class="btn btn-primary btn-block"/>
          </div>
          <!-- /.col -->
        </div>
      <p class="mb-1">
        <a href="forgot-password.html">I forgot my password</a>
      </p>
      <p class="mb-0">
        <a href="register.html" class="text-center">Register a new membership</a>
      </p>
      
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
</form>
<!-- /.login-box -->
<!-- jQuery -->
<script src="<%= request.getContextPath()%>/resources/template/AdminLTE-3.1.0/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>
</body>
</html>