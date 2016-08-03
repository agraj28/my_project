package officialinsitute.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.doa.PackagesDao;
import com.niit.insbackend.doa.InsDao;
import com.niit.insbackend.model.Packages;
import com.niit.insbackend.model.Products;
import com.niit.insbackend.model.Ins;

@Controller
public class AdminController {
	
	@Autowired
	private Products products;

	@Autowired
	private Packages packages;

	@Autowired
	private Ins ins;
	
	@Autowired
	private InsDao insdao;
	
	@Autowired
	private PackagesDao packagesdao;
	
	
	@Autowired
	private ProductsDao productsdao;
	
	@RequestMapping("/manageinstitute")
	public ModelAndView institute() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("Institute", ins);
		mv.addObject("isAdminClickedins", "true");
		mv.addObject("InstituteList", insdao.getAllIns());
		return mv;
	}

	@RequestMapping("/manageProducts")
	public ModelAndView products() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("products", products);
		mv.addObject("isAdminClickedProducts", "true");
		mv.addObject("productsList", productsdao.getAllProducts());
		return mv;
	}

	@RequestMapping("/managepackages")
	public ModelAndView packages() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("packages", packages);
		mv.addObject("isAdminClickedPackages", "true");
		mv.addObject("PackagesList", packagesdao.getAllPackages());
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/index");
		session.invalidate();
		session = request.getSession(true);
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject("loggedOut", "true");
	
		return mv;
	 }
}
