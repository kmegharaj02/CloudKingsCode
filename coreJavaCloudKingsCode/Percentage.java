package coreJavaCloudKingsCode;

import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("enter the marks");
        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        long sum = sub1 + sub2 + sub3 + sub4 + sub5;
        long percentage = (sum/500)*100;
        float cgpa=sum/50;
        System.out.println(sum);
        System.out.println(percentage);
        System.out.println(cgpa);
}
}
