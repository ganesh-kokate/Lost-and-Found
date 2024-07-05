package lostnfound.dao;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import lostnfound.model.Userlogin;
import org.hibernate.Session;


@Repository
public class userdao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveItem(Userlogin userlogin) {
		int x=(Integer)this.hibernateTemplate.save(userlogin);
		return x;
	}
	
	@SuppressWarnings("deprecation")
	public Userlogin loguser(Userlogin userlogin) {
		String hql = "from Userlogin where username=:name and password=:pwd";

	    // Use hibernateTemplate.execute() with a HibernateCallback
	    Userlogin result = hibernateTemplate.execute((Session session) -> {
	        Query<Userlogin> query = session.createQuery(hql, Userlogin.class);
	        query.setParameter("name", userlogin.getUsername());
	        query.setParameter("pwd", userlogin.getPassword());
	        return query.uniqueResult(); // Assuming there is only one matching user, adjust accordingly
	    });

	    return result;
	}
}

