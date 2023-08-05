package coreJavaCloudKingsCode;

import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner qw=new Scanner(System.in);
        int n=qw.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
           if(i==3) {
               break;
           }
            System.out.println("using break");
        }

        System.out.println("break");

        int j=0;
        while( j<n)
        {
            System.out.println(j);
            j++;
            if(j==3){
                System.out.println("break while");
                    break;}
        }
        //j++;
            int o=0;
            do{
                System.out.println(o);
                o++;
                System.out.println(o);

                    if(o==3)
                        break;
                        System.out.println("break");

            }while(o<n);

        System.out.println("start continue");
        for(int b=0;b<n;b++) {
            if (b == 3) {
                System.out.println("continue");
                continue;
               // System.out.println("gr");
            }

            System.out.println(b);

        }
        System.out.println("erb");

            int d=0;
            while(d<n)
            {d++;
                if(d==3){
                    System.out.println("contiue");
                continue;
                  //  System.out.println();
            }

                System.out.println(d);
               // d++;

            }











    }
}
