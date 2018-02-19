package springMVChibernate.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springMVChibernate.model.CarBean;
import springMVChibernate.service.UserService;

@Controller @RequestMapping("/car")
public class UserController {

	public UserController() {
		
	}
	@Autowired
	private UserService userService;
	@RequestMapping(value="/auth",method=RequestMethod.POST )
	public String validUser(@RequestParam("name") String name,@RequestParam("pass") String pass) {
		//System.out.println("Enter controller");
		if(userService.ValidUser(name, pass))
			return "Success";
		else
			return "Invalid";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String addUser(String fullName,String userName,String password) {
		userService.addUser(fullName,userName,password);
		return "Login";
	}

	@RequestMapping(value="/listcars", method=RequestMethod.POST)
	public ModelAndView listCar() {
		ArrayList<CarBean> carslist = userService.listCar();
		return new ModelAndView("cars","carslist",carslist);
	}

}
