package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping(value = {"/generator/a={a}&b={b}","/generator"})
	public String generator(@RequestParam(value = "a", defaultValue = "0") String a, @RequestParam(value = "b", defaultValue = "0") String b, Model model) {
		String hmAwal = "hm";
		String hmAkhir = "";
		for (int i=1; i<Integer.parseInt(a); i++) {
			hmAwal += "m";
		}
		if (Integer.parseInt(b)>1) {
			for (int j=0; j<Integer.parseInt(b); j++) {
				hmAkhir += hmAwal + " ";
			}
		} else {
			hmAkhir = hmAwal;
		}
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("hm", hmAkhir);
		return "generator";
	}
	
	/*
	 * Project VIRAL
	 */
//	@RequestMapping("/viral")
//	public String index(){
//		return "viral";
//	}
//	@RequestMapping("/viral2jari")
//	public String index(){
//		return "viral";
//	}
//	@RequestMapping("/viral")
//	public String viral(){
//		return "viral";
//	}
//	@RequestMapping("/viral")
//	public String index(){
//		return "viral2jari";
//	}

	/*
	 * Request Parameter
	 */
//	@RequestMapping("/challenge")
//	public String challenge(@RequestParam(value = "name") String name, Model model){
//		model.addAttribute("name", name);
//		return "challenge";
//	}
//	@RequestMapping("/viral/challenge")
//	public String challenge(@RequestParam(value = "name") String name, Model model){
//		model.addAttribute("name", name);
//		return "challenge";
//	}
//	@RequestMapping("/challenge")
//	public String challenge(@RequestParam(value = "name", required = false) String name, Model model){
//		model.addAttribute("name", name);
//		return "challenge";
//	}
//	@RequestMapping("/challenge")
//	public String challenge(@RequestParam(value = "name", required = false, defaultValue = "kiki") String name, Model model){
//		model.addAttribute("name", name);
//		return "challenge";
//	}
	
	/*
	 * Path Variable
	 */
//	@RequestMapping("/challenge/{name}")
//	public String challengePath(@PathVariable String name, Model model){
//		model.addAttribute("name", name);
//		return "challenge";
//	}	
//	@RequestMapping(value= {"/challenge","/challenge/{name}"})
//	public String challengePath(@PathVariable Optional<String> name, Model model){
//		if (name.isPresent()) {
//			model.addAttribute("name", name.get());
//		} else {
//			model.addAttribute("name", "KB");
//		}
//		return "challenge";
//	}
}