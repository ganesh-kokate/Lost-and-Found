package lostnfound.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import lostnfound.model.Itemdetails;
import lostnfound.model.Userlogin;

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
	/*
	public void processRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Userlogin id= (Userlogin) session.getAttribute("user");
		System.out.println("by service"+id);
		
	}*/
	
public List<Itemdetails> getlist(){
		
		List <Itemdetails> list = this.hibernateTemplate.loadAll(Itemdetails.class);
		
		return list;
	}

@Transactional
@SuppressWarnings({ "deprecation", "rawtypes" })
public List<Itemdetails> getlistbyid(int value){
	String hql = "FROM Itemdetails WHERE u = :value";
	Query query = this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
	query.setParameter("value", value);
    List<Itemdetails> list = query.list();
    return list;
}

@Transactional
public void deleteItem (int id) {
	Itemdetails p= this.hibernateTemplate.load(Itemdetails.class,id);
	this.hibernateTemplate.delete(p);
}


	

}
