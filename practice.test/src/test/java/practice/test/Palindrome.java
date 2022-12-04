package practice.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Palindrome {

	public static void main(String... arg) {
		
		
		List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");  
		  
		  System.out.print(al.size());
		  
		    
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Ajay");
		  al2.add("Ajay");
		  al2.add("madhu");
		  al2.add(3, "madhu");
		 al2.removeAll(al);
		 al2.set(2, "k");
		  System.out.print(al2.get(2));
		  
	}
}
