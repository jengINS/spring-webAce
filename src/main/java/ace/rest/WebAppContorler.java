package ace.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import ace.bind.*;
import ace.service.*;


@RestController
public class WebAppContorler {
	 // private String appMode;
	  
	  
	  @Autowired
		private UserService userService;
	  
//	    @RequestMapping("/")
//	    public String index(Model model){
//	        model.addAttribute("datetime", new Date());
//	        model.addAttribute("username", "Ömerrrr");
//	        model.addAttribute("mode", appMode);
//
//	        return "index";
//	    }
	    
	    @GetMapping("/user/{cid}")
		public ResponseEntity<users> getCourse(@PathVariable Integer cid) {
			users course = userService.getById(cid);
			return new ResponseEntity<>(course, HttpStatus.OK);
		}
		
		
		@GetMapping("/user")
		public ResponseEntity<List<users>> getAllCourses() {
			List<users> allCourses = userService.getAllCourses();
			return new ResponseEntity<>(allCourses, HttpStatus.OK);
		}

	    @PostMapping("/DataInsert")
	    public ResponseEntity<String> handleJsonPost() throws Exception {
	       
	       
	    	try {
	    		
	    		
	    		return ResponseEntity.ok("Success");
	    	}
	    	catch(NoSuchElementException e){
	    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    	}
	    }
//	    
//	    @PutMapping("/DataUpdate")
//	    public ResponseEntity<String> handleJsonPut() throws Exception {
//	       
//	       
//	    	try {
//	    		
//	    		
//	    		return ResponseEntity.ok("Success");
//	    	}
//	    	catch(NoSuchElementException e){
//	    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    	}
//	    }
//	    
//	    @DeleteMapping("/DataDelete")
//	    public ResponseEntity<String> handleJsonDelete() throws Exception {
//	       
//	       
//	    	try {
//	    		
//	    		
//	    		return ResponseEntity.ok("Success");
//	    	}
//	    	catch(NoSuchElementException e){
//	    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    	}
//	    }
}
