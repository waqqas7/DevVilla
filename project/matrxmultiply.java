package project;

import java.util.*;
class matrxmultiply
{   
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int r1,r2,c1,c2,i = 0,j = 0,k = 0;
        System.out.println("Enter the row and column of first array : ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the row and column of second array : ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        if(c1 == r2)
        {
            int c[][] = new int[r1][c2];
            System.out.println("Enter the elements of first array : ");
            for(i = 0;i < r1;i++)
            {
                for(j = 0;j < c2;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of second array : ");
            for(i = 0;i < r1;i++)
            {
                for(j = 0;j < c2;j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
            for(i = 0;i < r1;i++)
            {
                for(j = 0;j < c2;j++)
                {
                   for(k = 0;k < c1;k++)
                    {
                        c[i][j] = c[i][j] + a[i][k]*b[k][j];
                    } 
                }
            }
            
            System.out.println("New matrix : ");
            for(i = 0;i < r1;i++)
            {
                for(j = 0;j < c2;j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

            
        