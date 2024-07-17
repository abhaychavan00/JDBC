package com.testjbk2;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;


public class TestA2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map =
				new LinkedHashMap<Integer,String>();
		map.put(49, "nikita");
		map.put(78, "rohit");
		map.put(92, "sanket");
		map.put(45, "jay");
		map.put(99, "aj");
		
		Set<Integer> ks = map.keySet();
		for (Integer t : ks)
			System.out.println(t);
		
		Collection<String> vs = map.values();
		for (String t : vs)
			System.out.println(t);
Set<Entry<Integer,String>> es = map.entrySet();
for(Entry<Integer,String> entry :es) {
	System.out.println(entry.getKey()+" "+entry.getValue());
}
				
		
	}
}
