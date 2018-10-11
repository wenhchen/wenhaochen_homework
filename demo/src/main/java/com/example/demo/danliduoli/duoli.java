package com.example.demo.danliduoli;

import java.util.ArrayList;


public class duoli {
	private static duoli many1=new duoli();
	private static duoli many2=new duoli();
	private static ArrayList<duoli> set= new ArrayList<duoli>();
	private duoli(){}
static{
	
	set.add(many1);
	set.add(many2);
}
public static duoli getobject(int index){
	return set.get(index);
}
}
