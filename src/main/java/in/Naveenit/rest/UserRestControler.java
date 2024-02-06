package in.Naveenit.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Naveenit.binding.User;

@RestController
public class UserRestControler {
	
	  private Map<Integer, User> dataMap= new HashMap<>();
         @PostMapping("/user")
	    public  ResponseEntity <String>add( @RequestBody User user){

	    	System.out.println(user);
	    	dataMap.put(user.getId(), user);
	    	
	    	return  new ResponseEntity<String>("User Saved",HttpStatus.CREATED);
	    }
      /*  @GetMapping("/user")
            public User  getUser(@RequestParam("userId")Integer userId) {
            	 User user = dataMap.get(userId);
       return user;
    
         
         }*/
         
          public User getUser(@PathVariable("id")Integer  userId) {
        	   User  user = dataMap.get(userId);
        	   return  user;
          }
         
         
         
}
