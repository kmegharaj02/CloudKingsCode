package coreJavaCloudKingsCode;

public class java28variableArgs {
    static int sum(int z,int ...arr)
    {
        int rs=z;
        for(int gh:arr){
            rs=rs+gh;
        }
        return rs;

    }
    public static void main(String[] args) {
        int a=10,b=20,d=30,c=40;

        System.out.println("sum of a and b is"+sum(a,b));
        System.out.println(sum(b,c));
        System.out.println(sum(c,d));
        System.out.println(sum(a,b,c,d));
        System.out.println(sum(d));

    }
}
