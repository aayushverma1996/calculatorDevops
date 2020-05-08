package com.spe.minor.calculator;

import java.util.Stack;

public class Postfix_Convert {

    public int priority(char x)
    {
        if( x=='/' )
            return 3;
        if(x=='*')
            return 2;
        if(x=='+')
            return 1;
        if(x=='-')
            return 0;
       return -1;
    }

    public void convert(String exp)
    {
        String out="";
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)=='(')
            {
                st.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    out+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else if(exp.charAt(i)>='0' && exp.charAt(i) <='9')
            {
                //add here for multiple char number
                out+=exp.charAt(i);
            }
            else if(priority(exp.charAt(i)) < priority(st.peek()))
            {
                while(!st.isEmpty() && priority(exp.charAt(i)) < priority(st.peek()) )
                {
                    out+=st.peek();
                    st.pop();
                }
                st.push(exp.charAt(i));
            }
            else
            {
                st.push(exp.charAt(i));
            }
        }
    }
}
