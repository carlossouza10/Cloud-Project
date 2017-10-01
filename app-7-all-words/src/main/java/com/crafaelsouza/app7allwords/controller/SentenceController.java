package com.crafaelsouza.app7allwords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

	@Autowired
	private RestTemplate template; 
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
	   return 
	     getWord("app-1-subject") + " "
	     + getWord("app-2-verb") + " "
	     + getWord("app-3-article") + " "
	     + getWord("app-4-adjective") + " "
	     + getWord("app-5-noun") + ".";
	}
	 
	public String getWord(String service) {
		return template.getForObject("http://" + service, String.class);
	}
}
