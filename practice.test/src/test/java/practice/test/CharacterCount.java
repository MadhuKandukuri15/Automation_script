package practice.test;

import java.util.LinkedHashMap;
import java.util.Map;

import io.netty.handler.codec.http.HttpHeaders.Names;

public class CharacterCount {

	public static void main(String[] args) {

		String s = "Java Programming !!";

		String temp = "";
		int count;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 65 & s.charAt(i) <= 90) | (s.charAt(i) >= 97 & s.charAt(i) <= 122)) {
				temp = temp + s.charAt(i);
			}
		}
		

		char ch1[] = temp.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap();
		for (int i = 0; i < temp.length(); i++) {
			if (m.containsKey(ch1[i])) {
				count = m.get(ch1[i]);
				m.put(ch1[i], ++count);
			} else {
				m.put(ch1[i], 1);
			}
		}
		int max=0;
		
		System.out.println(m);

	}

}
//int row;
//String s1 = "madhusudhan";
//List <WebElemet>name = driver.findElement(By.xpath(""));
//for(int i=0;i<name.size();i++) {
//	if(name.contains(s1)) {
//	row = i;
//	}
//}
