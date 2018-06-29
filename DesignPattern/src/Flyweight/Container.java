package Flyweight;

import java.util.Hashtable;


public class Container {
	
	private Hashtable<String,ElementObject> table = new Hashtable<String,ElementObject>();
	
	public void put(String key,ElementObject vo){
		table.put(key, vo);
	}
	
	public ElementObject get(String key){
		if(!table.containsKey(key)){
			table.put(key,new ElementObject(key));
		}
		return table.get(key);
	}
	
	public int getSize(){
		return table.size();
	}
	
	
}
