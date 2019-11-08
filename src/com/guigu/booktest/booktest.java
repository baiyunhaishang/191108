package com.guigu.booktest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class booktest {
	@RequestMapping(value="/hello")
	public String handle() {

		return "success.jsp";
	}
}
