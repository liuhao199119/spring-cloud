package com.hzit.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzit.bean.Dept;

@FeignClient(value="springcloud-dept",fallbackFactory=DeptClientServiceFallbackFactoy.class)

public interface DeptClientService {

	@RequestMapping("/dept/list")
	public List<Dept> list();

	@RequestMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno);

	@RequestMapping("/dept/add")
	public boolean add(Dept dept);

}
