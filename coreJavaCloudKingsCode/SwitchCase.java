package coreJavaCloudKingsCode;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner ijk=new Scanner(System.in);
        int a=ijk.nextInt();
        switch (a){
            case 10:
            System.out.println("above 10");
           // break;
            case 20:
                System.out.println("above 20");
                break;
            case 30:
                System.out.println("above 30");
                //break;
            default:
                System.out.println("nof");
        }

       /* int b=ijk.nextInt();
        switch (b){
            case 10-> System.out.println("above 10");
            case 20-> System.out.println("above 20");
            default-> System.out.println("njf");
        }*/

    }
}
