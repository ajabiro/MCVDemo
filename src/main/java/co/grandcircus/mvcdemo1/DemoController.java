package co.grandcircus.mvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
		
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}

}
