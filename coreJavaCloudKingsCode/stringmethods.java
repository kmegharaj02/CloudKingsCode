package coreJavaCloudKingsCode;

public class stringmethods {
    public static void main(String[] args) {
        String ert="Megharaj K";
        System.out.println(ert);
        int digit=ert.length();
        System.out.println(digit);

        String lower=ert.toLowerCase();
        System.out.println(lower);

        String upper=ert.toUpperCase();
        System.out.println(upper);
        System.out.println(ert.toUpperCase());

        String trimmed=ert.trim();
        System.out.println(trimmed);
        System.out.println(ert.trim());

        String sub=ert.substring(3);
        System.out.println(sub);
        System.out.println(ert.substring(5));

        String subs=ert.substring(5,7);
        System.out.println(subs);
        System.out.println(ert.substring(5,7));

        String rep=ert.replace('g','r');
        System.out.println(rep);
        System.out.println(ert.replace("g","ijk"));

      // char start=ert.startsWith('H');
      //  System.out.println(start);
        System.out.println(ert.startsWith(" "));

        System.out.println(ert.endsWith(" "));


        char ind=ert.charAt(8);
        System.out.println(ind);
        System.out.println(ert.charAt(7));

      //  char inds=ert.indexOf("Hg");
        System.out.println(ert.indexOf("j"));

        System.out.println(ert.indexOf("f",1));

        System.out.println(ert.lastIndexOf("f"));

        System.out.println(ert.lastIndexOf("f",7));

        System.out.println(ert.equals("Megha"));
        System.out.println(ert.equalsIgnoreCase("megharaj k"));


        System.out.println("Megharaj \n K");
        System.out.println("Megharaj \t K");
        System.out.println("Megharaj \f K");
        System.out.println("Megharaj \r K");
        System.out.println("\"Megharaj K \" ");















































    }
}
