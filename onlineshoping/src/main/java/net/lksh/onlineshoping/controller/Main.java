package net.lksh.onlineshoping.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	Map<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("aaa", 2);
	hm.put("bbb", 2);
	System.out.println(Collections.max(hm.values()));
	
	String key = Collections.max(
			hm.entrySet(), Map.Entry.comparingByValue()).getKey();
	System.out.println(key);
	
	int max=hm.entrySet()
			.stream()
			.max((e1,e2)->e1.getValue()>e2.getValue()?1:-1)
			.get()
			.getValue();
	
	Iterator<String> itr= hm.entrySet()
			.stream().filter(e->e.getValue()==max)
			.map(Map.Entry::getKey)
		
			.iterator();
	
	
}
}