package edu.springStudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/board")
@Controller
public class BoardController {

	@RequestMapping(value="/list.do")
	public String list(Model model) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("ù��° �Խù��Դϴ�.");
		list.add("�ι�° �Խù��Դϴ�.");
		list.add("����° �Խù��Դϴ�.");
		list.add("�׹�° �Խù��Դϴ�.");
		
		/*
		 �� list �����͸� board/list.jsp�� �������Ͽ� ���̺� ���·� ����ϼ���.
		 */
		
		model.addAttribute("list", list);
		
		return "board/list";
		//prefix => WEB-INF/views/[�������� ȭ�� ���].jsp
		//suffix => jsp
	}
	
	@RequestMapping(value="/view.do")
	public String view() {
		
		System.out.println("1111");
		return "board/view";
	}
	
}
