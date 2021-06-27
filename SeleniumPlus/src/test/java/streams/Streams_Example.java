package streams;

import java.util.ArrayList;

import org.apache.poi.ss.util.SSCellRange;
import org.testng.annotations.Test;
import java.lang.String;

public class Streams_Example {
	@Test
	public void automate() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("madhu");
		names.add("bhargav");
		names.add("ram");
		names.add("angel");
		names.add("anil");
		int count = 0;

		long cd = names.stream().filter(s -> s.startsWith("A")).count();
		for (int i = 0; i < names.size(); i++) {

		}
		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		// print names which has first letter as a and in uppper case

		// names.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 1).sorted().map(s -> s.toLowerCase())
				.forEach(s -> System.out.println(s));

	}
}
