package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

	private static final Logger log = LoggerFactory.getLogger(HeaderController.class);

	@GetMapping("/headers")
	public void getHeaders(HttpServletRequest request) {
		HttpHeaders httpHeaders = new ServletServerHttpRequest(request).getHeaders();
		log.info("Do some logging : {}", httpHeaders);
	}

}
