//package com.company;
import java.util.Scanner;

public class Parallelogram {

	//Your code goes here.
	static boolean flag;
	static int breadth;
	static int height;

	static{
		Scanner s = new Scanner(System.in);
		breadth = s.nextInt();
		height = s.nextInt();
		if(breadth <= 0 || height <= 0){
			flag = false;
			System.out.println("invalid");
		}else{
			System.out.println("valid");
			flag = true;
		}
	}

	public static void main(String[] args) { //don't change main body
		if (flag) {
			int area = breadth * height;
			System.out.print(area);
		}
	}
}
