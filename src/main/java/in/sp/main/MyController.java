package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//@RequestMapping("/helloPage")
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}
	@GetMapping("/viewSt")
	public ModelAndView showView() {
		ModelAndView mv=new ModelAndView("view");
		
		return mv;
	}

}
