package coreJavaCloudKingsCode;

import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
       System.out.println("enter the number");
        int a=input.nextInt();
        boolean z=input.hasNextInt();
        System.out.println(z);
        float b=input.nextFloat();
        System.out.println("entered number is: "+a+" "+b);
       System.out.println(a);
        int c=input.nextInt();
        float d=input.nextFloat();
        System.out.println("enterd number is: "+c+" "+d);
        float sum=a+b+c+d;
        System.out.println("the sum of two numbers:"+ sum);
      float  sum1=a+b;
        System.out.println(sum);
        System.out.println(sum1);


        String s=input.next();
        System.out.println(s);
        String ts=input.nextLine();
        System.out.println(ts);
    }
}
