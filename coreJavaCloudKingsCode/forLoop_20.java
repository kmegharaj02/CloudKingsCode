package coreJavaCloudKingsCode;

import java.util.Scanner;
public class forLoop_20 {
    public static void main(String[] args) {
        Scanner rty=new Scanner(System.in);
        int n=rty.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(i);
            i++;
        }
        System.out.println("ert");
        for(int h=1;h<=n;h++)
        {
            System.out.println(h);
            h++;
        }
        System.out.println("break");
        for(int j=0;j<n;j++)
        {
            System.out.println(2*j+1);
            j++;
        }
        System.out.println("hjj");
        for(int k=0;k<n;k++)
        {
            System.out.println(2*k);
        }
        System.out.println("decrement");
        for(int l=5;l>1;l--)
        {
            System.out.println(l);
        }
        System.out.println("reverse");
        for(int e=n;e<=n&&e!=-1;e--)
        {
            System.out.println(e);
        }


    }
}
