package com.penguin.spring.test.url;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.url.domain.Url;
import com.penguin.spring.test.url.service.UrlService;
@RequestMapping("/ajax/url")
@Controller
public class UrlController {

	@Autowired
	private UrlService urlService;
	
	//input
	@GetMapping("/input")
	public String urlInput() {
		
		return "ajax/urlInput";
	}
	
	

	
	//리스트
	@GetMapping("/list")
	public String urlList(Model model) {
		
		List<Url> urlList = urlService.getUrlList();
		
		model.addAttribute("urlList", urlList);
		
		return "ajax/urlList";
	}
	
	
	@ResponseBody
	@GetMapping("/create")
	public Map<String, String> createUrl(
			@RequestParam("name")String name
			, @RequestParam("url")String url
			){
		int count = urlService.addUrl(name, url);
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {//성공
			resultMap.put("result", "success");
			
		} else { // 실패
			resultMap.put("result", "fail");
			
		}
		
		return resultMap;
	}
	
	
	
	
	
	
	
	
	
	
}
