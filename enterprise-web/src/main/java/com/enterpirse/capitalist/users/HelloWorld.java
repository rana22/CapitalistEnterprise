/**
 * created by AR
 */
package com.enterpirse.capitalist.users;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
//
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ambar.rana
 *
 */
@Controller
public class HelloWorld {
	static final Logger logger = Logger.getLogger(HelloWorld.class);
	
	@RequestMapping("/index")
	public String login(){
		Logger.getLogger("test for login page:");
		return "index";
	}
	
	@RequestMapping("/UserForm")
	public String DisplayUserForm(){
		return "UserForm";
	}
}

