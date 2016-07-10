/**
 * 
 */
package com.enterpirse.capitalist.users;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;

/**
 * @author ambar.rana
 *
 */

@Path("/internal/capitalist/enterprise/users")
@Produces({"application/javascript", MediaType.APPLICATION_JSON})
public class HelloWorld {

}
