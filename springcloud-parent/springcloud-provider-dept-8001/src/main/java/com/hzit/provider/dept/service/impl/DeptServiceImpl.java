package com.hzit.provider.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzit.bean.Dept;
import com.hzit.provider.dept.mapper.DeptMapper;
import com.hzit.provider.dept.service.DeptService;


@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	public boolean add(Dept dept) {
		return deptMapper.addDept(dept);
	}

	public Dept get(Long id) {

		return deptMapper.findById(id);
	}

	public List<Dept> list() {
		return deptMapper.findAll();
	}

}
