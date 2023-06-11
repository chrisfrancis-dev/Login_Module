<!DOCTYPE html>
<html>
  <head>
    <title>Home Page</title>
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />
    <style>
      body {
        font-family: Arial, sans-serif;
      }
      .navbar {
        background-color: #007bff;
        color: #fff;
      }
      .navbar .nav-link {
        color: #fff;
      }
      .hero-section {
        padding: 100px 0;
        text-align: center;
        color: #333;
      }
      .hero-section h1 {
        font-size: 48px;
        font-weight: bold;
        margin-bottom: 20px;
      }
      .hero-section p {
        font-size: 18px;
        margin-bottom: 40px;
      }
      .btn-get-started {
        background-color: #007bff;
        color: #fff;
        font-size: 18px;
        padding: 10px 30px;
        border-radius: 5px;
      }
      .btn-get-started:hover {
        background-color: #0069d9;
      }
      .feature-section {
        padding: 100px 0;
      }
      .feature-section h2 {
        font-size: 36px;
        font-weight: bold;
        margin-bottom: 40px;
      }
      .feature-box {
        text-align: center;
        margin-bottom: 40px;
      }
      .feature-icon {
        font-size: 48px;
        color: #007bff;
        margin-bottom: 20px;
      }
      .feature-title {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 10px;
      }
      .feature-description {
        font-size: 16px;
      }
      .footer {
        background-color: #f8f9fa;
        padding: 40px 0;
        text-align: center;
      }
      .footer p {
        margin-bottom: 0;
      }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg">
      <div class="container">
        <a class="navbar-brand" href="#">Your Logo</a>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="login.jsp">Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="registration.jsp">Register</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="view.jsp">View Products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="admin.jsp">Admin</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="hero-section">
      <div class="container">
        <h1>Welcome to Our Website</h1>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eget
          ultrices velit.
        </p>
      </div>
    </div>

    <div class="feature-section">
      <div class="container">
        <h2>Our Features</h2>
        <div class="row">
          <div class="col-md-4">
            <div class="feature-box">
              <i class="fas fa-check-circle feature-icon"></i>
              <h3 class="feature-title">Feature 1</h3>
              <p class="feature-description">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
          <div class="col-md-4">
            <div class="feature-box">
              <i class="fas fa-check-circle feature-icon"></i>
              <h3 class="feature-title">Feature 2</h3>
              <p class="feature-description">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
          <div class="col-md-4">
            <div class="feature-box">
              <i class="fas fa-check-circle feature-icon"></i>
              <h3 class="feature-title">Feature 3</h3>
              <p class="feature-description">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="footer">
      <div class="container">
        <p>&copy; 2023 Your Company. All rights reserved.</p>
      </div>
    </div>

    <script
      src="https://kit.fontawesome.com/1234567890.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
