package com.penguin.spring.test.url;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	
	
	
	
	
	
	//전달 받은걸 저장 기능 페이지
	@ResponseBody
	// 보안,너무 길면 post
	@PostMapping("/create")
	public Map<String, String> createUrl(
			@RequestParam("name")String name
			, @RequestParam("url")String url
			){
		int count = urlService.addUrl(name, url);
		
		// 데이터를 담는 api  
		// 성공 : {"result", "sucess"}
		// 실패 : {"result", "fail"}
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {//성공
			resultMap.put("result", "success");
			
		} else { // 실패
			resultMap.put("result", "fail");
			
		}
		
		return resultMap;
	}
	
	

	//9월6일 수업 post 
	@ResponseBody
	@GetMapping("/duplicate-url")
	public Map<String, Boolean> isDuplicateUrl(
			@RequestParam("url")String url) {
		
		boolean isDuplicate = urlService.isDuplicateUrl(url);
		
		 // 중복됨 : ("isDuplicate" : true)
		 //	중복 안됨 : ("isDuplicate" : false)
		
		Map<String ,Boolean>resultMap = new HashMap<>();
		
		if(isDuplicate) {
			//중복
			resultMap.put("isDuplicate", true);
		} else {
			//중복 안됨
			resultMap.put("isDuplicate", false);
		}
		
		
		return resultMap;
	}
	
	
	//삭제 기능 7일 기능 api
	@ResponseBody
	@GetMapping("/delete")
	public Map<String, String> deleteUrl(@RequestParam("id")int id) {
		
		int count = urlService.deleteUrl(id);
		
		//json 
		// 성공 : {"result": "success"}
		// 실패 : {"result": "fail"}
		
		Map<String, String> resulrtMap = new HashMap<>();
		if(count == 1) {
			// 성공
			resulrtMap.put("result", "success");
			
		} else {
			// 실패
			resulrtMap.put("result", "fail");
			
		}
	
		return resulrtMap;
		
	}
	
	
	
	
	
}
