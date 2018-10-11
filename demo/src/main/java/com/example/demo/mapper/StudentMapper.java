package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Student;

@Mapper
public interface StudentMapper {

	public void addstudent(Student stu);
	public Student selectStudentById(int id);
	public void deleteStudentById(int id);
	public void updateStudent(Student stu);
	public ArrayList<Student> selectStudentByClassname(String classname);
	public ArrayList<Student> selectStudentUseIf(int add_id,int cla_id);
	public Student selectStudentByMap(Map<String,Object> map);
}
