package coreJavaCloudKingsCode;

import java.util.Scanner;
public class java22loopsProblems {
    public static void main(String[] args) {
        Scanner qwe=new Scanner(System.in);
        {     //problem  1
             int n=4;
            // int m=qwe.nextInt();
                 for (int i=n; i >0; i--)
                 {
                       for (int j = 0; j<i; j++) {
                        System.out.print( "*");
               }
                     System.out.print("\n");
            }
                 //problem 2
            System.out.println("problem 2");
                 int sum=0;
                 int s=5;
                 for(int z=0;z<s;z++){
                     sum=sum+(2*z);
                 }
            System.out.println(sum);

                 //problem 3
            System.out.println("problem 3");
            int mul=0;
            int x=qwe.nextInt();
            int c;
            for( c=1;c<=10;c++)
            {
                mul=(c*x);
                System.out.println(c+"*"+x+"="+mul);

            }
            //problem 4
            System.out.println("problem 4");
            int mul10=0;
            int b=10;
            int t=10;
            for(t=10;t>=1;t--)
            {
                 mul10=t*b;
                System.out.println(t+"*"+b+"="+mul10);
            }
            //problem 5
            System.out.println("problem 5");
            int qw=qwe.nextInt();
            int factorial=1;
            for(int gh=1;gh<=qw;gh++)
            {
                factorial=(factorial*gh);
            }
            System.out.println(factorial);
            //problem 6
            System.out.println("problem 6");
            int kl=qwe.nextInt();
            int fac=1;
            int lk=1;
            while(lk<=kl)
            {
                fac=fac*lk;
                lk++;
            }
            System.out.println(fac);

            //problem 7
            System.out.println("problem 7");

            //problem 9
            System.out.println("problem 9");
            int sum2=0;
            int gh=1;
            int jk=qwe.nextInt();
            for(gh=1;gh<=10;gh++)
            {
                sum2=sum2+(gh*jk);
            }
            System.out.println(sum2);

            //problem 11
            System.out.println("problem 11");
            int sumo=0;
            int nm=qwe.nextInt();
            for(int mn=0;mn<=nm;mn++)
            {
                sumo=sumo+(2*mn);
            }
            System.out.println(sumo);





        }

    }

}
