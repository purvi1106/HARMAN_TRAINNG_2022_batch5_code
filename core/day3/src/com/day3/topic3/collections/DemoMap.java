package com.day3.topic3.collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//Map: HashMap, LinkedHashMap, TreeMap
public class DemoMap {
	
	public static void main(String[] args) {
		//session mgt: tomcat: hashmap: key--> value, dictionary
		Map<String, Integer> marksMap=new HashMap<String, Integer>();
		//Hashtable<String, Integer> marksMap=new Hashtable<String, Integer>();
		//marksMap.put(null, 89);
		marksMap.put("raj", 89);
		marksMap.put("raj", 70);
		marksMap.put("gunika", 99);
		marksMap.put("ekta", 90);
		marksMap.put("aakash", 78);
		
		//how to print map
		//System.out.println(marksMap);
		
		//how to iterate though map?
		//keyset vs entryset (better perfromace)
		
//		Set<String> keySet = marksMap.keySet();
//		for(String key: keySet) {
//			System.out.println(key+": "+ marksMap.get(key));
//		}
		//https://stackoverflow.com/questions/3870064/performance-considerations-for-keyset-and-entryset-of-map
		//entryset
		Set<Entry<String, Integer>> entrySet = marksMap.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
	}

}
