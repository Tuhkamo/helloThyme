package friendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import friendList.domain.Friend;

@Controller
public class FriendListController {
	
	@GetMapping("/index")
	public String formFriendList(Model model) {
		List<Friend> friendList = new ArrayList<Friend>();
		model.addAttribute("friendList", friendList );
		return "index";
	}
	
	@PostMapping("/index")
	public String submitFriendList(@RequestParam String firstName, @RequestParam String lastName, Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "index";
	}
}

