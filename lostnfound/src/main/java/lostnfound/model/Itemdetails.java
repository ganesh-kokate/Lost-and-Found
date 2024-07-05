package lostnfound.model;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@Entity
public class Itemdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String std;
	private String mob;
	private String item_name;
	@Temporal(TemporalType.DATE)
	private Date added_date;
	
	//@ManyToOne
	//@Join
	//@Column(name = "user_id")
	//@Column(name = "user_id")
	private int u;
	
	/*private Integer uids;
	
	public Integer getUids() {
		if (uids == 0) {
	        this.setUids(0); // Set a default value or handle it as needed
	    }
		return uids;
	}
	public void setUids(Integer uids) {
		if (this.getUids() == null) {
            this.setUids(0); // Set a default value or handle it as needed
        }
		this.uids = uids;
	}
	*/
	
	
	
	

	public int getU() {
		return u;
	}
	public void setU(int u) {	
		this.u = u;
	}


	@Lob
	private byte[] item_image;
	
	public Itemdetails() {
		super();
	}
	public Itemdetails(String name, String std, String mob, String item_name, byte[] item_image) {
		super();
		this.name = name;
		this.std = std;
		this.mob = mob;
		this.item_name = item_name;
		this.added_date = new Date();
		this.item_image = item_image;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=new Random().nextInt(10000);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Date getAdded_date() {
		return added_date;
	}
	
	@PrePersist
	public void setAdded_date() {
		this.added_date = new Date();;
	}
	public byte[] getImage() {
		return item_image;
	}
	public void setImage(byte[] item_image) {
		
		this.item_image = item_image;
	}
	
	
	@Override
	public String toString() {
		return "Itemdetails [name=" + name + ", std=" + std + ", mob=" + mob + ", item_name=" + item_name
				+ ", added_date=" + added_date + ", image=" + "]";
	}
	
	
}
