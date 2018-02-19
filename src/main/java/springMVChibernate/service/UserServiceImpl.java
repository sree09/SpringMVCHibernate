package springMVChibernate.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import springMVChibernate.DAO.UserDAO;
import springMVChibernate.model.CarBean;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	@Override
	@Transactional
	public boolean ValidUser(String name, String pass) {
		if(userDAO.validUser(name,pass))
			return true;
		else 
			return false;

	}

	@Override
	@Transactional
	public void addUser(String fullName, String userName, String password) {
		userDAO.addUser(fullName,userName,password);
	}

	@Override
	@Transactional
	public ArrayList<CarBean> listCar() {
		return this.userDAO.listCars();
	}

}
