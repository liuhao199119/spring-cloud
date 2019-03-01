package com.hzit.consumer.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hzit.bean.Dept;
import com.hzit.service.DeptClientService;


@RestController()
@RequestMapping("/consumer")
public class DeptConsumerController {
	// private static final String PREFIX_URL = "http://localhost:8001";
	// private static final String PREFIX_URL = "http://SPRINGCLOUD-DEPT/";

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping("/dept/list")
	public List<Dept> list() {
		return deptClientService.list();
	}

	@RequestMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno) {
		return deptClientService.get(deptno);
	}

	@RequestMapping("/dept/add")
	public boolean add(Dept dept) {
		return deptClientService.add(dept);
	}

}
