package test;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
	// ----------------data types in java-------------------
		int num1;
		int num2;
		
		num1=10;
		num2=11;
		
		int sum = num1+num2;
		int multi = num1*num2;
	    float div = (float)num1/num2;
	
	
		
        System.out.println(sum);
       System.out.println(multi);
       
       System.out.println("Addition: "+ sum);
       System.out.println("Multiplication: "+ multi);
       System.out.println("Division:"+ div);
       
     
       
       String name = "Rahul";
       
       System.out.println("Hello " +name);
       System.out.println("length: "+ name.length());
      System.out.println("Upper Case: "+ name.toUpperCase());
       
      // -------------how to use scanner variable-----------------
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Name of the User : ");
      String name1 = scanner.nextLine();
       
    //----------------Arrays--------------

      int myarray [] = {1,2,45,8,9};
      
      System.out.println("third Value in array: " + myarray[2]);
      
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println(cars[0]);
     
    String car [] = {"volvo", "bmw","ford"};
    System.out.println(car[2]);
      
      
      
      }
      
	}


