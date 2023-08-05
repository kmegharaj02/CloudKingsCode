package coreJavaCloudKingsCode;

public class java28Recurssion {
    static int fact(int x)
    {
        if(x==0||x==1)
        {
            return 1;
        }
        else {
            return x*fact(x-1);
        }
    }

    static int fact_iterative(int q)
    {
        if(q==0||q==1)
        {
            return 1;
        }
        else{
            int fi=1;
            for(int i=1;i<=q;i++)
            {
                fi=fi*i;
            }
           return fi;
        }
    }

    static int fibonacci(int e)
    {

        int p=0,n=1,r=0;
        for(int k=0;k>=e;k++)
        {
            System.out.print(p+" ");
            r=p+n;
           p=n;
           n=r;

        }
        return n;

    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(fact(a));
        System.out.println(fact_iterative(a));
        System.out.println(fibonacci(a));

    }
}
