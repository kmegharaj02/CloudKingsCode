package coreJavaCloudKingsCode;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        boolean aa=false;
        boolean bb=false;
        if(aa != bb){
            System.out.println("true");
        }
        else System.out.println("false");

        if(aa ||bb){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(aa && bb){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(!aa);
        System.out.println(!bb);
    }
}
