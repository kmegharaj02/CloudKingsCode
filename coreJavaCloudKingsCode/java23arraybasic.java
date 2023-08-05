package coreJavaCloudKingsCode;

import java.util.Scanner;
public class java23arraybasic {
    public static void main(String[] args) {
        int[] age=new int[5];
        age[0]=10;
        age[1]=10;
        age[2]=10;
        age[3]=10;
        age[4]=10;
       // age[5]=10;
        System.out.println(age[4]);

        int [] age2={20,30,40,50};
        System.out.println(age2[3]);

        String [] fgh=new String[2];
        fgh[1]="dfg";
        fgh[0]="rtt";
        System.out.println(fgh[1]);

        String [] hg={"ffefeg","frfr","efef"};
        System.out.println(hg[2]);

        System.out.println(hg.length);

        char[] a=new char[2];
        a[0]='a';
        a[1]='v';
        System.out.println(a[1]);
        System.out.println("reverse otder");

        for(int i=hg.length-1;i>=0;i--)
        {
            System.out.println(hg[i]);
        }
        System.out.println("normal oer");
        for(int j=0;j<=hg.length-1;j++)
        {
            System.out.println(hg[j]);
        }
        System.out.println("for each");
        for(String es:hg){
            System.out.println(es);
        }


        Scanner jk=new Scanner(System.in);
        int[] io=new int[5];
        io[0]=jk.nextInt();
        io[1]=jk.nextInt();
        io[2]=jk.nextInt();
        io[3]=jk.nextInt();
        io[04]=jk.nextInt();
       System.out.println(io[3]);

       for(int l=0;l<=io.length-1;l++)
       {
           System.out.println(io[l]);
       }






    }
}
