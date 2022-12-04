package logicalprgrams;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\

		String s = "bhargav";
		char a[] = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		int len = a.length;
		while (i != len) {
			if (map.containsKey(a[i]) == false) {
				map.put(a[i], 1);
			} else {
				int oldvalue = map.get(a[i]);
				int newvalue = oldvalue + 1;
				System.out.print(i);
				map.put(a[i], newvalue);

			}
			++i;
		}
		for (Map.Entry<Character, Integer> data : lhmap) {

		}

	}

}
