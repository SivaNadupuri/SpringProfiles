/**
 * 
 */
package com.siva.profiles.controlller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author SINAD3
 *
 */
public class ProfileController {

	@Value("${app.message}")

	private String welcomeMessage;

	@GetMapping("/welcome")
	public String getDatabaseConnectionDetals() {
		return welcomeMessage;

	}

}
