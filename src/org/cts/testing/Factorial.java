package org.cts.testing;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the factorial no");
	int no=sc.nextInt();
	int count=1;
	for(int i=1;i<=100; i++) {
		no=count*i;
	}
	System.out.println("" +no);
}
}
