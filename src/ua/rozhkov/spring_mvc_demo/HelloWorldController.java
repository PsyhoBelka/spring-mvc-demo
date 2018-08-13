package ua.rozhkov.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController{

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processForm2")
	public String getData(HttpServletRequest httpServletRequest, Model model) {
		String result=httpServletRequest.getParameter("firstname") +" "+httpServletRequest.getParameter("email");
		model.addAttribute("userData", result);

		return "helloworld";
	}

	@RequestMapping("/processForm3")
	public String getDataVer2(
			@RequestParam("firstname") String userName,
			@RequestParam("email") String userEmail,
			Model model) {

		String result=userName+" "+userEmail;
		model.addAttribute("userData", result);

		return "helloworld";
	}

}
