package com.example.demo.danliduoli;

public class danli2 {
  private static danli2 obj=new danli2();
  private danli2(){
	  
  }
  public static synchronized danli2 getObj(){
	  return obj;
  }
}
