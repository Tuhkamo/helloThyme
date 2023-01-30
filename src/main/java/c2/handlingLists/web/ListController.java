package c2.handlingLists.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import c2.handlingLists.domain.Student;

@Controller
public class ListController {

	@GetMapping("/hello")
	public String getStudentLista(Model model) {
		//luon Studentlistan
		List<Student> studentlista = new ArrayList<Student>();
		studentlista.add(new Student("Kate", "Cole"));
		studentlista.add(new Student("Dan", "Brown"));
		studentlista.add(new Student("Mike", "Mars"));
		model.addAttribute("studentlista", studentlista);
		return "hello";
	}
}

