package lostnfound.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lostnfound.dao.itemsdao;
import lostnfound.model.Itemdetails;


@Service
public class itemservice {

		
		@Autowired
		private itemsdao itemDao;
			
		public int createitem(Itemdetails item) {
			// TODO Auto-generated method stub
			return this.itemDao.saveItem(item);
		

	}

		public List<Itemdetails>getitemlist(){
			
			
			return this.itemDao.getlist();
		}

	



}
