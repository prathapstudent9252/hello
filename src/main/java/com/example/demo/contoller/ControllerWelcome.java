package com.example.demo.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.service.CssFile;

@Controller
public class ControllerWelcome {
	
	@Autowired
	private CssFile service;
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value = "/welcome")
	public String welcome()
	{
		return "welcome to API";
	}
	
	@PostMapping(value="/file")
	
	public ResponseEntity<String> cssFileTransfer(@RequestParam("file") MultipartFile file)
	{
		service.cssFileTransefer(file);
		
		return new ResponseEntity<>("file transfer succesfully.......!!!!!!!!!!",HttpStatus.CREATED);
		
	}
	

}
