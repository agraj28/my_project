package officialinsitute.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.insbackend.doa.UserDetailsDao;
import com.niit.insbackend.doa.InsDao;
import com.niit.insbackend.doa.PackagesDao;
import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.model.UserDetails;

import com.niit.insbackend.model.Products;
import com.niit.insbackend.model.Ins;
import com.niit.insbackend.model.Packages;


public class LoginController {
	Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
    private UserDetails userdetails;
	
	@Autowired
	private Ins ins;
	
	@Autowired 
	private Products products;
       
	@Autowired 
	private Packages packages;
	
	@Autowired 
	private UserDetailsDao userdetailsdao;
	
	@Autowired 
	private InsDao insdao;
	
	@Autowired
	private ProductsDao productsdao;
	
	@Autowired
	private PackagesDao packagesdao;
	
	
	
	
}
