package officialinsitute.controller;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.insbackend.doa.PackagesDao;
import com.niit.insbackend.doa.InsDao;
import com.niit.insbackend.doa.UserDetailsDao;
import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.doa.UserDao;
import com.niit.insbackend.model.Ins;
import com.niit.insbackend.model.Products;
import com.niit.insbackend.model.User;
import com.niit.insbackend.model.Packages;
import com.niit.insbackend.model.Ins;
import com.niit.insbackend.model.UserDetails;


@Controller
public class HomeController {
	Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserDetails userdetails;
	 
	@Autowired
	private ProductsDao productsdao;
	
	@Autowired
	private UserDao userdao;
	
	@Autowired
	private InsDao insdao;
	
	@Autowired
	private PackagesDao packagesdao;

	@Autowired
	private Products  products;
	
	@Autowired
	private Ins ins;
	
	@Autowired
	private Packages packages;
	
	@Autowired
	private User user;
	
	
	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session) {
		
		ModelAndView mv = new ModelAndView("/Index");
		session.setAttribute("Products", products);
		session.setAttribute("Productslist", productsdao.getAllProducts());
	
	return mv;
	}

	@RequestMapping(value = "user/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute UserDao userdao) {
		userdao.saveorupdate(user);
		ModelAndView mv  = new ModelAndView("/home");
		mv.addObject("successMessage", "You are successfully register");
		
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("user", user);
		mv.addObject("isUserClickedSignup", "true");
		return mv;
	}

}
