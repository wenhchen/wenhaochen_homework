package com.example.demo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.entity.Address;
import com.example.demo.entity.Class;
import com.example.demo.entity.Student;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.mapper.ClassMapper;
import com.example.demo.mapper.StudentMapper;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
	StudentMapper studentmapper;
    @Autowired
    AddressMapper addressmapper;
    @Autowired
    ClassMapper classmapper;
	@Test
	public void contextLoads() throws UnsupportedEncodingException {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		addressmapper.deleteAddressByList(list);
	}
	public void addstudent(){
		Student stu=new Student();
		studentmapper.addstudent(stu);
	}
	public Student findStudent(int id){
		Student stu = studentmapper.selectStudentById(id);
		return stu;
	}
	public void deleteStudent(int id){
		studentmapper.deleteStudentById(id);
	}
	public void updateStudent(Student stu){
		studentmapper.updateStudent(stu);
	}
	public ArrayList<Student> selectStudentByClassname(String classname){
		ArrayList<Student> students = studentmapper.selectStudentByClassname(classname);
		return students;
	}
	public void addAddress(Address address){
		addressmapper.addAddress(address);
	}
	public Address findAddress(int id){
		Address address = addressmapper.selectAddressById(id);
		return address;
	}
	public void deleteAddress(int id){
		addressmapper.deleteById(id);
	}	
	public void addClass(Class cla){
		classmapper.addClass(cla);
	}
	public Class selectClass(int id){
		Class cla = classmapper.selectClassById(id);
		return cla;
	}
	public void deleteClass(int id){
		classmapper.deleteClassById(id);
	}
	public void updateClass(Class cla){
		classmapper.updateClass(cla);
	}
}
