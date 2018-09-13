package me.w4springrain.home.common.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.w4springrain.home.common.domain.CommonCode;
import me.w4springrain.home.common.service.CommonCodeService;

@Controller
@RequestMapping(value = "/common-codes")
public class CommonCodeController {

//	private static final Logger logger = LoggerFactory.getLogger(CommonCodeController.class);
	
	@Autowired
	CommonCodeService commonCodeService;
	
//	@RequestMapping(value = "", method = RequestMethod.POST)
//	public String createUser(@ModelAttribute User user, SessionStatus sessionStatus, Model model) {
//		userService.createUser(user);
//		sessionStatus.setComplete();
//		return "redirect:home";
//	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectCommonCodes(Locale locale, Model model) {
		List<CommonCode> commonCodes = commonCodeService.selectCommonCodes();
		model.addAttribute("commonCodes", commonCodes);
		return "tiles:common/common-codes";
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
