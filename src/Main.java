import org.w3c.dom.ls.LSOutput;

import java.util.DoubleSummaryStatistics;

public class Main {
    public static void main(String[] args) {
        int[] weihts = {64, 65, 66, 67, 65, 68, 69, 0, 0, 0, 0, 0};
        weihts[0] = 65;
        int januaryWei = weihts[0];
        System.out.println(januaryWei);
        System.out.println(weihts[0]);
        System.out.println(weihts[4]);
        int janurt = 0;
        System.out.println(weihts[janurt]);
        for (int i = 0; i < weihts.length; i++) ;


        int[] wei = new int[] {1, 2, 3};
        System.out.print(wei[0] + "," + wei[1] + "," + wei[2]);
        System.out.println();
        System.out.print(wei[2] + "," + wei[1] + "," + wei[0]);


        System.out.println();
        double[] wei1 = {1.57, 7.654, 9.986};
        System.out.println(wei1[0] + "," + wei1[1] + "," + wei1[2]);
        System.out.println(wei1[2] + "," + wei1[1] + "," + wei1[0]);

        int[] numb= new int [3];
        numb [0]=1;
        for (int y=0;y<numb.length;y++) {
            numb[y]=y+1;

            if (numb[y]% 2 == 1) ;
            numb[y]=numb[y]+1;
            System.out.println(numb[y]);
        }
        




    }
}