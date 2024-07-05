package lostnfound.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Userlogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Uid;
	public String username;
	public String password;
	
	
	//@OneToMany(mappedBy = "u",cascade = CascadeType.ALL)
	//private List<Itemdetails> myitems = new ArrayList<>();
	
	
	public Userlogin() {
        // Default constructor
    }
	
	public Userlogin(String username, String password) {
		super();
		this.Uid=new Random().nextInt(10000);
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return Uid;
	}
	public void setId(int id) {
		this.Uid = new Random().nextInt(10000);;
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
