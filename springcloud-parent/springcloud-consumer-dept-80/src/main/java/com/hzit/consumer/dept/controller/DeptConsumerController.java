package com.hzit.consumer.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hzit.bean.Dept;

@RestController()
@RequestMapping("/consumer")
public class DeptConsumerController {
	//private static final String PREFIX_URL = "http://localhost:8001";
	private static final String PREFIX_URL = "http://SPRINGCLOUD-DEPT/";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dept/list")
	public List<Dept> list() {

		// 参数一:url地址
		// 参数二:请求参数
		// 参数三:返回值类型
		List list = restTemplate.getForObject(PREFIX_URL + "/dept/list", List.class);
		return list;
	}

	@RequestMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno) {

		// 参数一:url地址
		// 参数二:请求参数
		// 参数三:返回值类型
		Dept dept = restTemplate.getForObject(PREFIX_URL + "/dept/get/" + deptno, Dept.class);
		return dept;
	}

	@RequestMapping("/dept/add")
	public boolean add(Dept dept) {

		// 参数一:url地址
		// 参数二:请求参数
		// 参数三:返回值类型
		boolean bool = restTemplate.postForObject(PREFIX_URL + "/dept/add", dept, Boolean.class);
		return bool;
	}

	@GetMapping("/discovery")
	public Object discovery() {
		return restTemplate.getForObject(PREFIX_URL + "/provider/discovery", Object.class);
	}

}
