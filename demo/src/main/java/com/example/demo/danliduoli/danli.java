package com.example.demo.danliduoli;

public class danli {
	private static danli obj;
private danli(){
	}
public static synchronized danli getsingle(){
	if(obj==null){
		obj=new danli();
	}
	return obj;
}
}
