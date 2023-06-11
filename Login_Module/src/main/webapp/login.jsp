<!DOCTYPE html>
<html lang="en">
  <head>
    <link rel="stylesheet" href="index.css" />
    <title>Login page</title>
  </head>
  <body>
    <section>
      <div class="form-box">
        <div class="form-value">
          <form action="LoginServlet1" method="post">
            <h2>Login</h2>
            <div class="inputbox">
              <ion-icon name="body-outline"></ion-icon>
              <input type="text" id="username" name="username" required />
              <label for="Username">Username</label>
            </div>
            <div class="inputbox">
              <ion-icon name="lock-closed-outline"></ion-icon>
              <input
                type="password"
                class="form-control"
                id="password"
                name="password"
                required
              />
              <label for="">Password</label>
            </div>
            <button id ="loginButton">Log in</button>
            <div class="register">
              <p>Don't have a account <a href="registration.jsp">Register</a></p>
            </div>
          </form>
        </div>
      </div>
    </section>
    <script
      type="module"
      src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"
    ></script>
    <script
      nomodule
      src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"
    ></script>
  </body>
</html>
