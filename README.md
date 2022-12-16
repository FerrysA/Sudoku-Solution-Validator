# Sudoku-Solution-Validator
# 16.12.2022
# [cылка на задание](https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java)
# Код:
```java
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class SudokuValidator {
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

}

```
# понравивщееся решение:(автор olegkovtun)
``` java
public class SudokuValidator {
    public static boolean check(int[][] sud) {
        for (int i=0; i<9; i++) {
            int col = 0, row = 0, block = 0;
            for (int j=0; j<9; j++) {
                col += Math.pow(2, sud[i][j]);
                row += Math.pow(2, sud[j][i]);
                block += Math.pow(2, sud[3*i%3+j%3][j/3]);
            }
            if (col != 1022 || row != 1022 || block != 1022) return false;
        }
        return true;
    }
}
