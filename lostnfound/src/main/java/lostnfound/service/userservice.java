package lostnfound.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lostnfound.dao.userdao;
import lostnfound.model.Userlogin;



@Service
public class userservice {

	@Autowired
	private userdao userDao;
	
	public int createuser(Userlogin user) {
		// TODO Auto-generated method stub
		return this.userDao.saveItem(user);
	

}
	public Userlogin loginuser(Userlogin user) {
		// TODO Auto-generated method stub
		return this.userDao.loguser(user);
	

}
	//this is for getting user by controller from session
	public void processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Userlogin id= (Userlogin) session.getAttribute("user");
		//System.out.println("by service"+id);
		
	}
}
