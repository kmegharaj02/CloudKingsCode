package coreJavaCloudKingsCode;

import java.util.Scanner;
public class PractiseSet_2 {
    public static void main(String[] args) {
        //qn 1
        float a=7/4.0f*9/2.0f;
        System.out.println(a);
        //qn2
        int v=10;
        int u=5;
        int b=3;
        int s=4;
        float t=(v*v-u*u)/(2*b*s); //100-400/2*30*40
        System.out.println(t);

        //qn3
        int ko=5;
        int ki=ko*5/10+50/ko; //25/10+50/5
        System.out.println(ki); //2+10=12

        //qn4
        System.out.println("enter the number");
        Scanner qw= new Scanner(System.in);
        float ft=qw.nextFloat();
        float gn=55.7f;
        System.out.println(gn>ft);

        //qn5
         char zx='a';
         zx=(char)(zx+8);
        System.out.println(zx);

        zx=(char)(zx-8);
        System.out.println(zx);

    }
}
