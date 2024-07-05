package lostnfound.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lostnfound.dao.itemsdao;
import lostnfound.model.Itemdetails;
import lostnfound.model.Userlogin;


@Service
public class itemservice {

		
		@Autowired
		private itemsdao itemDao;
			
		public int createitem(Itemdetails item) {
			// TODO Auto-generated method stub
			return this.itemDao.saveItem(item);
		

	}
		
		public int processRequest(HttpServletRequest request) {
			// TODO Auto-generated method stub
			HttpSession session = request.getSession();
			Userlogin id= (Userlogin) session.getAttribute("user");
			System.out.println("by service of item"+id);
			return id.getId();
			
			
		}

		public List<Itemdetails>getitemlist(){
			
			
			return this.itemDao.getlist();
		}
		
public List<Itemdetails>getitemlistbyid(int x){
			
			
			return this.itemDao.getlistbyid(x);
		}

public void deleteItemservice(int x) {
	itemDao.deleteItem(x);
}

			
		

	



}
