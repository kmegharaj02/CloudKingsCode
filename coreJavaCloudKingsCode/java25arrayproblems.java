package coreJavaCloudKingsCode;

public class java25arrayproblems {
    public static void main(String[] args) {
        System.out.println("problem 1");
        float[] as={55.5f,45.5f,47.4f,89.5f,78.7f};
        float sum=0;
        int i;
        for( i=0;i<=as.length-1;i++)
        {
            sum=sum+as[i];
        }
        System.out.println(sum);

        System.out.println("problem 2");
        int[] qw={12,13,14,15,16};
        int g=16;
        boolean is=false;
        for(int ert:qw) {
            if (g == ert) {
                is = true;
                break;
            }
        }
            if (is) {
                System.out.println("present");
            } else {
                System.out.println("not present");
            }

        System.out.println("problem 3");
            int[] marks={50,50,50,50};
            float avg=0;
            for(int qwe:marks)
            {
                avg=avg+qwe;
            }
        System.out.println(avg/marks.length);

        System.out.println("problem 4");
        int[][] se={{1,2,3},{4,5,5}};
        int[][] we={{1,2,3},{4,5,5}};
        int[][] rs={{0,0,0},{0,0,0}};





        System.out.println("problem 5");

        int[] iou={34,35,67,78,89};
       /* for(int e=iou.length-1;e>=0;e--)
        {
            System.out.print(iou[e]);
            System.out.print(" ");
        }
        System.out.println();
        for(int fg:iou){
            System.out.print(fg+" ");
        }*/
        System.out.println();
        int temp;
       // int n=Math.floorDiv(iou.length,2);
        int n=(iou.length/2);
        for(int x=0;x<n;x++)
        {
            temp=iou[x];
            iou[x]=iou[iou.length-x-1];
            iou[iou.length-x-1]=temp;
        }
        for(int kl:iou)
        {
            System.out.print(kl+" ");
        }
        System.out.println();


        System.out.println("problem 6");
        int[] uio={25,35,45,55};
        int max=Integer.MIN_VALUE;
      //  int oiu;
      /*  for( int oiu:uio){
            if(oiu>max){
                max=oiu;
            }
        }*/
        for(int e=0;e<uio.length;e++)
        {if(uio[e]>max)
        {
            max=uio[e];
        }

        }
        System.out.println(max);
        System.out.println("problem 7");
        int[] rt={55,78,98,-45,-78};
            int min=Integer.MAX_VALUE;
            for(int f=0;f<rt.length;f++)
            {
                if(rt[f]<min)
                {
                    min=rt[f];
                }
            }
        System.out.println(min);

        System.out.println("problem 8");
        int[] bv={1,11,9,88,555};
        boolean isSorted=false;
        for(int vb=0;vb<bv.length-1;vb++)
        {
           if( bv[vb]>bv[vb+1])
           {
               isSorted=true;
               break;
           }
        }
        if(isSorted)
        {
            System.out.println(" not sorted");
        }
        else{
            System.out.println("sorted");
        }








    }
}
