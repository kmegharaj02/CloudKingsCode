package coreJavaCloudKingsCode;

import java.util.Scanner;
public class StringsBasic {
    public static void main(String[] args) {
        String ty=new String("hrrj");
        String er="fjfj";
        int fg=15;
        char rt='f';
        float vb=45.5896f;
      //  System.out.println(ty+" "+ er);
       // System.out.printf("%d10",fg);
       // System.out.printf( "%c and %s and %d",rt,er,fg);
      //  System.out.printf("%c",er); // string does not fit in char
      //  System.out.printf("%c",fg);  //int fits in char and gives symbols===
       // System.out.printf("%c" ,vb); float doesnt fit in char
    //    System.out.printf("%d" ,er); // string doesnot fit in int
     //  System.out.printf("%d" ,rt); //char doenot fit in int
       //System.out.printf("%d" ,vb); // float doesnot fit in int
      //  System.out.printf("%s", vb);// float fits in string
       // System.out.printf("%s", fg); // int fits in string
       // System.out.format("%d",fg );

        Scanner io=new Scanner(System.in);
       // String kl=new String("jgkk fefg");
        String qw=io.nextLine();
        int gh=io.nextInt();
        System.out.println(qw);
        System.out.println(gh);

    }
}
