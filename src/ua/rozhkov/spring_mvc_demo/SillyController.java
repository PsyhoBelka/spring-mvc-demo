package ua.rozhkov.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly-form";
	}

}
