package com.hzit.provider.dept.mapper;

import java.util.List;

import com.hzit.bean.Dept;

public interface DeptMapper {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
