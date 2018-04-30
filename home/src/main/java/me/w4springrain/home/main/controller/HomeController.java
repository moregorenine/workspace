package me.w4springrain.home.main.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import me.w4springrain.home.user.domain.User;

/**
 * Handles requests for the application home page.
 */
@Controller
//@SessionAttributes("user")
@RequestMapping(value = "/home")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	@ModelAttribute("user")
//    public User getUser() {
//        logger.debug("SessionAttributes 생성 : user");
//		return new User();
//    }
	
	/**
	 * default main 화면
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("booleanLogin", "false");
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "tiles:home";
	}
	
	/**
	 * 로긴페이지 자동호출
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String selectUsersLogin(Locale locale, Model model) {
		model.addAttribute("booleanLogin", "true");
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		return "tiles:home";
	}
	
	/**
	 * login page popup html
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginHtml", method = RequestMethod.GET)
	public String selectUsersLogin(@ModelAttribute User user, Model model) {
		return "home/login";
	}
	
	/**
	 * signup page popup html
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/signupHtml", method = RequestMethod.GET)
	public String selectUsersSignup(@ModelAttribute User user, Model model) {
		return "home/signup";
	}
}
