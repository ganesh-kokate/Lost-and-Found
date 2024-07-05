package lostnfound.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userlogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public String username;
	public String password;
	
	public Userlogin() {
        // Default constructor
    }
	
	public Userlogin(String username, String password) {
		super();
		this.id=new Random().nextInt(10000);
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = new Random().nextInt(10000);;
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

}
