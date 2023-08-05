package coreJavaCloudKingsCode;

import java.util.Scanner;
public class ConditionalProblems {
    public static void main(String[] args) {
        //question1
      /* int a=10;
        if(a==5)
        {
            System.out.println("mnv");
        }
        else
            System.out.println("wdwd");
    */

        Scanner qwe = new Scanner(System.in);
        //question 2
        /*System.out.println("enter the marks");

        int marks1 = qwe.nextInt();
        int marks2 = qwe.nextInt();
        int marks3 = qwe.nextInt();

        float sum = ((marks1 + marks2 + marks3)/3.0f) ;
       /*float per=(sum/300)*100;
        boolean tyu=(marks1>=33);
        if (tyu)
        {
            System.out.println("marks above 33");
        }
       else if(marks2>33) {
            System.out.println("marks2 is 33");
        }
        else if(marks3>33)
        {
            System.out.println("marks3 above 33");
        }
       else System.out.println("marks less than 33");

         if (sum>=40&&marks1>33&&marks2>33&&marks3>33) {
            System.out.println("pass");

        } else
            System.out.println("fail");
        System.out.println(sum);*/

        //question 3
        float tax=0;
        float income=qwe.nextFloat();
        if(income<=250000){
            System.out.println("payable tax is: "+tax);
        }
        else if(income>250000&&income<=500000)
        {
            System.out.println(tax=tax+(((income-250000)*5)/100f));
        }
        else if(income>500000&&income<=1000000)
        {
            tax=(((500000-250000)*5)/100f);
            System.out.println(tax=tax+(((income-500000)*20)/100f));
        }
        else {
            tax=tax+(((500000-250000)*5)/100f);
            tax=tax+(((1000000-500000)*20)/100f);
            System.out.println(tax=tax+(((income-1000000)*30)/100f));
        }



        //question 4
       /* int day=qwe.nextInt();
        switch (day){
            case 1:
                System.out.println("it's monday");
                break;
            case 2:
                System.out.println("it's tuesday");
                break;
            case 3:
                System.out.println("it's wednesday");
                break;
            case 4:
                System.out.println("it's thursday");
                break;
            case 5:
                System.out.println("it's friday");
                break;
            case 6:
                System.out.println("it's saturday");
                break;
            case 7:
                System.out.println("it's sunday");
                break;
            default:
                System.out.println("not  in a week");
            break;}*/

        //question 5
        float year=qwe.nextInt();
        if(year%4==0&&year%400==0&&year%100==0)
        {
            System.out.println("entered "+year+ "is leap year");

        }
        else
        {
            System.out.println("entered "+year+ " is not a leap year");
        }



        //question 6

       /* String website = qwe.nextLine();
        if (website.contains(".org")) {
            System.out.println("organizational website");
        }
        else if(website.contains(".com")) {
            System.out.println("its a  commertial website");

        }
        else if(website.contains(".in"))
        {
            System.out.println("indaian website");
        }
        else
            System.out.println("normal text not a website");*/
    }
}






