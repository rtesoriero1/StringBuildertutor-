package com.lemon.stringbuildertutor;
//Java Tutoring
//Robert Tesoriero 12/4/2022

public class MyStringBuilder {

	
	
	public static void main(String[] args) {
		
		reverseString();
		deleteSubString();
		appendingString();
		MyStringBuilder1();
		MyStringBuilder2();
		MyStringBuilder3();
		MyStringBuilder4();
		MyStringBuilder5();
		MyStringBuilder6();
		MyStringBuilder7();
		MyStringBuilder8();
	}
	
	///1. What is the difference between StringBuilder and StringBuffer? 
	//StringBuffer public methods are all synchronized and StringBuilder's are not. 
	
	///2. How do you create a StringBuilder from a String? How do you return a String from a String Builder?
	//The append() method allows you to create a StringBuilder from a String. The toString() method allows you to return a String Builder to a String
	
	
	//3. Reverse String s 
	public static void reverseString() {
		StringBuilder s = new StringBuilder("Hello World"); 
		System.out.println("This is the string before it is reverse: " + s);
		s.reverse();
		System.out.println("This is the string after it is reverse: " + s);
	}
		//4. Delete subString from string s 
		public static void deleteSubString() {
			StringBuilder s = new StringBuilder("ThisWillBeTwentyLong"); 
			System.out.println("This is the string before deletion: " + s);
			s.delete(4, 10);
			System.out.println("This is the string after it deletion: " + s);
		}
		
		//5. What is the internal storage for characters in a string and a string builder?
		//Both String and String Builder are stored in the Heap 
		
		//6. Appending Strings 
		
		public static void appendingString() {
			StringBuilder s1 = new StringBuilder("Java");
			StringBuilder s2 = new StringBuilder("HTML");
		
			
			System.out.println("Here is s1 normally: " + s1);
			s1.append(" is fun");
			System.out.println("Here is s1 after one appendage: " + s1);
			
			s1.append(s2);
			System.out.println("Here is s1 after appending s2: " + s1);
		}
		
		//7. Own methods 
		
		public static void MyStringBuilder1() {
			//Converting String s into String Builder 
			String s = "Hello World"; 
			StringBuilder test = new StringBuilder(s); 
			System.out.println(test);
		}
		//Appending string
		public static void MyStringBuilder2() {
			StringBuilder s = new StringBuilder("I want to test"); 
			s.append(" appending");
			System.out.println(s); 
		}
		///Appending a number 
		public static void MyStringBuilder3() {
			int i = 39; 
			StringBuilder s = new StringBuilder("I want to add a number right here: "); 
			StringBuilder s2 = s.append(i);
			System.out.println(s2.toString());
		}
		//Length of String 
		public static void MyStringBuilder4() {
			StringBuilder s = new StringBuilder("This string is going to be a long one"); 
			System.out.println("This string has a length of " + s.length());
			
		}
		//String search 
		public static void MyStringBuilder5() {
			StringBuilder s = new StringBuilder("Robert");
			char o = s.charAt(1);
			System.out.println("The Letter 'o' can be found at index: " + o); 
		}
		//String to lower chase 
		public static void MyStringBuilder6() {
			StringBuilder s = new StringBuilder("WHY ARE WE YELLING?");
			System.out.println(s.toString().toLowerCase());
		}
		//Pulling a SubString 
		public static void MyStringBuilder7() {
			StringBuilder s = new StringBuilder("We are looking to pull out this piece 'right here'");
			System.out.println(s.substring(39, 49));
		}
		
		public static void MyStringBuilder8() {
			String s = "this String will too... become a string";
			System.out.println(s.toString());
		}


}
