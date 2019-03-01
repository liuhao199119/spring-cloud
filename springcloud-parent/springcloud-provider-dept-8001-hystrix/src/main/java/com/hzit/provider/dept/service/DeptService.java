package com.hzit.provider.dept.service;

import java.util.List;

import com.hzit.bean.Dept;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
