package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

	@GetMapping("/cors")
	public String cors() {
		return "Spring Boot Cors!";
	}
}
