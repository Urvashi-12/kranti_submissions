package java_handson;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindCountOfWords {
public static void main(String[] args) {
	String s1="This This is is a a interview question question";
	String[] split_s1=s1.split(" ");
	HashMap<String,Integer> h1= new HashMap<String,Integer>();
	for(String k: split_s1) {
		if(h1.containsKey(k)) {
			int count =h1.get(k);
			h1.put(k, count+1);
		}
		else {
			h1.put(k, 1);
		}
	}
	
	for(Entry<String, Integer> final_s:h1.entrySet()) {
		System.out.println(final_s.getKey() + " " +final_s.getValue());
	}
}
}
