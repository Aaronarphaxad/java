package com.csis3275.controller_aom_43;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//Import the model
import com.csis3275.model_aom_43.Greeting_aom_43;

@Controller
public class GreetingController {
	@GetMapping("/greetingGetRoute")
	public String greetingForm(Model model) {
		model.addAttribute("greetingModelAttribute", new Greeting_aom_43());
		return "greetingView";
	}

	@PostMapping("/greetingPostRoute")
	public String greetingSubmit(@ModelAttribute Greeting_aom_43 greeting, Model model) {
		System.out.println(greeting.getId());
		System.out.println(greeting.getContent());
		model.addAttribute("greetingModelAttribute", greeting);
		return "resultView";
	}
}