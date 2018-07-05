package com.jskim216.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jskim216.blog.domain.model.entity.Hello;
import com.jskim216.blog.infrastructure.dao.HelloDao;

@RestController
public class HelloRestController {

	@Autowired
	private HelloDao helloDao;

	@RequestMapping("/add")
	public Hello add(Hello hello) {
		Hello helloData = helloDao.save(hello);
		return helloData;
	}

	@RequestMapping(value = "/list", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public @ResponseBody List<Hello> list(Model model) {
		List<Hello> helloList = helloDao.findAll();
		return helloList;
	}

	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}