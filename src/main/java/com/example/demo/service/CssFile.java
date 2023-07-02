package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class CssFile {
	
	@Value("${server.port}")
	private int portnumber;
    Logger logger = LoggerFactory.getLogger(CssFile.class);

	public void cssFileTransefer(MultipartFile file) {
		
		logger.info("file name{} and original name{}",file.getName(),file.getOriginalFilename());
		
		logger.info("execution completed successfully((((((((((((((((((((((((  done  {}",portnumber);
		
	      
	}
	
	

}
