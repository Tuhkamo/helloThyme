package c2.helloThyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


		// @RequestMapping...
		@GetMapping("/hello")
		public String sayGreetings(@RequestParam String name, @RequestParam Integer age, Model model) {
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			return "helloName";
		}
	
}
