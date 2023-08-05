package coreJavaCloudKingsCode;

import java.util.Scanner;
public class StringProblems {
    public static void main(String[] args) {

        String name="   MeghaRaj    ";
       // Scanner nameq=new Scanner(System.in);
      //String namew=nameq.next();

        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));
        String abcMine="Dear  <|name|>,   thanks  a lot";
        System.out.println(abcMine.replace("<|name|>","megharaj"));
        System.out.println(abcMine.indexOf("  "));
        System.out.println(abcMine.indexOf("   "));

        String letter="Dear megharaj,\n\thow are you.\nthanks";
        System.out.println(letter);
     /* int a=nameq.nextInt();
        int b=nameq.nextInt();
       System.out.println("numbers before swap" +a+" "+b);
       //int c=a;
        a=a+b;
         b=a-b;
         a=a-b;
       // a=b;
        //b=c;


        System.out.println(a+" "+b);*/
    }
}
