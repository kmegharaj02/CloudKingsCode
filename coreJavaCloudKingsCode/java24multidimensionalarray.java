package coreJavaCloudKingsCode;

public class java24multidimensionalarray {
    public static void main(String[] args) {
        int [][] as=new int[2][3];
        as[0][0]=1;
        as[0][1]=2;
        as[0][2]=3;
        as[1][0]=4;
        as[1][1]=5;
        as[1][2]=6;
        System.out.println(as[1][1]);

        for(int i=0;i<=as.length-1;i++)
        {
            for(int j=0;j<=as[i].length-1;j++) {
                System.out.print(as[i][j]);
                System.out.print(" ");
            }

        System.out.println();}


    }
}
