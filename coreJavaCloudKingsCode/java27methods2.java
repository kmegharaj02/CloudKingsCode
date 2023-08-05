package coreJavaCloudKingsCode;

public class java27methods2 {

    static void eng()
    {
        System.out.println("no parameter");

    }
    static void eng(int a,int b)
    {
        System.out.println("two parameters");
    }
    static void change(int y)
    {
        y=55;
    }
    static void tellme(){

        System.out.println("hei");

    }
    static  void  change2(int[] rty)
    {
        rty[2]=45;
    }
    public static void main(String[] args) {
        tellme();
        int a=25;
        change( a);
        System.out.println(a);
        int[] arr={23,45,67,89};
        change2(arr);
        System.out.println(arr[0]);

        System.out.println("method overlodin");
        eng();
        eng(10,20);// arguments are actual





    }
}
