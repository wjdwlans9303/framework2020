package com.bit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Remote3 {
	Set<String> set;
	ArrayList<String> alist;
	String[] arr;
	Map<String,String> map;
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	public void setAlist(ArrayList<String> alist) {
		this.alist = alist;
	}
	
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	
	public void func1() {
//		for(String msg:alist)System.out.println(msg);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(set);
//		for(String msg:map.keySet()) System.out.println(msg+":"+map.get(msg));
		Set<Entry<String,String>> ent=map.entrySet();
		Iterator<Entry<String,String>> ite=ent.iterator();
		while(ite.hasNext()) {
			Entry<String,String> obj =ite.next();
			System.out.println(obj.getKey()+":"+obj.getValue());
		}
	}
}
