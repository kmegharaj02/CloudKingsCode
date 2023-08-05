package coreJavaCloudKingsCode;

public class java29problemsMethods {
    static int fib(int f)
    {
        if(f==1||f==2)
        {
            return f-1;
        }
        else {
            return fib(f-1)+fib(f-2);
        }
    }
    static int sum(int q)
    {
        if(q==1)
        {
            return 1;
        }
        else if(q<=0){
            System.out.println("enter above 0");
            return 0;
    }
        else{
            return q+sum(q-1);
        }
    }
    static void mul(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d x %d =%d\n",n,i,n*i);
        }
       // return n=10+5;

    }
    static void pattern2(int p)
    {
        for(int s=p-1;s>=0;s--)
        {
            for(int x=0;x<=s;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int r){
        for(int f=0;f<r;f++){
            for(int g=0;g<f+1;g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("problem 1");
        int w=10;
        mul(w);
        System.out.println("frf");
        w=3;
        mul(w);

        System.out.format("problem 2\n");
        int l=1;
        pattern1(l);

        System.out.println("problem 3");
        int z=0;
        System.out.println( sum(z));

        System.out.println("problem 4");
        int d=5;
        pattern2(d);

        System.out.println("problem 5");
        int h=fib( 5);
        System.out.println(h);

        System.out.println("problem 6");

        System.out.println("problem 7");

        System.out.println("problem 8");












    }
}
