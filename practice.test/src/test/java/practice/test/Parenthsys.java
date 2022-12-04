package practice.test;

import java.util.Stack;
public class Parenthsys {
    public static boolean isBalanced(String in)
    {
        Stack<Character> st = new Stack<Character>();

        for(char chr : in.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                    st.push(chr);
                    break;

                case ']':
                    if(st.isEmpty() || st.pop() != '[') 
                        return false;
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[]) {
    	String s="[[]";
        if(s.length() != 0) {
            if(isBalanced(s))
                System.out.println(s + " is balanced");
            else
                System.out.println(s + " is not balanced");
        }
    }
}