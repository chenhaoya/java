package test;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        Scanner val=new Scanner(System.in);
        st.add(val.next());
        while(st.empty()) {
            String s = null;
            st.push(s);
            System.out.println(s);
        }
    }
}