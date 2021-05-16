package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("vihaan");
		mylist.add("nilesh");
		mylist.add("agastya");
		mylist.add("ashwini");
		
		System.out.println("before sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		System.out.println("after sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("after descending order");
		System.out.println(mylist);
		
		Stack<String> mystack = new Stack<String>();
		mystack.push("abc");
		mystack.push("xyz");
		//mystack.pop();
		mystack.push("pqr");
		
		System.out.println(mystack);

	}

}
