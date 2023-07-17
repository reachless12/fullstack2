package edu.springStudy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", "�ݰ����ϴ�." ); //request.setAttribute()�� ������ ����
		
		return "home";
	}
	
	@RequestMapping(value="/sample.do",method=RequestMethod.GET)
	public String sample( Model model) {
		
		String name = "ȫ�浿";
		int age = 20;
		String addr = "���� ������";
		String phone = "010-1111-1111";
		
		/*
		 �� ���� 4������ ex01.jsp�� �������Ͽ� ����ϼ���.
		 */
		model.addAttribute("name" , name);
		model.addAttribute("age"  , age);
		model.addAttribute("addr" , addr);
		model.addAttribute("phone", phone);
		
		return "ex01";
	}
	
	@RequestMapping(value="/sample.do",method=RequestMethod.POST)
	public String sample1(String name, String age, String addr, String phone) {
		
		System.out.println("name :: "+name);
		
		if(age != null && !age.equals("")) {
			
			int a = Integer.parseInt(age);
			
			System.out.println("age :: "+a);
		}
		
		System.out.println("addr :: "+addr);
		System.out.println("phone :: "+phone);
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
