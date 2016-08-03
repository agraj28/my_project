package officialinsitute.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.model.Products;


@Controller
public class ProductsController {
	Logger log = LoggerFactory.getLogger(ProductsController.class);
	
	@Autowired
	private ProductsDao productsdao;
	
	@Autowired 
	private Products products;
	
	
	@RequestMapping(value = "/Products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("Products", products);
		model.addAttribute("ProductsList", this.productsdao.getAllProducts());
		return "products";
	}

	// For add and update category both
	@RequestMapping(value = "/Products/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("products") Products products) {

		Util util = new Util();
		String id=  util.replace(products.getP_id(), ",", "");
	     products.setName(p_id);

		
		productsdao.saveorupdate(products);

		//return "redirect:/products";
		return "products";

	}

	@RequestMapping("Products/remove/{p_id}")
	public String deleteCategory(@PathVariable("p_id") String p_id, ModelMap model) throws Exception {

		try {
			productsdao.delete(p_id);
			model.addAttribute("message", "Successfully Added");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "redirect:/products";
	}

	@RequestMapping("Products/edit/{p_id}")
	public String editCategory(@PathVariable("p_id") String id, Model model) {
		System.out.println("editProducts");
		model.addAttribute("Products", this.productsdao.get(p_id));
		model.addAttribute("listProducts", this.productsdao.getAllProducts());
		return "products";
	}

	
}
