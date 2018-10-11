package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Class;

@Mapper
public interface ClassMapper {
	public void addClass(Class cla);
	public Class selectClassById(int id);
	public void deleteClassById(int id);
	public void updateClass(Class cla);
}
