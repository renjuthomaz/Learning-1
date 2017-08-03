package org.learn.coud.security.webresource;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableOAuth2Sso
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		return "home";
	}
}
