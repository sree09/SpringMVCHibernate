package springMVChibernate.service;

import java.util.ArrayList;


import springMVChibernate.model.CarBean;

public interface UserService {
	public boolean ValidUser(String name,String pass);
	public void addUser(String fullName,String userName,String password);
	public ArrayList<CarBean> listCar();
}
