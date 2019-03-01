package com.hzit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hzit.bean.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallbackFactoy implements FallbackFactory<DeptClientService> {

	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {

			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}

			public Dept get(Long deptno) {
				Dept dept = new Dept();
				dept.setDname(deptno+"没有找到对应数据");
				dept.setDeptno(500);
				dept.setLoc("通过fegin");
				return dept;
			}

			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}};
	}

}
