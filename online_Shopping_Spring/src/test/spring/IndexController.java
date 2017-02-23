package test.spring;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.portlet.ModelAndView;

import test.been.RegistrationBeen;
import test.service.RegistrationService;


@Controller
public class IndexController {
	public String saveDirectory="G:/baabtra/reg_users_pic/";
	@RequestMapping(value = "/", method = RequestMethod.GET)
		
		public String init(Model model) {
			model.addAttribute("msg", "Please Enter Your Login Details");
			return "login";
		}

	
	@RequestMapping(value="/registration_form", method = RequestMethod.GET )	
	public String lg_cus(Model model)
	{
		return "registration_form";
		
	}

//	@RequestMapping(value="/admin_page", method = RequestMethod.GET )	  
//    public ModelAndView admin_page(HttpServletRequest request,HttpServletResponse res) {  
//        String name=request.getParameter("name");  
//        String password=request.getParameter("password");  
//          
//        if(password.equals("admin")){  
//        String message = "HELLO "+name;  
//        return new ModelAndView("admin_page", "message", message);  
//        }  
//        else{  
//            return new ModelAndView("admin_page", "message","Sorry, username or password error");  
//        }  
//    }  
	
	@RequestMapping(value="/registration", method = RequestMethod.POST )
	public String init(Model model, @ModelAttribute("registrationBean") RegistrationBeen registrationBean,@RequestParam CommonsMultipartFile file,HttpSession session )
	{
		//System.out.println(registrationBean.getGender());
		
		String filename=file.getOriginalFilename();  
	    System.out.println(saveDirectory+" "+filename);
	    
	    try{  
	        byte barr[]=file.getBytes();  
	        BufferedOutputStream bout=new BufferedOutputStream(  
	        new FileOutputStream(saveDirectory+"/"+filename));  
	        bout.write(barr);  
	        bout.flush();  
	        bout.close();  
	          
	    }
	    catch(Exception e){
	    	
	    	System.out.println(e);
	    }
	    
	    RegistrationService reg=new RegistrationService();
	    RegistrationService reg1=new RegistrationService();
	   
	    int rt=-1;
	    int rt1=-1;
	    rt1=reg1.login_data(registrationBean);
		
		registrationBean.setFilename(filename);
		rt=reg.register(registrationBean);
		
	      
		if(rt==1){
			model.addAttribute("name", registrationBean.getFname());
			model.addAttribute("lname", registrationBean.getLname());
			model.addAttribute("image", registrationBean.getFilename());
			return "home";
		}else
			model.addAttribute("msg","Registration failed");
			return "registration_form";
		
	}
	
}
