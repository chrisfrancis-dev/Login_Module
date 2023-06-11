public class User {
  private int id;
  private String fullname;
  private String email;
  private String username;
  private String password;
  private String type;

  public User() {
  }

  public User(int id, String fullname, String email, String username, String password, String type) {
    this.id = id;
    this.fullname = fullname;
    this.email = email;
    this.username = username;
    this.password = password;
    this.type = type;
  }

  // Getters and setters
  // ...

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", fullname='" + fullname + '\'' +
        ", email='" + email + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", type='" + type + '\'' +
        '}';
  }
}
