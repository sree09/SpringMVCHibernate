package springMVChibernate.DAO;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMVChibernate.model.CarBean;
import springMVChibernate.model.UserBean;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean validUser(String name, String password) {
		boolean flag = false;
			
		UserBean userBean = (UserBean)sessionFactory.openSession().get(UserBean.class,name);

			if(userBean.getUserName()!=null && userBean.getUserName().equals(name) && userBean.getPassword().equals(password)){
				flag = true;
			}else{
				flag = false;
			}

		return flag;
	}

	@Override
	public void addUser(String fname, String uname, String password) {
		UserBean userBean = new UserBean();
		userBean.setFullName(fname);
		userBean.setUserName(uname);
		userBean.setPassword(password);
		sessionFactory.getCurrentSession().saveOrUpdate(userBean);

	}

	@Override
	public ArrayList<CarBean> listCars() {
		return (ArrayList<CarBean>)sessionFactory.getCurrentSession().createQuery("FROM CarBean").list();
	}

}
