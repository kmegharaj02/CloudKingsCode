package coreJavaCloudKingsCode;

import java.util.Scanner;
public class ElseIfClause {
    public static void main(String[] args) {
        Scanner dfg=new Scanner(System.in);
        int a=dfg.nextInt();
        if(a>100)
        {
            System.out.println("hey num above 10");
        }
        else if(a<9){
            System.out.println("num less than 9");
        }
        else if(a>40)
        {
            System.out.println("num more than 40");
        }
        else {
            System.out.println("nill");
        }

    }
}
