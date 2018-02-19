package springMVChibernate.DAO;

import java.util.ArrayList;

import springMVChibernate.model.CarBean;

public interface UserDAO {
	public boolean validUser(String name, String password);
	public void addUser(String fname,String uname,String password);
	public ArrayList<CarBean> listCars();

}
