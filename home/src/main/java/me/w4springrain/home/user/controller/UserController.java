package me.w4springrain.home.user.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import me.w4springrain.home.main.controller.HomeController;
import me.w4springrain.home.user.service.UserService;
import me.w4springrain.home.user.vo.User;

@Controller
@SessionAttributes("user")
@RequestMapping(value = "/users")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	
	@ModelAttribute("user")
    public User getUser() {
        logger.debug("SessionAttributes 생성 : user");
		return new User();
    }
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user, SessionStatus sessionStatus, Model model) {
		userService.createUser(user);
		sessionStatus.setComplete();
		return "redirect:home";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectUsers(Model model) {
		List<User> users = userService.selectUsers();
		model.addAttribute("users", users);
		return "tiles:users/users";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String selectUsersSignup(@ModelAttribute User user, Model model) {
		return "users/signup";
	}
	
//	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
//	public String selectUser(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
//	
//	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
//	public String updateUser(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
//	
//	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
//	public String deleteUser(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
