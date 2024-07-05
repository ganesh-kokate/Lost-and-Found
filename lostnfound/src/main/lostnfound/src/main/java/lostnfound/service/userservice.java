package lostnfound.service;

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
}
