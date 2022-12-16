
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;// библ для ввода с клавиатуры
import java.util.*;

public class Main {



        public static boolean check(int[][] a)
        {
            int[] ch=new  int[11];
            int k=1;
            int yy;
            for (int h=0;h<3;h++)
            {
                for (int l=0;l<3;l++)
                {
                    for(int i=h*3;i<3*(h+1);i++)// этажность
                    {
                        for(int j=l*3;j<3*(l+1);j++)
                        {
                            if ( a[i][j] == ch[0]
                                    || a[i][j] == ch[1]
                                    || a[i][j] == ch[2]
                                    || a[i][j] == ch[3]
                                    || a[i][j] == ch[4]
                                    || a[i][j] == ch[5]
                                    || a[i][j] == ch[6]
                                    || a[i][j] == ch[7]
                                    || a[i][j] == ch[8]
                                    || a[i][j] == ch[9]

                            )
                            {
                               // System.out.println(i+","+j+" "+a[i][j]);
                                return false;

                            }
                            ch[k]=a[i][j];
                            k++;
                        }

                    }
                    k=1;
                    Arrays.fill(ch,0);
                }
            }

            Arrays.fill(ch,0);
            k=1;
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    if ( a[i][j] == ch[0]
                            || a[i][j] == ch[1]
                            || a[i][j] == ch[2]
                            || a[i][j] == ch[3]
                            || a[i][j] == ch[4]
                            || a[i][j] == ch[5]
                            || a[i][j] == ch[6]
                            || a[i][j] == ch[7]
                            || a[i][j] == ch[8]
                            || a[i][j] == ch[9]

                    )
                    {
                        return false;
                    }
                    ch[k]=a[i][j];
                    k++;
                }
                Arrays.fill(ch,0);
                k=1;
            }

            Arrays.fill(ch,0);
            k=1;
            for(int j=0;j<9;j++)
            {
                for(int i=0;i<9;i++)
                {
                    if ( a[i][j] == ch[0]
                            || a[i][j] == ch[1]
                            || a[i][j] == ch[2]
                            || a[i][j] == ch[3]
                            || a[i][j] == ch[4]
                            || a[i][j] == ch[5]
                            || a[i][j] == ch[6]
                            || a[i][j] == ch[7]
                            || a[i][j] == ch[8]
                            || a[i][j] == ch[9]

                    )
                    {
                        return false;
                    }
                    ch[k]=a[i][j];
                    k++;
                }
                Arrays.fill(ch,0);
                k=1;
            }


            return true;
        }



    public static <string> void main(String[] args) {


        int[][] a1 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println( check(a1));
    }
}

