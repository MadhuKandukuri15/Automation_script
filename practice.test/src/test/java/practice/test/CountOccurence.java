package practice.test;

import java.util.*;
import java.util.Map.Entry;

import org.apache.batik.css.engine.value.Value;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "mmmdhusudhaan";
		Map<Character, Integer> ch = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			if (ch.containsKey(s.charAt(i))) {
				int count = ch.get(s.charAt(i));
				ch.put(s.charAt(i), ++count);
			} else {
				ch.put(s.charAt(i), 1);
			}
		} 
		// System.out.print(ch);
		
//int c1=0;
//		int c = 0;
//		String sF = "";
//		Set<Map.Entry<Character, Integer>> Lmap = ch.entrySet();
//		for (Map.Entry<Character, Integer> data : Lmap) {
//			if (c > data.getValue()) {
//				
//				c = data.getValue();
//				c1=ch.getOrDefault(data.getKey(), c);
//			}
//
//		}
//		System.out.println(c1);
		
		
		Set<Map.Entry<Character, Integer>> entrySet = ch.entrySet();
		
		int maxCount = 0;
        
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar+" : "+maxCount);

	}
}
