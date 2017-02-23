package test.spring;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import test.been.RegistrationBeen;
import test.service.LoginService;

@Controller
public class LoginController {
	int rt=-1;
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// log_been = object of registration been.
	
	public String init(Model model,@ModelAttribute("log_been") RegistrationBeen log_been) {
		//System.out.println(log_been.getUname());
		model.addAttribute("msg", "Please Enter Your Login Details");
		
	
	LoginService ls = new LoginService();
	
	try {
		rt =ls.login_method(log_been);
		if(rt==2){
			return "admin_page";
		}
		else if(rt==1) {
			return "home";
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return "login";
	}
}

