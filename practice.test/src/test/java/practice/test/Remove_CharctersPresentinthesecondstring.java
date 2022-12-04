package practice.test;

public class Remove_CharctersPresentinthesecondstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s = "madhu";
 String s3 ="madhu is a naughty boy";
 String s1  = "jananau";
 String temp="";
 boolean b= false;
 for(int i=0;i<s.length();i++) {
	 for(int j=0;j<s1.length();j++) {
		 if((s.charAt(i)==s1.charAt(j))) {
			 b=false;
			 break;
		 }
		 else {
			 b=true;
		 }
		 
	 }
	 if(b) {
		 temp=temp+s.charAt(i);
	 }
	
 }
 System.out.print(temp);
	}

}





