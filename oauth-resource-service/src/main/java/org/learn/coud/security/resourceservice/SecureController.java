package org.learn.coud.security.resourceservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

	@RequestMapping("/test")
	public String getResponse() {
		return "Success";
	}
}
