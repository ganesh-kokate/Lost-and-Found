package lostnfound.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import lostnfound.model.Itemdetails;

//import springweb.model.User;

@Repository
public class itemsdao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveItem(Itemdetails item) {
		int x=(Integer)this.hibernateTemplate.save(item);
		return x;
	}
	
public List<Itemdetails> getlist(){
		
		List <Itemdetails> list = this.hibernateTemplate.loadAll(Itemdetails.class);
		
		return list;
	}

public void deleteItem (int id) {
	Itemdetails p= this.hibernateTemplate.load(Itemdetails.class,id);
	this.hibernateTemplate.delete(p);
}
	

}
